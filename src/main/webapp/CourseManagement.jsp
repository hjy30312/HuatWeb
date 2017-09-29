<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/26
  Time: 20:33
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
    <title>拼图响应式后台管理-后台管理</title>
    <link rel="stylesheet" href="http://www.pintuer.com/css/pintuer.css">
    <link rel="stylesheet" href="static/css/admin.css">
    <link type="image/x-icon" href="http://www.pintuer.com/favicon.ico" rel="shortcut icon" />
    <link href="http://www.pintuer.com/favicon.ico" rel="bookmark icon" />
</head>

<body>
<!--顶部-->
<div class="layout bg-main bg-inverse fixed" style="z-index: 9;">
    <div class="container-layout">
        <div class="navbar">
            <div class="navbar-head">
                <button class="button icon-navicon" data-target="#navbar1">
                </button>
                <a href="/">
                    <img src="http://www.pintuer.com/images/30-white.png" />
                    <strong class="text-big">数据库系统实现课程教学演示系统 -- 后台管理中心</strong></a>
            </div>
        </div>
    </div>
</div>
<!--内容-->
<div class="layout">
    <div class="xl14 xs2 xm2 xb2">
        <div class="padding-little">
            <li><a href="#">数据管理</a></li>
        </div>
        <hr />
        <div class="padding-little">
            <li><a href="#">选课管理</a></li>
        </div>
        <hr />
        <div class="padding-little">
            <li><a href="#">信息维护</a></li>
        </div>
        <hr />
        <div class="padding-little">
            <li><a href="RevisePassword.jsp">修改密码</a></li>
        </div>
    </div>
        <ul class="bread bg">
            <li><a href="#" class="icon-home">首页</a> </li>
            <li><a href="#">选课管理</a></li>
        </ul>

        <table class="table table-striped">
            <tr>
                <th>课程号</th>
                <th>课程名</th>
                <th>前导课名</th>
                <th>课程学分</th>
                <th>总学时</th>
                <th>理论学时</th>
                <th>实验学时</th>
                <th>成绩</th>
            </tr>
            <c:forEach var="map" items="${map}">
                    <tr>
                        <td>${map.key.cno}</td>
                        <td>${map.key.cname}</td>
                        <td>${map.key.cpno}</td>
                        <td>${map.key.ccredit}</td>
                        <td>${map.key.period}</td>
                        <td>${map.key.theory}</td>
                        <td>${map.key.experiment}</td>
                        <td>${map.value}</td>
                    </tr>
            </c:forEach>
        </table>
        未选课程
        <br>
        <table class="table table-striped">
            <tr>
                <th>选择</th>>
                <th>课程号</th>
                <th>课程名</th>
                <th>前导课名</th>
                <th>课程学分</th>
                <th>总学时</th>
                <th>理论学时</th>
                <th>实验学时</th>
                <th>操作</th>
            </tr>
            <c:forEach var="snc" items="${studentNoCourse}">
                <tr>
                    <td></td>
                    <td>${snc.cno}</td>
                    <td>${snc.cname}</td>
                    <td>${snc.cpno}</td>
                    <td>${snc.ccredit}</td>
                    <td>${snc.period}</td>
                    <td>${snc.theory}</td>
                    <td>${snc.experiment}</td>
                </tr>
             </c:forEach>
        </table>
    </div>
</div>
<!--底部-->
<div class="layout fixed-bottom bg-white">
    <div class="border-bottom padding-bottom">
        <div class="text-center height-big text-small">
            <strong>版权所有 © <a href="http://www.pintuer.com">Pintuer.com</a> All Rights Reserved，图ICP备：<a href="http://www.pintuer.com">380959609</a></strong>
        </div>
    </div>
</div>
</body>

</html>
