package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * TODO
 * @author 谢树树
 * @date 20/1/2021 下午9:00
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryAllStudent();
    int updateStudent(int id,Student student);
    int deleteStudent(int id);
    void transactionTest(int id,Student student);

}
