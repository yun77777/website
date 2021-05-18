package com.mall.user;

import java.util.Map;

public interface UserMapper {

	public void register(Map<String, Object> paramMap) throws Exception;

	UserVO login(Map<String, Object> paramMap) throws Exception;

}
