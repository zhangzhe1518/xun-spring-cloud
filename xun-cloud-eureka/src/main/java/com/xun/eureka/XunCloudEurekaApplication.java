package com.xun.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @SpringBootApplication 表示这是一个SpringBoot项目
 * @EnableEurakaServer 表示这是一个Eureka服务
 */
@SpringBootApplication
@EnableEurekaServer
public class XunCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunCloudEurekaApplication.class, args);
    }

}
