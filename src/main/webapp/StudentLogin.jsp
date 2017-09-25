<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/23
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>学生登录</title>

    <link rel="stylesheet" href="static/css/admin.css">

    <link rel="stylesheet" href="static/css/pintuer.css">
    <script src="static/js/jquery.js"></script>
    <script src="static/js/pintuer.js"></script>

    <link type="image/x-icon" href="http://www.pintuer.com/favicon.ico" rel="shortcut icon" />
    <link href="http://www.pintuer.com/favicon.ico" rel="bookmark icon" />
</head>

<body background="static/images/888.jpg">
<div class="container">
    <div class="line">
        <div class="xs6 xm4 xs3-move xm4-move">
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <form action="StudentLogin" method="post">
                <span style="color: #FF0000;">${msg}</span>
                <div class="panel padding">
                    <div class="text-center">
                        <br>
                        <h2><strong>学生登录</strong></h2></div>
                    <div class="" style="padding:30px;">
                        <div class="form-group">

                            <div class="field field-icon-right">
                                <input type="text" class="input" name="sno" placeholder="学号" data-validate="required:请填写账号,length#>=5:账号长度不符合要求" />
                                <span class="icon icon-user"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input" name="password" placeholder="密码" data-validate="required:请填写密码,length#>=8:密码长度不符合要求" />
                                <span class="icon icon-key"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field">
                                <button class="button button-block bg-main text-big">登录</button>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field text-center">
                                <p class="text-muted text-center">
                                    <a class="" href="index.jsp">返回首页</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>

</html>
