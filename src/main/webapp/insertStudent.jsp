<%-- 
    Document   : index
    Created on : 2017-6-5, 18:35:43
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/mytag" %>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <title>学生信息管理系统</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="static/css/pintuer.css">
        <script src="static/js/jquery.js"></script>
        <script src="static/js/pintuer.js"></script>
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
                    <div class="margin-big-left padding-big">
                        <form method="post" action="InsertStudent">
                            <div class="form-group">
                                <div class="label">
                                    <label for="sno">学号</label>
                                </div>
                                <div class="field">
                                    <input type="text" class="input" id="sno" name="sno" size="50" placeholder="学生学号" data-validate="required:必填,length#==7:学号号长度为7,ajax#CheckSno?sno=:学号已存在" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="label">
                                    <label for="sname">姓名</label>
                                </div>
                                <div class="field">
                                    <input type="text" class="input" id="sname" name="sname" size="50" placeholder="学生姓名" data-validate="required:必填"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="label">
                                    <label for="sses">性别</label>
                                </div>
                                <div class="field">
                                    <div class="button-group radio">
                                        <label class="button active">
                                            <input name="ssex" value="男" checked="checked" type="radio"><span class="icon icon-male"></span> 男
                                        </label>
                                        <label class="button">
                                            <input name="ssex" value="女" type="radio"><span class="icon icon-female"></span> 女
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="label">
                                    <label for="sage">年龄</label>
                                </div>
                                <div class="field">
                                    <input type="text" class="input" id="sage" name="sage" size="50" placeholder="学生年龄" data-validate="required:必填,plusinteger:必须是数字,compare#>15:年龄必须大于15岁,compare#<25:年龄必须小于25岁"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="label">
                                    <label for="sdept">系部</label>
                                </div>
                                <div class="field">
                                    <select class="input" name="sdept">
                                        <mytag:departtag />
                                    </select>
                                </div>
                            </div>
                            <div class="form-button">
                                <button class="button" type="submit">提交</button>
                            </div>
                        </form>

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
