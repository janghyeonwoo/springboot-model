package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.interceptor.HelloInterceptor;


//설정파일이라고 sping에 알리기 위한 어노테이션 
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//인터셉터를 등록하기 Sping의 servlet.xml에 인터셉터를 등록하는 작업과 같다.	
	
		registry.addInterceptor(new HelloInterceptor()).addPathPatterns("/hi");
	}
	
	

}
