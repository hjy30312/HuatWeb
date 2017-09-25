<%-- 
    Document   : index
    Created on : 2017-6-5, 18:35:43
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <title>学生信息管理系统</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="static/css/pintuer.css">
        <script src="static/js/jquery.js"></script>
        <script src="static/js/pintuer.js"></script>
        <script type="text/javascript">
            function ConfDel() {
                var tips = "你确定要删除当前学生记录吗?";
                if (confirm(tips)) {
                    return true;
                } else {
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <!--头部开始 ctrl+/-->

        <%@include file="WEB-INF/jspf/header.jsp" %>
        <!--头部结束-->

        <!--内容开始-->
        <div class="container padding-big-top padding-big-bottom">
            <div class="line">

                <div class="xl12 xs3 xm3 xb3">
                    <div class="panel">
                        <div class="panel-head">数据查询</div>
                        <form method="post" action="GetStudent">                   
                            <div class="margin-big">
                                <input type="text" class="input input-auto" id="sno" name="sno" size="20" placeholder="请输入要搜索的学号" />
                                <input type="submit" name="search" value="搜索" class="button" />
                            </div>
                        </form>
                    </div>
                    <div class= "margin-big-top"></div>
                    <div class="panel">
                        <div class="panel-head">友情链接</div>
                        <div class="panel-body">
                            <ul class="list-group">
                                <li>电信学院</li>
                                <li>机械学院</li>
                                <li>汽车学院</li>
                                <li>经管学院</li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="xl12 xs9 xm9 xb9 padding-small-top">
                    <div class="margin-big-left">
                        <table class="table table-striped">
                            <tr>
                                <th>学号</th>
                                <th>姓名</th>
                                <th>性别</th>
                                <th>年龄</th>
                                <th>系部</th>
                                <th>功能操作</th>
                            </tr>
                            <c:forEach var="stu" items="${students}">
                                <tr>
                                    <td>${stu.sno}</td>
                                    <td>${stu.sname}</td>
                                    <td>${stu.ssex}</td>
                                    <td>${stu.sage}</td>
                                    <td>${stu.sdept}</td>
                                    <td>
                                        <a href="DeleteStudent?sno=${stu.sno}" class="button button-small border-red" onclick="return ConfDel();"><span class="icon-trash-o"></span> 删除</a> | 
                                        <a href="UpdateStudent?sno=${stu.sno}" class="button button-small border-main"><span class="icon-edit"></span>修改</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                        <div class="margin-big-top text-center height-big">
                            ${pagination.pageBar} ${pagination.numPageBar}
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--内容结束-->

        <!--尾部开始-->
        <%@include file="WEB-INF/jspf/footer.jsp" %>
        <!--尾部结束-->

    </body>
</html>
