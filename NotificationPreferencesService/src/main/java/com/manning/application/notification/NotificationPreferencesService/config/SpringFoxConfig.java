package com.manning.application.notification.NotificationPreferencesService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import static springfox.documentation.builders.PathSelectors.any;

@Configuration
@EnableSwagger2
@EnableWebMvc
@Import(SpringDataRestConfiguration.class)
public class SpringFoxConfig {

    /***********+ URL de Swagger: http://localhost:8081/swagger-ui/index.html *************/
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.manning.application.notification.NotificationPreferencesService"))
                .paths(any())
                .build()
                .apiInfo(new ApiInfo("Notification Preferences API",
                        "API's for the Notification Preferences app", "2.0", null,
                        null,null,
                        null));
    }
}
