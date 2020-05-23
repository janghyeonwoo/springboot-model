package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.User;

public interface BootMapper {
	
	public List<User> getUserAge(@Param("age") int age ) throws Exception;
	
}
