package com.mall.board.service;

import java.util.List;
import java.util.Map;

public interface boardService {
	List<Map<String,Object>> selectBoardList() throws Exception;
}
