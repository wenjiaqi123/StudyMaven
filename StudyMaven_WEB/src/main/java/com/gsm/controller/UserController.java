package com.gsm.controller;

import com.gsm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/selectUser")
    @ResponseBody
    public Map<String, Object> selectUser() {
        Map<String, Object> map = userService.selectUser();
        return map;
    }
}
