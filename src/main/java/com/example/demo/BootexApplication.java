package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(value= {"com.example.demo.mapper"})
public class BootexApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootexApplication.class, args);
	}

}
