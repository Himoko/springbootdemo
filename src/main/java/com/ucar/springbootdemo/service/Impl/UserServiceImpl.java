package com.ucar.springbootdemo.service.Impl;

import com.ucar.springbootdemo.dao.UserDao;
import com.ucar.springbootdemo.pojo.Result;
import com.ucar.springbootdemo.pojo.User;
import com.ucar.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hellovue
 * @description: user类服务
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-07-23 16:47
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result selectUserById() {
        Result result = new Result();
        List<User> list = userDao.selectUserById();
        result.setDataList(list);
        result.setCode(200);
        return result;
    }
}
