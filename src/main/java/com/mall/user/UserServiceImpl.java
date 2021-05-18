package com.mall.user;

import java.util.Map;

import com.mall.board.web.boardController;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mall.login.service.loginService;
import com.mall.login.serviceImpl.loginMapper;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	// 회원 가입 처리
	@Override
	public void register(Map<String, Object> paramMap, UserVO userVO) throws Exception {

		System.err.println("sdasdss");
		System.err.println(paramMap);
		userMapper.register(paramMap);
	}

	@Override
	public UserVO login(Map<String, Object> paramMap) throws Exception {
		return userMapper.login(paramMap);

	}
}