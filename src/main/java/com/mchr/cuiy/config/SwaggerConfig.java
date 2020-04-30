package com.mchr.cuiy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) //api的标题、描述、版本等信息
                .groupName("express-material-api") //接口模块名称
                .select()   // 选择那些路径和api会生成document
                .apis(RequestHandlerSelectors
                        .basePackage("com.mchr.cuiy.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后台管理RESTful API")
                .termsOfServiceUrl("http://localhost:8070/")
                .description("此API提供接口调用")
                .license("License Version 1.0")
                .version("1.0").build();
    }
}
