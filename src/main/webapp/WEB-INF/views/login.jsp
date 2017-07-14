<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	pageContext.setAttribute("basePath", basePath);
%>

<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登录</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="${basePath}/static/js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="${basePath}/static/bootstrap/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="${basePath}/static/bootstrap/css/bootstrap.min.css" />
        <style>
            .center{
                position: relative;
                top:50%;
                transform:translateY(50%);
            }
            .background{
                padding-top: 15px;
            }
        </style>
	</head>
	<body>
		<div class="container center">
            <!-- 标题行 -->
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <h1><strong>XXXX维修服务系统</strong></h1>
                </div>
            </div>
            <div class="center background row">
                <div class="col-md-8 col-md-offset-2">
                    <form id="login_form" class="form-horizontal" action="${basePath}/home" method="post">
                        <div class="form-group">
                            <label for="lg_name" class="col-md-2 col-md-offset-2 control-label">登录名：</label>
                            <div class="col-md-6">
                                <input type="text" class="form-control" id="lg_name" name="logname" placeholder="请输入账号" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lg_password" class="col-md-2 col-md-offset-2 control-label">密码：</label>
                            <div class="col-md-6">
                                <input type="password" class="form-control" id="lg_password" name="password" placeholder="请输入密码" required>
                            	<span id="errorMsg" class="help-block" style="color:red">${msg}</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-3 col-md-10">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox">记住密码
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <button id="login" type="submit" class="btn btn-primary btn-block">登录</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript">
        	/* $(function() {
        		$("#errorMsg").text("");
        	}); */

        	/* $("#login").click(function(){
        		$("#errorMsg").text("${msg}");
    			$("#errorMsg").css("color","red");
        	}); */

        </script>
	</body>
</html>