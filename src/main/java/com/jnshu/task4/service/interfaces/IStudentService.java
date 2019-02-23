package com.jnshu.task4.service.interfaces;

import com.jnshu.task4.common.bean.Student;

import java.util.List;

public interface IStudentService {
    Student selectCareerById(Integer id);
    List<Student> selectALl();
    Integer countByStatus();
    Integer countAll();
}
