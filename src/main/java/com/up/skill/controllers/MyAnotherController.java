package com.up.skill.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nxtlvl on 11/16/2016.
 */
@Controller
public class MyAnotherController {
    @RequestMapping(value = "/ako",method = RequestMethod.GET)
    public String loadWebPage(){
        return "redirect:/thankyou?className=divColor&className2=divColor2  ";
    }
    @RequestMapping(value = "/thankyou",method = RequestMethod.GET)
    public String loadwelcome(){
        return "myAnotherView/index";
    }
}
