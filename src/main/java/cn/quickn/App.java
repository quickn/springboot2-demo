package cn.quickn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("cn.quickn.demo.dao")
@ComponentScan(basePackages = {
        "cn.quickn.demo.controller",
        "cn.quickn.demo.service.impl",
        "cn.quickn.demo.config"
})
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
