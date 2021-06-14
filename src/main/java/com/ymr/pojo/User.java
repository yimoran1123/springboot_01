package com.ymr.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @description:
 * @author: YMR
 * @date: 2021-05-16 02:03
 **/
@Data
public class User implements Serializable {

    private int id;
    private String name;
    private String sex;
    private String email;

    public User() {

    }

    public User(int id, String name, String sex, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
}
