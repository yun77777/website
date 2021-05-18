package com.mall.user;

import java.util.Map;

public interface UserService {

	// 회원 가입 처리
	public void register(Map<String, Object> paramMap, UserVO userVO) throws Exception;

	Map<String, Object> login(LoginDTO loginDTO) throws Exception;
//	Map<String, Object> login(Map<String, Object> paramMap) throws Exception;
}