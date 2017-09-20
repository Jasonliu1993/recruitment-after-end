package com.jason.recruitment.controllers;

import com.jason.recruitment.annotation.Authentication;
import com.jason.recruitment.domain.Message;
import com.jason.recruitment.domain.UserAdmin;
import com.jason.recruitment.exception.StatusCode;
import com.jason.recruitment.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Jason on 17/09/2017.
 */

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @Authentication
    @GetMapping(value = "/authenticate")
    Message getUserAdmin(String id) {
        Message<UserAdmin> message = new Message<UserAdmin>();

        message.setCode(StatusCode.SUCCESS_CODE.getCode());
        message.setMessage(StatusCode.SUCCESS_CODE.getMessage());
        message.setData(loginService.getUserAdmin(Integer.parseInt(id)));

        return message;
    }

}
