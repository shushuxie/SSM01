package com.bjpowernode.controller;

import com.bjpowernode.domain.User;
import com.bjpowernode.service.UserService;
import com.bjpowernode.util.GeneralTools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author 谢树树
 * @date 16/11/2021 下午10:56
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("login.do")
    public ModelAndView studentRegister(User user){
        String tips ="注册失败";
        ModelAndView mv = new ModelAndView();
        //密码进行加密
        user.setPassword(GeneralTools.getMD5Str(user.getPassword()));
        //调用service处理学生对象
       int nums = userService.signInUser(user);
        if(nums > 0){
            tips = "学生"+user.getName()+"注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }


}
