package com.ymr.vo;

import com.ymr.pojo.User;
import lombok.Data;

/**
 * @description:
 * @author: YMR
 * @date: 2021-05-17 20:25
 **/
@Data
public class UserVO {
    private int idVo;
    private String nameVo;
    private String gender;
    private String emailVo;

    private User user;
}
