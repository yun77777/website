package com.mall.common;

import java.io.Serializable;

/*
 * PaginateionVO, 각 VO들은 PaginationVO를 상속받아서 사용
 * search_keyword, search_type등 검색에 사용되는 파라미터는 추가해서 사용
 */
public class PaginationVO implements Serializable {
	
	private static final long serialVersionUID = -7316625043957202752L;
	
	// 페이징
	/**
	 * 현재 페이지
	 */
	private int currentPageNo;
	/**
	 * 시작 인덱스 
	 */
	private int startIndex;
	
	/**
	 * 시작 행(페이지) 번호
	 */
	private int firstRecordIndex;

	/**
	 * 끝 행(페이지) 번호
	 */
	private int lastRecordIndex;

	/**
	 * 전체 행(페이지 갯수) 
	 */
	private int totalPageCount;

	/**
	 * 시작 페이지 번호(db값)
	 */
	private int firstPageNoOnPageList;

	/**
	 * 끝 페이지 번호(db값)
	 */
	private int lastPageNoOnPageList;

	/**
	 * 한 페이지 보여줄 글의 갯수
	 */
	private int recordCountPerPage;

	/**
	 * 한 페이지 보여줄 페이지 갯수
	 */
	private int pageSize;

	/**
	 * 전체 글의 수(db 조회값)
	 */
	private int totalRecordCount;

	private int rowNum;
	private int rowNumDesc;
	
	private int prevBlockPage;
	private int nextBlockPage;
	
	/**
	 * PaginationUtil
	 * 
	 * @param currentPageNo 현재 페이지 번호
	 * @param recordCountPerPage 한페이지 글의 갯수
	 * @param pageSize 한페이지 페이지 갯수
	 * @param totalRecordCount 전체 글의 갯수
	 */
	public PaginationVO (int currentPageNo, int recordCountPerPage,
			int pageSize, int totalRecordCount) {
		this.currentPageNo = currentPageNo;
		this.recordCountPerPage = recordCountPerPage;
		this.pageSize = pageSize;
		this.totalRecordCount = totalRecordCount;
		
		this.firstRecordIndex = (currentPageNo - 1) * recordCountPerPage + 1;
		this.startIndex = this.firstRecordIndex - 1;
		this.lastRecordIndex = this.firstRecordIndex + recordCountPerPage - 1;

		this.totalPageCount = (int) Math.ceil((float) this.totalRecordCount
				/ (float) this.recordCountPerPage);
		this.firstPageNoOnPageList = this.currentPageNo - (this.currentPageNo - 1) % this.pageSize;
		this.lastPageNoOnPageList = this.firstPageNoOnPageList + this.pageSize - 1;
		if (this.lastPageNoOnPageList > this.totalPageCount)
			this.lastPageNoOnPageList = this.totalPageCount;

		// 행 번호 ( 1 ~ ) rowNum + varStatus
		this.rowNum = ( this.currentPageNo * this.recordCountPerPage ) - this.recordCountPerPage;
		// 행 번호 역순 ( ~ 1 ) rowNumDesc - varStatus
		this.rowNumDesc = this.totalRecordCount - ( this.recordCountPerPage * (this.currentPageNo - 1) ) + 1;
		
		this.prevBlockPage = ( this.currentPageNo / 10 ) * 10 - 9;
		if ( this.prevBlockPage < 1 ) this.prevBlockPage = 1;
		if ((this.currentPageNo % 10) != 0) this.nextBlockPage = ( this.currentPageNo / 10 + 1 ) * 10 + 1;
		else this.nextBlockPage = this.currentPageNo / 10 *10 + 1;
		if ( this.nextBlockPage > this.totalPageCount ) this.nextBlockPage = this.totalPageCount;
		
	}
	
	
	

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getFirstRecordIndex() {
		return firstRecordIndex;
	}

	public void setFirstRecordIndex(int firstRecordIndex) {
		this.firstRecordIndex = firstRecordIndex;
	}

	public int getLastRecordIndex() {
		return lastRecordIndex;
	}

	public void setLastRecordIndex(int lastRecordIndex) {
		this.lastRecordIndex = lastRecordIndex;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getFirstPageNoOnPageList() {
		return firstPageNoOnPageList;
	}

	public void setFirstPageNoOnPageList(int firstPageNoOnPageList) {
		this.firstPageNoOnPageList = firstPageNoOnPageList;
	}

	public int getLastPageNoOnPageList() {
		return lastPageNoOnPageList;
	}

	public void setLastPageNoOnPageList(int lastPageNoOnPageList) {
		this.lastPageNoOnPageList = lastPageNoOnPageList;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public int getRowNumDesc() {
		return rowNumDesc;
	}

	public void setRowNumDesc(int rowNumDesc) {
		this.rowNumDesc = rowNumDesc;
	}

	public int getPrevBlockPage() {
		return prevBlockPage;
	}

	public void setPrevBlockPage(int prevBlockPage) {
		this.prevBlockPage = prevBlockPage;
	}

	public int getNextBlockPage() {
		return nextBlockPage;
	}

	public void setNextBlockPage(int nextBlockPage) {
		this.nextBlockPage = nextBlockPage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PaginationVO [currentPageNo=" + currentPageNo + ", startIndex=" + startIndex + ", firstRecordIndex="
				+ firstRecordIndex + ", lastRecordIndex=" + lastRecordIndex + ", totalPageCount=" + totalPageCount + ", firstPageNoOnPageList="
				+ firstPageNoOnPageList + ", lastPageNoOnPageList=" + lastPageNoOnPageList + ", recordCountPerPage=" + recordCountPerPage + ", pageSize="
				+ pageSize + ", totalRecordCount=" + totalRecordCount + ", rowNum=" + rowNum + ", rowNumDesc="
				+ rowNumDesc + ", prevBlockPage=" + prevBlockPage + ", nextBlockPage=" + nextBlockPage + "]";
	}
	
}
