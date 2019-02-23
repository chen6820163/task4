package com.jnshu.task4.service.impl;

import com.jnshu.task4.common.bean.Student;
import com.jnshu.task4.dao.StudentMapper;
import com.jnshu.task4.service.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: task4
 * @description:
 * @author: Mr.Chen
 * @create: 2019-02-20 22:50
 * @contact:938738637@qq.com
 **/
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student selectCareerById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public List<Student> selectALl() {
        List<Student> students = studentMapper.selectAll();
        return students;
    }

    @Override
    public Integer countByStatus() {
        Integer i = studentMapper.countByStatus();
        return i;
    }

    @Override
    public Integer countAll() {
        Integer i = studentMapper.countAll();
        return i;
    }
}
