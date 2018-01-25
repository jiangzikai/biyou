package com.kaihang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author <a href="mailto:3061846560@qq.com">ZiKai Jiang</a>
 * 主页面控制器
 */
@Controller
public class IndexController {
    /**
     * index页跳转
     */
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("index");
    }
}
