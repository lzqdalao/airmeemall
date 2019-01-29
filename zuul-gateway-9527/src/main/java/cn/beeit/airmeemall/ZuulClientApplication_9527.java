package cn.beeit.airmeemall;/*
 * @Author li zhen qiang
 * @Description: 网管启动类
 * @Date 2019/1/26
 * @Version 1.0
 * @ClassName: ZuulClientApplication_9527
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulClientApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulClientApplication_9527.class,args);
    }
}
