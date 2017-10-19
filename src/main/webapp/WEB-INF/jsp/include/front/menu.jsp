<%@ page pageEncoding="UTF-8" %>
<div class="page-nav margin-big-bottom">
    <div class="container">
        <div class="line-big padding-top padding-bottom border-bottom">
            <div class="xs3 xm3 xb3">
                <button class="button icon-navicon margin-top float-right" data-target="#navbar">
                </button>
                <div class="media media-x" style="margin-top: 0;">
                    <div class="float-left txt txt-big text-main radius-small ring-hover">
                        <strong class="icon-paper-plane-o"></strong>
                    </div>
                    <div class="media-body padding-top">
                        <h2 class="text-main"><strong>教学演示系统</strong></h2>
                        数据库系统实现课程教学案例
                    </div>
                </div>
            </div>
            <div class="xl12 xs9 xm9 xb9">
                <div class="doc-menu">
                    <ul class="nav nav-menu nav-inline nav-pills nav-navicon border-main padding-big-top padding-big-left" id="navbar">
                        <li><a href="Index">系统首页</a> </li>
                        <li><a href="StudentList">学生信息<span class="arrow"></span></a>
                            <ul class="drop-menu">
                                <li><a href="StudentList?style=table">学生信息 - 表格样式</a> </li>
                                <li class="divider"></li>
                                <li><a href="StudentList?style=frame">学生信息 - 列表样式</a></li>
                            </ul>
                        </li>
                        <li><a href="CourseList">课程信息</a></li>
                        <li><a href="ScList">选课信息<span class="arrow"></span></a>
                            <ul class="drop-menu">
                                <li><a href="ScList?style=tree">选课信息 - 树形样式</a> </li>
                                <li class="divider"></li>
                                <li><a href="ScList?style=table">选课信息 - 表格样式</a></li>
                            </ul>
                        </li>
                        <li><a href="ArticleList">资料信息<span class="arrow"></span></a>
                            <ul class="drop-menu">
                                <mytag:categorymenutag />
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>