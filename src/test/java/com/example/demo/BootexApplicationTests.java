package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dto.User;
import com.example.demo.mapper.BootMapper;

@RunWith(SpringRunner.class)
//컨트롤러 테스트시 톰켓이랑 같이 뛰워야 하기 때문에 랜덤포트로 포트를 무시하고 스프리 부트로 테스트해라 라는 뜻 
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class BootexApplicationTests {
	
	//rest controller를 테스트 할 것이기 때문에 RestTemplate을 이용하는것이다. 
	@Autowired
	private TestRestTemplate restTemplate;
	
	
	@Test
	public void restTest() {
		ResponseEntity<String> re = restTemplate.getForEntity("/hi", String.class);
		System.out.println("re ====>"+ re);
		
	}
	

}
