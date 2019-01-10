<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/view/home/head.jsp" %>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<%@ include file="/WEB-INF/view/home/header.jsp" %>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<%@ include file="/WEB-INF/view/home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td>
			<%@ include file="side-menu.jsp" %>
		</td>
		<td>
			<%@ include file="content.jsp" %>
		</td>
	</tr>
	<tr>
		<td>
			<%@ include file="/WEB-INF/view/home/footer.jsp" %>
		</td>
	</tr>
</table>
</body>
</html>