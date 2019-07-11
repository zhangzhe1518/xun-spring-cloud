package com.xun.user.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhangzhe
 * @Date 2019/7/11 10:50
 */
@Data
public class UserResult implements Serializable {

    private String userName;

    private int age;

    private Date birthday;
}
