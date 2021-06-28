package com.bjpowernode.controller;/**
 * TODO
 *
 * @author 谢树树
 * @date 20/1/2021 下午9:33
 */
import com.bjpowernode.domain.Student;
import com.bjpowernode.ov.Animal;
import com.bjpowernode.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * TODO
 *
 *20/1/2021 下午9:33
 */
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
}
