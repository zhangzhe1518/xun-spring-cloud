package com.xun.user.service.impl;

import com.xun.user.result.UserResult;
import com.xun.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author zhangzhe
 * @Date 2019/7/11 10:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResult getUserInfo(String userName) {
        UserResult userResult = new UserResult();
        userResult.setUserName("寻");
        userResult.setAge(20);
        userResult.setBirthday(new Date());
        return userResult;
    }
}
