package com.xun.order.param;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhangzhe
 * @Date 2019/7/11 11:24
 */
@Data
public class OrderParam implements Serializable {

    private String orderId;

    private Date orderTime;

    //order来源
    private String orderSource;

}
