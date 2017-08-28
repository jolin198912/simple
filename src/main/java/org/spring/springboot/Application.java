package org.spring.springboot;

import java.util.concurrent.TimeUnit;

import org.mybatis.spring.annotation.MapperScan;
import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("org.spring.springboot.dao")
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
    
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
    	TomcatEmbeddedServletContainerFactory factory=new TomcatEmbeddedServletContainerFactory();
    	factory.setPort(9090);
    	factory.setSessionTimeout(10, TimeUnit.MINUTES);
    	return factory;
    }
}
