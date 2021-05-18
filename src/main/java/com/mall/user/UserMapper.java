package com.mall.user;

import java.util.Map;

public interface UserMapper {

	public void register(Map<String, Object> paramMap) throws Exception;

	Map<String, Object> login(LoginDTO loginDTO) throws Exception;
//	Map<String, Object> login(Map<String, Object> paramMap) throws Exception;

}
