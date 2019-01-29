package cn.beeit.airmeemall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * @Author li zhen qiang
 * @Description: Eureka注册中心启动类
 * @Date 2019/1/26
 * @Version 1.0
 * @ClassName: EurekaServerApplication_7001
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class,args);
    }
}
