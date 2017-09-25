
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<%@include file="WEB-INF/jspf/header.jsp"%>
<!--头部结束-->

<!--内容开始-->
<div class="container padding-big-top padding-big-bottom">
    <div class="line">
        <div class="xl12 xs3 xm3 xb3">
            <div class="panel">
                <div class="panel-head">
                    <strong>文章分类</strong>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <li><span class="float-right badge bg-red">88</span> JAVA编程</li>
                        <li><span class="float-right badge bg-main">828</span> 数据库编程</li>
                        <li><span class="float-right badge bg-main">828</span> 前端开发</li>
                        <li><span class="float-right badge bg-main">828</span> C语言编程</li>
                        <li><span class="float-right badge bg-main">828</span> 疑难解答</li>
                    </ul>
                </div>
            </div>
            <div class="margin-big-top"></div>
            <div class="panel">
                <div class="panel-head">
                    <strong>友情链接</strong>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <li><span class="float-left badge bg-main">1</span>&nbsp;&nbsp;汽车学院</li>
                        <li><span class="float-left badge bg-main">2</span>&nbsp;&nbsp;电信学院</li>
                        <li><span class="float-left badge bg-main">3</span>&nbsp;&nbsp;示范中心</li>
                        <li><span class="float-left badge bg-main">4</span>&nbsp;&nbsp;教务处</li>
                        <li><span class="float-left badge bg-main">5</span>&nbsp;&nbsp;网络课程</li>
                        <li><span class="float-left badge bg-main">6</span>&nbsp;&nbsp;图书馆</li>
                        <li><span class="float-left badge bg-main">7</span>&nbsp;&nbsp;人事处</li>
                        <li><span class="float-left badge bg-main">8</span>&nbsp;&nbsp;财务处</li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="xl12 xs9 xm9 xb9 padding-small-top">
            <div class="margin-big-left">
                <div class="banner">
                    <div class="carousel">
                        <div class="item">
                            <img src="static/images/1.jpg" width="100%" alt="1" />
                        </div>
                        <div class="item">
                            <img src="static/images/2.jpg" width="100%" alt="2" />
                        </div>
                        <div class="item">
                            <img src="static/images/3.jpg" width="100%" alt="3" />
                        </div>
                        <div class="item">
                            <img src="static/images/4.jpg" width="100%" alt="4" />
                        </div>
                        <div class="item">
                            <img src="static/images/5.jpg" width="100%" alt="5" />
                        </div>
                        <div class="item">
                            <img src="static/images/6.jpg" width="100%" alt="6" />
                        </div>
                    </div>
                </div>

                <div class="margin-big-top"></div>

                <div class="panel">
                    <ul class="list-group">
                        <li><a href="http://www.baidu.com" target="_blank"><span
                                class="icon-home"></span>实验室发展历史</a></li>
                        <li><a href="http://www.baidu.com" target="_blank"><span
                                class="icon-home"></span>实验室简介</a></li>
                        <li><a href="http://www.baidu.com" target="_blank"><span
                                class="icon-home"></span>实验室硬件条件和课程设置</a></li>
                        <li><a href="http://www.baidu.com" target="_blank"><span
                                class="icon-tencent-weibo"></span>实验室管理和规章制度</a></li>
                    </ul>
                </div>
                <div class="margin-big-top"></div>

                <div class="panel">
                    <div class="panel-head">
                        <strong>友情链接</strong>
                    </div>
                    <ul class="list-group">
                        <li><a href="#" target="_blank"><span
                                class="float-left badge bg-main">疑难解答</span><span
                                class="float-right badge bg-main">5%热度</span>&nbsp;&nbsp;&nbsp;汽车学院</a></li>
                        <li><a href="#" target="_blank"><span
                                class="float-left badge bg-main">疑难解答</span><span
                                class="float-right badge bg-main">5%热度</span>&nbsp;&nbsp;&nbsp;汽车学院</a></li>
                        <li><a href="#" target="_blank"><span
                                class="float-left badge bg-main">疑难解答</span><span
                                class="float-right badge bg-main">5%热度</span>&nbsp;&nbsp;&nbsp;汽车学院</a></li>
                        <li><a href="#" target="_blank"><span
                                class="float-left badge bg-main">疑难解答</span><span
                                class="float-right badge bg-main">5%热度</span>&nbsp;&nbsp;&nbsp;汽车学院</a></li>
                        <li><a href="#" target="_blank"><span
                                class="float-left badge bg-main">疑难解答</span><span
                                class="float-right badge bg-main">5%热度</span>&nbsp;&nbsp;&nbsp;汽车学院</a></li>
                        <li><a href="#" target="_blank"><span
                                class="float-left badge bg-main">疑难解答</span><span
                                class="float-right badge bg-main">5%热度</span>&nbsp;&nbsp;&nbsp;汽车学院</a></li>
                    </ul>
                </div>
            </div>

        </div>
    </div>
</div>
<!--内容结束-->

<!--尾部开始-->
<%@include file="WEB-INF/jspf/footer.jsp"%>
<!--尾部结束-->
</body>
</html>
