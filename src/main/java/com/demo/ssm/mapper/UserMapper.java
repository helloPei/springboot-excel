package com.demo.ssm.mapper;

import com.demo.ssm.pojo.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {

	List<User> selectUsers();

	void updateUserByName(User user);

	void addUser(User user);

	int selectByName(String username);
}