package com.chenmo.swaggerdubbodemoserver;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDubbo
@DubboComponentScan(basePackages = { "com.chenmo.swaggerdubbodemoserver.serivce.impl" })
public class SwaggerDubboDemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDubboDemoServerApplication.class, args);
    }

}
