package com.jnshu.task4.web;

import com.jnshu.task4.common.bean.Career;
import com.jnshu.task4.service.interfaces.ICareerService;
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
public class CareerrController {
    @Autowired
    ICareerService careerService;

    @RequestMapping("career")
    public String getCareers(Model model) {
        List<Career> careers = careerService.selectALl();
//        for (Career c: careers
//             ) {
//            System.out.println(c);
//        }
        model.addAttribute("careers",careers);
        return "test";
    }

    @RequestMapping("careertest")
    public String getCareers1(Model model) {
        List<Career> careers = careerService.selectALl();
        model.addAttribute("careers",careers);
        return "body/career";
    }

}
