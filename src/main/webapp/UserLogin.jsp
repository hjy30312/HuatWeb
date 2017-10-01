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
    <title>管理员登录</title>

    <link rel="stylesheet" href="static/css/admin.css">
    <script src="http://www.pintuer.com/js/respond.js"></script>

    <link rel="stylesheet" href="static/css/pintuer.css">
    <script src="static/js/jquery.js"></script>
    <script src="static/js/pintuer.js"></script>

    <link type="image/x-icon" href="http://www.pintuer.com/favicon.ico" rel="shortcut icon" />
    <link href="http://www.pintuer.com/favicon.ico" rel="bookmark icon" />
</head>

<body background="static/images/1.jpg">
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
            <form action="UserLogin" method="post"> <!-- 向指定的资源提交要被处理的数据-->
                <div class="panel padding">
                    <div class="text-center">
                        <br>
                        <h2><strong>管理员登录</strong></h2></div>
                    <div class="" style="padding:30px;">
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="text" class="input" name="username" placeholder="登录账号" data-validate="required:请填写账号,length#>=5:账号长度不符合要求" />
                                <span class="icon icon-user"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input" name="password" placeholder="登录密码" data-validate="required:请填写密码,length#>=6:密码长度不符合要求" />
                                <span class="icon icon-key"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field">
                                <button class="button button-block bg-main text-big">立即登录后台</button>
                            </div>
                        </div>
                        <div class="text-right text-small text-gray padding-top">基于<a class="text-gray" target="_blank" href="http://www.pintuer.com">拼图前端框架</a>构建</div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>

</html>
