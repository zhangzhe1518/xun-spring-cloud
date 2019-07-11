package com.xun.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableDiscoveryClient 如果选用的注册中心是Eureka推荐使用@EnableEurekaClient,否则推荐使用@EnableDiscoveryClient
 * @EnableFeignClients 开启Feign功能
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class XunCloudFeignUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunCloudFeignUserApplication.class, args);
    }

}
