package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * TODO
 *
 * @author 谢树树
 * @date 20/1/2021 下午9:16
 */

public class Test01 {
    @Autowired
    private StudentService studentService;

    @Test
    public void testService(){
        System.out.println(studentService);
    }

}
