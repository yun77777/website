package com.mall.board.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface boardService {
	List<Map<String, Object>> selectBoardList(Map<String, Object> paramMap) throws Exception;

	public Map<String, Object> selectBoardDetail(Map<String, Object> paramMap) throws Exception;

	public void insertBoard(Map<String, Object> paramMap, MultipartHttpServletRequest multi,
			HttpServletRequest request) throws Exception;

}
