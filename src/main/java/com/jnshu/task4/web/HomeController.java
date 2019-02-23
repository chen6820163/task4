package com.jnshu.task4.web;

import com.jnshu.task4.common.bean.Student;
import com.jnshu.task4.service.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: task4
 * @description:
 * @author: Mr.Chen
 * @create: 2019-02-20 23:00
 * @contact:938738637@qq.com
 **/
@Controller
public class HomeController {
    @Autowired
    IStudentService studentService;

    @RequestMapping("home")
    public String home(Model model) {
        List<Student> students = studentService.selectALl();
        Integer total = studentService.countAll();
        Integer goodNum = studentService.countByStatus();
//        System.out.println(total);
//        System.out.println(goodNum);
        model.addAttribute("total",total);
        model.addAttribute("goodNum",goodNum);
        model.addAttribute("students",students);
        return "test1";
    }
}
