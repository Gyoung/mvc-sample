package com.gyoung.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zengjiyang on 2017/2/9.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public ModelAndView ToIndex(HttpServletRequest request, Model model) {
        ModelAndView view = new ModelAndView("/home/index");
        return view;
    }
}
