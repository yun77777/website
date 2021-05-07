<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<ul class="pagination justify-content-center">
    <li class="page-item">
        <a class="page-link" aria-label="Previous"href="javascript:void(0);" onclick="fn_list('${pg.prevBlockPage}')">
            <span aria-hidden="true">«</span>
            <span class="sr-only">Previous</span>
        </a>
    </li>
   		<c:forEach var="p" begin="${pg.firstPageNoOnPageList}" end="${pg.lastPageNoOnPageList}">
		<c:choose>
			<c:when test="${pg.currentPageNo eq p}"><li class="page-item"><a class="page-link" href="javascript:void(0);">${p}</a></li><!-- 선택된 페이지--></c:when>
			<c:otherwise><li class="page-item"><a class="page-link" href="javascript:void(0);" onclick="fn_list('${p}')">${p}</a></c:otherwise>
		</c:choose>
	</c:forEach>
		
    <li class="page-item">
        <a class="page-link" aria-label="Next" href="javascript:void(0);" onclick="fn_list('${pg.nextBlockPage}')">
            <span aria-hidden="true">»</span>
            <span class="sr-only">Next</span>
        </a>
    </li>
</ul>