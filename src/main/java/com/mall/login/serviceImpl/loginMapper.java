package com.mall.login.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface loginMapper {

	public Integer memberLogin(Map<String, Object> paramMap) throws Exception;

	public void insertMember(Map<String, Object> paramMap) throws Exception;

	public void insertMemberHis(Map<String, Object> paramMap) throws Exception;

}
