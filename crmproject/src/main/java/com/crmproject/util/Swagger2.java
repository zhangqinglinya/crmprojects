package com.crmproject.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.huayu.student.controller"})
@EnableWebMvc
public class Swagger2 extends WebMvcConfigurationSupport {
    @Bean
    public Docket customDocket() {
        //
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("林哥", "http://127.0.0.1:8080/static/swagger/dist/index.html", "2423468236@qq.com");
        return new ApiInfo("学生管理前台API接口",//大标题 title
                "学生管理测试controller",//小标题
                "0.0.1",//版本
                "www.baidu.com",//termsOfServiceUrl
                contact,//作者
                "Blog",//链接显示文字
                "http://127.0.0.1:8080/static/swagger/dist/index.html"//网站链接
        );

    }
}
