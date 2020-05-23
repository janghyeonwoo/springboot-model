package com.example.demo.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BootDao;
import com.example.demo.dto.User;
import com.example.demo.interceptor.HelloInterceptor;
import com.example.demo.mapper.BootMapper;

@Controller
public class Hicontroller {
	
	@Autowired
	BootMapper mapper;
	@Autowired
	SqlSession sqlSession; 
	@Autowired
	BootDao bootDao;
	
	@RequestMapping("/jsptest")
	public ModelAndView jsptest() throws Exception {
		ModelAndView mv = new ModelAndView();
	
	
	
		mv.addObject("name" ,"pooney.jsp");
		
		
		
		mv.setViewName("index");
		
		
		
		return mv;
	}
	
	@RequestMapping("/thymetest")
	public String thymetest(Model model) throws Exception {
		List<User> user = mapper.getUserAge(3);
		model.addAttribute("name" , "pooney.th");
		
		model.addAttribute("user" ,user);
		
		
		
		return "thymeleaf/thymeleaftest";
		
		
	}
	
	@RequestMapping("/count")
	public String count(Model model) {
		int num = bootDao.sqlselect();
		model.addAttribute("num", num);
		
		return "thymeleaf/count";
	}

}
