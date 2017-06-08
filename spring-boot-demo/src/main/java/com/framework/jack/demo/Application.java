package com.framework.jack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jack
 */
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("启动开始...");
        SpringApplication.run(Application.class, args);
        System.out.println("启动完成...");
        System.out.println("本次启动共花费：" + (System.currentTimeMillis() - startTime));
    }

}
