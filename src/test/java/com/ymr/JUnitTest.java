package com.ymr;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


/**
 * @description:
 * @author: YMR
 * @date: 2021-05-16 00:58
 **/
@Slf4j
@SpringBootTest
public class JUnitTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
     void get(){
        Long maps = jdbcTemplate.queryForObject("SELECT count(*) FROM student",Long.class);
//        log.info(String.valueOf(maps));
        System.out.println(maps);
    }

    @Test
    void set(){
        Integer[] arr={1,5,2,90,6,-9,-6,6};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void get3(){
      /*  String s=null;
        System.out.println(s.length());*/

       /* String a="";
        System.out.println(a.length());*/

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


    }
}
