package com.up.skill.controllers;


import com.google.gson.Gson;

import com.up.skill.models.FormResponse;
import com.up.skill.models.MyFormModel;
import com.up.skill.models.MyFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.Writer;


/**
 * Created by nxtlvl on 11/14/2016.
 */
@Controller
public class SevenElevenController {

    private MyFormRepository myFormRepository;

    @Autowired
    public SevenElevenController(MyFormRepository myFormRepository){
        this.myFormRepository = myFormRepository;
    }

    @RequestMapping(value= "/main", method = RequestMethod.GET)
    public String loadHomePage(){ return "/main/index"; }



    @RequestMapping(value= "/post", method = RequestMethod.POST)

    public void signUpForm(@ModelAttribute @Valid MyFormModel form, BindingResult bindingResult, HttpServletResponse resp){


                try{
                    FormResponse formResponse = new FormResponse();

                    Writer w = resp.getWriter();
                    Gson gson = new Gson();

                    if(bindingResult.hasErrors()){
                        formResponse.setHasErrors(true);
                        for(int i=0; i< bindingResult.getErrorCount();i++) {
                            formResponse.setErrors(bindingResult.getAllErrors());
                        }
                        String json = gson.toJson(formResponse);
                        resp.setContentType("application/json");
                        w.write(json);

                    }else{
                        myFormRepository.save(form);
                        formResponse.setFullname(form.getName());
                        formResponse.setEmail(form.getEmail());
                        String json = gson.toJson(formResponse);
                        resp.setContentType("application/json");
                        w.write(json);
                    }
                }catch (Exception e){

                }
            }

}
