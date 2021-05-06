package com.mall.board.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.board.service.boardService;

@Service("boardService")
public class boardServiceImpl implements boardService{
	@Autowired
	private boardMapper boardMapper;
	public List<Map<String,Object>> selectBoardList() throws Exception{
		System.err.println("service@@@@@@@");
		System.err.println("result$$:"+boardMapper.selectBoardList());
		return null;
	}

}
