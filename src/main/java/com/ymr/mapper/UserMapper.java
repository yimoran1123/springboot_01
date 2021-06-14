package com.ymr.mapper;

import com.ymr.dto.PageQuery;
import com.ymr.pojo.User;
import com.ymr.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: YMR
 * @date: 2021-05-16 01:56
 **/
//@Mapper
public interface UserMapper {

   // @Select("select * from user where id =#{id}")
    User getById(int id);

    void add(User user);

    List<User> getByName(String name);

    UserVO getByIdVo(int id);

    List<User> getAll(PageQuery pageQuery);
}
