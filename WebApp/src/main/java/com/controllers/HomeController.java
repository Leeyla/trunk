package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author leyla
 * @since 03.12.16
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/"}, method = {RequestMethod.GET})
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping(value = "/protected**", method = RequestMethod.GET)
    public ModelAndView protectedPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("protected");
        return modelAndView;
    }
}
