package com.mall.user;

import java.util.Map;

import com.mall.board.web.boardController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mall.login.service.loginService;

public interface UserService {

	// 회원 가입 처리
	public void register(Map<String, Object> paramMap, UserVO userVO) throws Exception;

	UserVO login(Map<String, Object> paramMap) throws Exception;
}