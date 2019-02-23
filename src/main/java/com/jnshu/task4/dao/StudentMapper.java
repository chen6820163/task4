package com.jnshu.task4.dao;

import com.jnshu.task4.common.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    Student selectByPrimaryKey(Integer id);
    List<Student> selectAll();
    Integer countByStatus();
    Integer countAll();
}