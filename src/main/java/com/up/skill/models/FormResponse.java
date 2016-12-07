package com.up.skill.models;

import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * Created by nxtlvl on 11/28/2016.
 */
public class FormResponse {

    boolean hasErrors;
    List<ObjectError> errors;
    String fullname;
    String email;

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public List<ObjectError> getErrors() {
        return errors;
    }

    public void setErrors(List<ObjectError> errors) {
        this.errors = errors;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
