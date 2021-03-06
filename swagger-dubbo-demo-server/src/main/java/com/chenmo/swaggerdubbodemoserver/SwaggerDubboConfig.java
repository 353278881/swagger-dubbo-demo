package com.chenmo.swaggerdubbodemoserver;

import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: swagger-dubbo-demo
 * @description:
 * @author: zhaochen
 * @create: 2020-03-29 23:50
 **/
@Configuration
@EnableDubboSwagger
public class SwaggerDubboConfig implements WebMvcConfigurer {
}
