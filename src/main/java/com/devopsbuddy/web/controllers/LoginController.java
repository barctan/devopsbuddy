package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Artan on 02/03/2017.
 */
@Controller
public class LoginController {

    /** The login view name*/
    public static final String LOGIN_VIEW_NAME="user/login";

    @RequestMapping("/login")
    public String loging(){

        return LOGIN_VIEW_NAME;
    }
}
