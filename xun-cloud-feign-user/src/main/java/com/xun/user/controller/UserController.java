package com.xun.user.controller;

import com.xun.user.param.UserParam;
import com.xun.user.result.UserResult;
import com.xun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangzhe
 * @Date 2019/7/11 10:39
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfo/{userName}")
    public UserResult getUserInfo(@PathVariable String userName){
        Assert.notNull(userName,"用户名不能为空！");
        return userService.getUserInfo(userName);
    }
}
