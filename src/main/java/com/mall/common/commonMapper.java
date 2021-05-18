package com.mall.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface commonMapper {
	int createFile(Map fileMap) throws Exception;
	
	Map getFileInfoFromRcFile(Map parameterMap) throws Exception;

	void deleteFile(Map paramMap) throws Exception;
	
	int updateFile(HashMap<String, Object> hashMap) throws Exception;
	
	public List<Map<String, Object>> selectCode(@Param("paramMap") String paramMap, @Param("orderBy") String orderBy) throws Exception;
	
	public List<Map<String, Object>> selectLawSeCode() throws Exception;
	
	public List<Map<String, Object>> selectLawTonCode() throws Exception;
	
	public List<Map<String, Object>> selectRgstTonCode() throws Exception;
	
	public List<Map<String, Object>> selectTonCode() throws Exception;
	
	public List<Map<String, Object>> selectChemCode() throws Exception;
	
	void pdfConvertFileList(Map<String, Object> reqMap) throws Exception;
	
	public Map<String, Object> selectBaseInfo(Map<String, Object> paramMap) throws Exception;
	
	public List<Map<String, Object>> selectChmclsList(Map<String, Object> paramMap) throws Exception;
	
	public Integer selectChmclsListTotCnt(Map<String, Object> paramMap) throws Exception;
	
	public List<Map<String, Object>> selectApntmList(Map<String, Object> paramMap) throws Exception;
	
	public Integer selectApntmListTotCnt(Map<String, Object> paramMap) throws Exception;
	
	public List<Map<String, Object>> selectGoodsList(Map<String, Object> paramMap) throws Exception;

	void insertNierRceptTrget(Map<String, Object> paramMap) throws Exception;

	void deleteFileCommon(Map<String, Object> paramMap) throws Exception;
	
	void deleteMultiFileCommon(Map<String, Object> paramMap) throws Exception;

	void deleteFileTable(Map<String, Object> paramMap) throws Exception;

	List<Map<String, Object>> selectImxprtListByTableName(Map<String, Object> paramMap) throws Exception;
	
	public String selectRcpNo(Map<String, Object> paramMap) throws Exception;

	void deleteImxprtByTableName(Map<String, Object> paramMap) throws Exception;

	void insertImxprtByTableName(Map<String, Object> paramMap) throws Exception;

	void insertPrtcApply(Map<String, Object> paramMap) throws Exception;

	void deletePrtcApply(Map<String, Object> paramMap) throws Exception;

	Map<String, Object> selectPrtcDetail(Map<String, Object> paramMap) throws Exception;

	void deleteSetle(Map<String, Object> paramMap) throws Exception;

	void insertSetle(Map<String, Object> paramMap) throws Exception;

	List<Map<String, Object>> selectSetleList(Map<String, Object> paramMap) throws Exception;
	
	Map<String, Object> selectNcisInfo(Map<String, Object> paramMap) throws Exception;
	
	int elctrnRnsmNoCnt(Map<String, Object> paramMap) throws Exception;
	
}
