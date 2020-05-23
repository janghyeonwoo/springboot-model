package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BootDao {
	@Autowired
	SqlSession session;
	
	public int sqlselect() {
		
		return session.selectOne("com.example.demo.mapper.BootMapper.selectcount");
		
	}
	
	

}
