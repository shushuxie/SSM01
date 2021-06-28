package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import java.util.List;

/**
 * TODO
 *
 * @author 谢树树
 * @date 20/1/2021 下午8:55
 */
public interface StudentDao {
    int addStudent(Student student);
    List<Student> queryAllStudent();
    int updateStudent(int id,Student student);
    int deleteStudent(int id);
}
