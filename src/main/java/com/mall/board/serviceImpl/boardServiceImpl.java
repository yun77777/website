package com.mall.board.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mall.board.service.boardService;

@Service("boardService")
public class boardServiceImpl implements boardService{
	@Autowired
	private boardMapper boardMapper;
	
	@Override
	public List<Map<String,Object>> selectBoardList(Map<String, Object> paramMap) throws Exception{
		System.err.println("service@@@@@@@@@@");
		System.err.println("result$$:"+boardMapper.selectBoardList(paramMap));
		System.err.println(paramMap);
		return boardMapper.selectBoardList(paramMap);
	}
	
	public Integer selectBoardListCnt(Map<String, Object> paramMap) throws Exception{
		System.err.println("dd");
		return boardMapper.selectBoardListCnt(paramMap);
	}
	
	@Override
	public Map<String,Object> selectBoardDetail(Map<String, Object> paramMap) throws Exception{
		System.err.println("service@@@@@@@@@@");
		System.err.println("result$$:"+boardMapper.selectBoardDetail(paramMap));
		return boardMapper.selectBoardDetail(paramMap);
	}
	@Override
	public void insertBoard(Map<String, Object> paramMap, MultipartHttpServletRequest multi,
			HttpServletRequest request) throws Exception {
		System.err.println("askdldsaldasladskld$$$$$$$");
		System.err.println(paramMap);
		boardMapper.mergeBoard(paramMap);
//		boardMapper.insertBoard(paramMap);
	}

}
 