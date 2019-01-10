<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>그룹웨어</title>
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
<div style="width: 100%">
<section>
<article>
	<h1 id="title">회원 전용 시스템</h1>
	<table id="login-outer-tab">
		<tr>
			<td colspan="5">
				<form id="login-form" action="member.do">
					<table id="login-inner-tab">
						<tr>
							<td><input id="uid" name="uid"
								type="text" placeholder="ID" tabindex="1" />
							</td>
							<td rowspan="2">
								<button id="login-btn">LOGIN</button>
							</td>
						</tr>
						<tr>
							<td><input id="upw" name="upw"
									type="password" placeholder="PASSWORD"
									tabindex="2" /> 
								<input type="hidden" name="cmd" value="login" /> 
								<input type="hidden" name="dir" value="home" />
								<input type="hidden" name="dest" value="welcome" />

							</td>
						</tr>
					</table>
				</form> 
				<a id="admin-link" href="#"> 관리자 </a> | 
						<a id="join-link" href="member.do?dest=join-form"> 회원가입 </a>
			</td>
		</tr>
	</table>
</article>
</section>
</div>
</body>
</html>