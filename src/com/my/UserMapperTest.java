package com.my;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "/application-context.xml"})
public class UserMapperTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	public UserMapper userMapper;
	
	@Test
	public void testGetUser(){
		Assert.assertNotNull(userMapper.getUser(1L));
		Assert.assertEquals(userMapper.getUser(1L).getRealName(), "¹þ¹þ¹þ");
	}
}

