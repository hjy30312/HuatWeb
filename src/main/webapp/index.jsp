<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <jsp:include page="WEB-INF/jsp/include/front/head.jsp"/>
</head>
<body>
    <!--头部开始 ctrl+/-->
    <jsp:include page="WEB-INF/jsp/include/header.jsp"/>
    <!--头部结束-->
    <!--菜单-->
    <jsp:include page="WEB-INF/jsp/include/front/menu.jsp"/>
    <!--内容开始-->
    <div class="container">
        <div class="line">
            <div class="xm3 xb3 fadein-left">
                <div class="doc-siderbar">
                    <div class="panel margin-big-bottom">
                        <div class="panel-head">
                            <strong class="icon-file-text"> 文章分类</strong>
                        </div>
                        <
                        <ul class="list-group">
                            <c:forEach var="category" items="${categories}" varStatus="status">
                                <li><span class="float-right badge bg-main">${category.count}</span><a href="ArticleList?cid=${category.cid}">${category.catename}</a></li>
                            </c:forEach>
                        </ul>

                    </div>
                    <div class="panel margin-big-bottom">
                        <div class="panel-head">
                            <strong class="icon-list"> 友情链接</strong>
                        </div>
                        <ul class="list-group">
                            <li><span class="badge bg-main margin-big-right">1</span><a href="http://www.huat.edu.cn" target="_blank" title="湖北汽车工业学院官方网址">汽车学院</a></li>
                            <li><span class="badge bg-main margin-big-right">2</span><a href="http://dxxy.huat.edu.cn/" target="_blank" title="电气与信息工程学院网址">电信学院</a></li>
                            <li><span class="badge bg-main margin-big-right">3</span><a href="http://lab.huat.edu.cn/center/" target="_blank" title="湖北汽车工业学院实践教学示范中心">示范中心</a></li>
                            <li><span class="badge bg-main margin-big-right">4</span><a href="http://jwc.huat.edu.cn/" target="_blank" title="湖北汽车工业学院教务处网址">教务处</a></li>
                            <li><span class="badge bg-main margin-big-right">5</span><a href="http://res.huat.edu.cn/learn/public/login.aspx?aspxerrorpath=/Learn/Default.aspx" target="_blank" title="湖北汽车工业学院网络课堂">网络课堂</a></li>
                            <li><span class="badge bg-main margin-big-right">6</span><a href="http://lib.huat.edu.cn/" target="_blank" title="湖北汽车工业学院图书馆网址">图书馆</a></li>
                            <li><span class="badge bg-main margin-big-right">7</span><a href="http://rsc.huat.edu.cn/main.asp" target="_blank" title="湖北汽车工业学院人事处网址">人事处</a></li>
                            <li><span class="badge bg-main margin-big-right">8</span><a href="http://cwc.huat.edu.cn/" target="_blank" title="湖北汽车工业学院财务处网址">财务处</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="xl12 xs12 xm9 xb9">
                <div class="padding-large-left padding-large-right">
                    <!--轮播开始-->
                    <div class="margin-big-bottom">
                        <div class="banner" data-interval="10">
                            <div class="carousel">
                                <div class="item"><img class="img-responsive img-border" src="static/images/1.jpg" alt="1.jpg" width="100%" /></div>
                                <div class="item"><img class="img-responsive img-border" src="static/images/2.jpg" alt="2.jpg" width="100%" /></div>
                                <div class="item"><img class="img-responsive img-border" src="static/images/3.jpg" alt="3.jpg" width="100%" /></div>
                                <div class="item"><img class="img-responsive img-border" src="static/images/4.jpg" alt="4.jpg" width="100%" /></div>
                                <div class="item"><img class="img-responsive img-border" src="static/images/5.jpg" alt="5.jpg" width="100%" /></div>
                                <div class="item"><img class="img-responsive img-border" src="static/images/6.jpg" alt="6.jpg" width="100%" /></div>
                            </div>
                        </div>
                    </div>
                    <!--轮播结束-->

                    <!--实验室简介-->
                    <jsp:include page="WEB-INF/jsp/include/front/lab_resume.jsp"/>
                    <div class="doc-articlelist margin-big-bottom">
                        <div class="panel">
                            <div class="panel-head">
                                <strong class="icon-list"> 文章列表</strong>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <tbody>
                                    <c:forEach var="article" items="${articles}" varStatus="status">
                                        <tr>
                                            <td><span class="badge bg-main bg-inverse"><a href="ArticleList?cid=${article.category.cid}">${article.category.catename}</a></span></td>
                                            <td><a href="ShowArticleServlet?id=${article.id}" title="${article.title}"><mytag:convertstringtag content="${article.title}" size="30" /></a></td>
                                            <td><span>${article.posttime}</span></td>
                                            <td align="right"><span class="badge bg-main">热度 ${article.hints} ℃</span></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--内容结束-->

<!--尾部开始-->
<jsp include page="include/footer.jsp"/>
<!--尾部结束-->
</body>
</html>