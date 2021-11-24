package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import java.util.List;

public interface StudentDao {
    int addStudent(Student student);
    List<Student> queryAllStudent();
    int updateStudent(int id,Student student);
    int deleteStudent(int id);
}
