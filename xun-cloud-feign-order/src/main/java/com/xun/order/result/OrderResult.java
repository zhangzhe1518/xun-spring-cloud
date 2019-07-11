package com.xun.order.result;

import lombok.Data;

import java.util.Date;

/**
 * @Author zhangzhe
 * @Date 2019/7/11 13:35
 */
@Data
public class OrderResult {

    private String orderId;

    private Date orderTime;

    //order来源
    private String orderSource;
}
