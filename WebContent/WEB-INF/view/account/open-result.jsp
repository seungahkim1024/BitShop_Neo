<%@page import="domain.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<div id = "open-result">
				<%
				AccountBean acc = (AccountBean)request.getAttribute("acc");
				String accNum = acc.getAccountNum();
				String money = Integer.toString(acc.getMoney());
				String createdDate = acc.getToday();
				%>
					 계좌번호:<%=accNum %> <br /> 
					 잔액: <%=money %><br />
					 계좌생성일: <%=createdDate %>
		</div>