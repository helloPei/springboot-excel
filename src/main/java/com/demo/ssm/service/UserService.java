package com.demo.ssm.service;

import com.demo.ssm.pojo.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

	List<User> selectUsers();

	boolean batchImport(String fileName, MultipartFile file) throws Exception;
}
