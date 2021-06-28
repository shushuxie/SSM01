package com.bjpowernode.service.impl;/**
 * TODO
 *
 * @author 谢树树
 * @date 20/1/2021 下午9:02
 */

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
 * TODO
 *20/1/2021 下午9:02
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
   private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
       int nums = studentDao.addStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryAllStudent() {
        List<Student> list =studentDao.queryAllStudent();
        return list;
    }

    @Override
    public int updateStudent(int id, Student student) {
        return 0;
    }

    @Override
    public int deleteStudent(int id) {
        int result = studentDao.deleteStudent(id);
        return result;
    }
    @Transactional
    @Override
    public void transactionTest(int id, Student student) {
        System.out.println("开始执行·······");
        studentDao.deleteStudent(id);
        System.out.println(1/0);
        studentDao.addStudent(student);
        System.out.println("执行结束");

    }


}
