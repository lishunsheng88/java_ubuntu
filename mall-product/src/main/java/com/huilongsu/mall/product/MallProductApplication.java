package com.huilongsu.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.整合Mybatis-Plus
 *     1）.导入依赖
 *     <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *     </dependency>
 *     2).配置
 *         1.配置数据源
 *             1).导入数据库驱动
 *             2).在application.yml配置数据源相关信息
 *         2.配置MyBatis-Plus：
 *             1).使用@mapperScan
 *             2).
 */
@MapperScan("com.huilongsu.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
