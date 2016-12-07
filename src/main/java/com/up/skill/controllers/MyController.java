package com.up.skill.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nxtlvl on 11/16/2016.
 */
@Controller
public class MyController {
    @RequestMapping(value = "/helloWorld", method = RequestMethod.POST)
    public String loadWebpage(){
        return "myView/index";
    }
}
