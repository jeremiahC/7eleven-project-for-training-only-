package com.up.skill.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by nxtlvl on 11/16/2016.
 */
@Entity
public class MyFormModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Please Enter Name")
    @Size(min=4, max=10)
    private String name;

    @Email
    @NotEmpty(message = "Please Enter Email")
    @Pattern(regexp = ".+@.+\\.[a-z]+",message = "Please input valid Email")
    @Column(name = "email", unique = true)
    private String email;


    @DateTimeFormat(pattern = "mm/dd/yyyy")
    @Column(name = "date")
    private Date date;

    @PrePersist
    private void onCreate(){date = new Date();}

//    public MyFormModel(String name, String email){
//        this.name = name;
//        this.email = email;
//    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
