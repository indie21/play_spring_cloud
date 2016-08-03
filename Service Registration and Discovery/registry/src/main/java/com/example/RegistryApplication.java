package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//添加下面一行
@EnableEurekaServer
public class RegistryApplication {

	public static void main(String[] args) {
      // 添加这样，指定配置文件名字。
      SpringApplication.run(RegistryApplication.class, args);
	}
}
