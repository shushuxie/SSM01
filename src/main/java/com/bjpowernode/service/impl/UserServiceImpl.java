package com.bjpowernode.service.impl;

import com.bjpowernode.dao.UserMapper;
import com.bjpowernode.domain.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author 谢树树
 * @date 16/11/2021 下午10:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int signInUser(User user) {

        return userMapper.signInUser(user);
    }
}
