package com.example.demo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"uid"})
public class User {
	String name;
	String uid;
	int age;
	

}
