package com.xun.user.param;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhangzhe
 * @Date 2019/7/11 10:42
 */
@Data
public class UserParam implements Serializable {

    private String userName;

    private int age;

    private Date birthday;

}
