package com.my;


import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//@CacheNamespace
public interface UserMapper {

	//@Select("select * from user where id=#{userId}")
	//User getUser(@Param("userId") Long userId);
	
	//@Select("select * from user where id=#{userId}")
	User getUser(@Param("userId") Long userId);
	
}
