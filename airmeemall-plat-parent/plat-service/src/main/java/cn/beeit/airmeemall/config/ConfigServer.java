package cn.beeit.airmeemall.config;/*
 * @Author li zhen qiang
 * @Description: 配置类
 * @Date 2019/1/27
 * @Version 1.0
 * @ClassName: ConfigServer
 **/

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootConfiguration
@EnableSwagger2
public class ConfigServer {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.beeit.airmeemall.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("平台服务API")
                .description("平台服务接口文档说明")
                .contact(new Contact("lzq", "222", "306845933@qq.com"))
                .version("1.0")
                .build();
    }
}
