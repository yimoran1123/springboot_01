package com.ymr.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ymr.dto.PageQuery;
import com.ymr.pojo.User;
import com.ymr.service.UserService;
import com.ymr.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: YMR
 * @date: 2021-05-14 22:42
 **/
@ResponseBody
@Controller
public class UesrController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello nihao";
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "hello java";
    }
    @RequestMapping("/hello3")
    public String hello3(){
        return "hello java3";
    }

    @RequestMapping("/master")
    public String master(){
        return "免密登陆";
    }

  /*  public static void main(String[] args) {
        System.out.println(UesrController.class);
    }
*/

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") int id){
      return userService.getById(id);
    }

    @GetMapping("/uservo/{id}")
    public UserVO getByIdVo(@PathVariable("id") int id){
        return userService.getByIdVo(id);
    }

    @PostMapping("/user")
    public List<User> getByName(@RequestParam String name){
        return (List<User>) userService.getByName(name);
    }

    @PostMapping("/user/add")
    public void add(@RequestBody User user){
         userService.add(user);
    }

    @GetMapping("/user")
    public PageInfo<User> getAll(@RequestParam(defaultValue = "1") int pageNum,
                                 @RequestParam(defaultValue = "3") int pageSize,
                                  PageQuery pageQuery){
       return userService.getAll(pageNum,pageSize,pageQuery);
    }






}
