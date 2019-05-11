package com.yzq.edu.web.controller;

import com.yzq.edu.model.User;
import com.yzq.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("find")
    public String find(Integer id){
        User user = iUserService.findById(id);
        System.out.println(user);
        return "user/UserManage";
    }

    @RequestMapping("manage")
    public String manage(){
        return "user/UserInfo";
    }


}
