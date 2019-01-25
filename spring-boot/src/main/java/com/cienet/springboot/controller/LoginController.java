package com.cienet.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String toLogin(@RequestParam("username") String username, @RequestParam("password") String password,
                          Map<String, String> msg, HttpSession session, HttpServletRequest request) {
        if ((!StringUtils.isEmpty(username)) && (!StringUtils.isEmpty(password)) && "123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }
        request.setAttribute("msg", "Password is Error");

        return "index";
    }

}
