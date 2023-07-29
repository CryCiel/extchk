package com.flow.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.flow.test.item.mapper")
public class FlowTestProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(FlowTestProject1Application.class, args);
	}

}
