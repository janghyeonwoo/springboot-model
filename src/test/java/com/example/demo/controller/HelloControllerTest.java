package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {
	
	//MockMvc  브라우저없이 가상의 request를 만든다 .
	@Autowired
	MockMvc mock; 
	
	
	@Test
	public void testHello() throws Exception {
		
	//첫번째 테스트방법	
	//.perform은 수행해라  get은 요청방식 ex)post, get	
	mock.perform(get("/hi"))
	//정상적으로 응답하면 통과 
	.andExpect(status().isOk())
	//content는 Hi ponn~~~랑 같으면 통과 
	.andExpect(content().string("Hi pooney 오신걸 환영합니다."));
	
	
	//두번째 테스트방법 (첫번째 와 두번째 모두 같다) 
	MvcResult result = mock.perform(get("/hi"))
	.andExpect(status().isOk())
	.andReturn();
	assertEquals("Hi pooney 오신걸 환영합니다.", result.getResponse().getContentAsString());
	assertThat(result.getResponse().getContentAsString()).isEqualTo("Hi pooney 오신걸 환영합니다.");
	System.out.println("RRR>>" + result.getResponse().getContentAsString());
	
	
	}
}
