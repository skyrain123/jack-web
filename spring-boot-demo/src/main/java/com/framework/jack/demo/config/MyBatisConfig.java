package com.framework.jack.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置
 *
 * @author jack
 */
@Configuration
@MapperScan("com.framework.jack.demo.mapper")
public class MyBatisConfig {
}
