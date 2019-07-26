package com.ucar.springbootdemo.controller;


import com.ucar.springbootdemo.pojo.Result;
import com.ucar.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hellovue
 * @description: 测试MySQL连接
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-07-23 16:42
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    public Result getUserList(){
        Result result = userService.selectUserById();
        return result;
    }
}
