package cn.beeit.airmeemall;/*
 * @Author li zhen qiang
 * @Description:
 * @Date 2019/1/27
 * @Version 1.0
 * @ClassName: PlatServiceApplication_8001
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication_8001.class,args);
    }
}
