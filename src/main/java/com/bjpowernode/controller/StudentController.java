package com.bjpowernode.controller;/**
 * TODO
 *
 * @author 谢树树
 * @date 20/1/2021 下午9:33
 */
import com.bjpowernode.domain.HtmlForm;
import com.bjpowernode.domain.Student;
import com.bjpowernode.ov.Animal;
import com.bjpowernode.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Controller
public class StudentController {
    @Resource
    private StudentService service;
    @RequestMapping("register.do")
    public ModelAndView studentRegister(Student student){
        String tips ="注册失败";
        ModelAndView mv = new ModelAndView();
    //调用service处理学生对象
     int nums = service.addStudent(student);
     if(nums > 0){
         tips = "学生"+student.getSname()+"注册成功";
     }
     mv.addObject("tips",tips);
     mv.setViewName("result");
     return mv;
    }
    @RequestMapping("/download.do")
    public void downlodaSomeThing(HttpServletResponse response) throws IOException {
        //下载到浏览器的文件可以是本地文件，使用输入流得到文件然后输出
        //也可能是数据库文件，变为byte数组然后写出去。
        response.setContentType("text/plain");
        //Content-Disposition 告诉浏览器下载的是文件，后面跟上文件名
        //文件名进行编码，防止中文乱码
        response.addHeader("Content-Disposition", "attachment;filename="+new String( "中文".getBytes("utf-8"), "ISO8859-1" )+".txt");
        OutputStream out = response.getOutputStream();
        String str = "你好，响应下载";
        byte[] bytes = str.getBytes();
        out.write(bytes);
        out.flush();
        out.close();
    }


    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List queryStudent(){
        PageHelper.startPage(1,3);
        List<Student> list = service.queryAllStudent();
        return list;
    }
    @RequestMapping(value = "test01.do",method = RequestMethod.POST)
    public void testObjectAsParam(Animal animal){
        System.out.println(animal.getAge());
        System.out.println(animal.getName());
    }


    @RequestMapping("transaction.do")
    public String testTransaction(int id,Student student){
        service.transactionTest(id,student);
        return "delResult";
    }
    @RequestMapping("delete.do")
    public String deleteStudent(int id){
        service.deleteStudent(id);
        return "delResult";
    }

    @RequestMapping("/form.do")
    public void formTest(HtmlForm form){
        System.out.println(form.toString());

    }
    @RequestMapping("/ajax.do")
    @ResponseBody
    public void ajaxTest(HtmlForm form, Model model){
        System.out.println(form.toString());
        model.addAttribute("data","halloAjax");
    }

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
       //jdbc连接数据库测试
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://36.41.175.231:5000/317friend","root","123");
        System.out.println("数据库连接对象="+connection);

    }
    static class MyRunnable implements Runnable{
        boolean run = true;
        int i = 0;
        @Override
        public void run() {
          for(int i=0;i<100;i++){
              System.out.println("支线程"+i);
              for(int m=0;m<100;m++){
                  System.out.println("支线程"+i+"内循环"+m);
              }
          }
        }

    }


}
