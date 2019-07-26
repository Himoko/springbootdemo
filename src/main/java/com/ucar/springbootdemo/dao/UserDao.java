package com.ucar.springbootdemo.dao;

import com.ucar.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: hellovue
 * @description: 用户类dao
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-07-23 16:44
 */

@Mapper
public interface UserDao {
    List<User> selectUserById();
}
