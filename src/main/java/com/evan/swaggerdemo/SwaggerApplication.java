package com.evan.swaggerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/08/30 12:27
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.evan.swaggerdemo.dao"}) //扫描DAO
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.evan.swaggerdemo.SwaggerApplication.class, args);
    }

}
