package com.jnshu.task4.dao;

import com.jnshu.task4.common.bean.Career;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class CareerMapperTest {

    @Autowired
    CareerMapper careerMapper;
    @Test
    public void selectByPrimaryKey() {
        Career career = careerMapper.selectByPrimaryKey(1);
        System.out.println(career);
    }

    @Test
    public void selectAll() {
        List<Career> careers = careerMapper.selectAll();
        for (Career c:careers
             ) {
            System.out.println(c);
        }
    }

}