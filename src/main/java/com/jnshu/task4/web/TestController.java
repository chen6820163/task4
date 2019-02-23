package com.jnshu.task4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: task4
 * @description:
 * @author: Mr.Chen
 * @create: 2019-02-18 16:31
 * @contact:938738637@qq.com
 **/
@Controller
public class TestController {
    @RequestMapping("test1")
    public String test1() {
        return "1";
    }

    @RequestMapping("test2")
    public String test2() {
        return "career";
    }

    @RequestMapping("test3")
    public String test3() {
        return "home";
    }
    @RequestMapping("test4")
    public String test4() {
        return "test1";
    }

    @RequestMapping("test5")
    public String test5() {
        return "14";
    }
}
