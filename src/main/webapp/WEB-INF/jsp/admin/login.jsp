<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/_header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统</title>

<link rel="stylesheet" type="text/css" href="${ctx}/admin/css/style.css" />
<script type="text/javascript" src="${ctx}/admin/js/cloud.js"></script>
<script language="javascript">
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		})
	});
</script>
</head>
<body
	style="background-color:#1c77ac; background-image:url(${ctx}/admin/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
	
	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>

	<div class="logintop">
		<span>欢迎使用图书管理系统</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>

	<div class="loginbody">

		<span class="systemlogo"></span>

		<div class="loginbox">

			<ul>
				<li>
					<input name="" type="text" class="loginuser" value="admin"
					onclick="JavaScript:this.value=''" />
				</li>
				<li>
					<input name="" type="password" class="loginpwd" value="密码"
					onclick="JavaScript:this.value=''" />
				</li>
				<li>
					<input name="" type="button" class="loginbtn" value="登录"/>
					<label>
						<input
							name="" type="checkbox" value="" checked="checked" />记住密码
					</label>
					<label>
						<a href="#">忘记密码？</a>
					</label>
				</li>
			</ul>
			
		</div>
		
	</div>

	<div class="loginbm">
		版权所有 2016 <a href="https://github.com/ZHAO807824">假寐的我</a>
	</div>
</body>
</html>