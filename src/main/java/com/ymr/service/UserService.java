package com.ymr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ymr.dto.PageQuery;
import com.ymr.mapper.UserMapper;
import com.ymr.pojo.User;
import com.ymr.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: YMR
 * @date: 2021-05-16 01:57
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User getById(int id) {
        return userMapper.getById(id);
    }

    public void add(User user) {
         userMapper.add(user);
    }

    public List<User> getByName(String name) {
        return (List<User>) userMapper.getByName(name);
    }

    public UserVO getByIdVo(int id) {
        return userMapper.getByIdVo(id);
    }

    public PageInfo<User> getAll(int pageNum, int pageSize, PageQuery pageQuery) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.getAll(pageQuery);
        PageInfo<User> pageInfo=new PageInfo<>(userList);
        return pageInfo;

    }
}
