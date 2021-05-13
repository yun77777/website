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
		return boardMapper.selectBoardList(paramMap);
	}
	
	@Override
	public Map<String,Object> selectContent(Map<String, Object> paramMap) throws Exception{
		return boardMapper.selectContent(paramMap);
	}
	
	public Integer selectBoardListCnt(Map<String, Object> paramMap) throws Exception{
		return boardMapper.selectBoardListCnt(paramMap);
	}
	
	public Integer selectBoardMaxNo(Map<String, Object> paramMap) throws Exception{
		return boardMapper.selectBoardMaxNo(paramMap);
	}
	
	@Override
	public Map<String,Object> selectBoardDetail(Map<String, Object> paramMap) throws Exception{
		boardMapper.updateCnt(paramMap);
		return boardMapper.selectBoardDetail(paramMap);
	}
	
	@Override
	public void insertBoard(Map<String, Object> paramMap, MultipartHttpServletRequest multi,
			HttpServletRequest request) throws Exception {
		boardMapper.mergeBoard(paramMap);
		boardMapper.insertHisBoard(paramMap);
	}
	
	@Override
	public void deleteBoard(Map<String, Object> paramMap, MultipartHttpServletRequest multi,
			HttpServletRequest request) throws Exception {
		boardMapper.deleteBoard(paramMap);
		paramMap.put("DEL_YN","Y");
		boardMapper.insertHisBoard(paramMap);
	}

}
 