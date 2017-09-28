<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/25
  Time: 14:29
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
    <!--
        作者：大火兔 1979788761@qq.com
        时间：2015-11-17
        描述：使用官网CSS/JS同步最新版
    -->
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
            <!--
                作者：1979788761@qq.com
                时间：2015-11-18
                描述：LOGO及系统名称
            -->
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
            <li><a href="CourseManagement">选课管理</a></li>
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
    <div class="xl10 xs10 xm10 xb10 padding-small-top border-left">
        <ul class="bread bg">
        <li><a href="#" class="icon-home">首页</a> </li>
        <li><a href="#">系统中心</a></li>
        </ul>
        <div class="admin">
            <div class="line-big">
                <div class="xm3">
                    <div class="panel border-back">
                        <div class="panel-body text-center">
                            <img src="static/images/face.jpg" width="120" class="radius-circle">
                            <br> admin
                        </div>
                        <div class="panel-foot bg-back border-back">您好，admin，这是您第100次登录，上次登录为2014-10-1。</div>
                    </div>
                    <br>
                    <div class="panel">
                        <div class="panel-head"><strong>站点统计</strong></div>
                        <ul class="list-group">
                            <li><span class="float-right badge bg-red">88</span><span class="icon-user"></span> 会员</li>
                            <li><span class="float-right badge bg-main">828</span><span class="icon-file"></span> 文件</li>
                            <li><span class="float-right badge bg-main">828</span><span class="icon-shopping-cart"></span> 订单</li>
                            <li><span class="float-right badge bg-main">828</span><span class="icon-file-text"></span> 内容</li>
                            <li><span class="float-right badge bg-main">828</span><span class="icon-database"></span> 数据库</li>
                        </ul>
                    </div>
                    <br>
                </div>
                <div class="xm9">
                    <div class="alert alert-yellow"><span class="close"></span><strong>注意：</strong>您有5条未读信息，<a href="#">点击查看</a>。</div>
                    <div class="alert">
                        <h4>拼图前端框架介绍</h4>
                        <p class="text-gray padding-top">拼图是优秀的响应式前端CSS框架，国内前端框架先驱及领导者，自动适应手机、平板、电脑等设备，让前端开发像游戏般快乐、简单、灵活、便捷。</p>

                    </div>
                    <div class="panel">
                        <div class="panel-head"><strong>系统信息</strong></div>
                        <table class="table">
                            <tbody>
                            <tr>
                                <th colspan="2">服务器信息</th>
                                <th colspan="2">系统信息</th>
                            </tr>
                            <tr>
                                <td width="110" align="right">操作系统：</td>
                                <td>Windows 2008</td>
                                <td width="90" align="right">系统开发：</td>
                                <td><a href="http://www.pintuer.com" target="_blank">拼图前端框架</a></td>
                            </tr>
                            <tr>
                                <td align="right">Web服务器：</td>
                                <td>Apache</td>
                                <td align="right">主页：</td>
                                <td><a href="http://www.pintuer.com" target="_blank">http://www.pintuer.com</a></td>
                            </tr>
                            <tr>
                                <td align="right">程序语言：</td>
                                <td>PHP</td>
                                <td align="right">演示：</td>
                                <td><a href="http://www.pintuer.com/demo/" target="_blank">demo/</a></td>
                            </tr>
                            <tr>
                                <td align="right">数据库：</td>
                                <td>MySQL</td>
                                <td align="right">群交流：</td>
                                <td><a href="http://shang.qq.com/wpa/qunwpa?idkey=a08e4d729d15d32cec493212f7672a6a312c7e59884a959c47ae7a846c3fadc1" target="_blank">201916085</a> (点击加入)</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
    </div>
        <p class="text-right text-gray">基于<a class="text-gray" target="_blank" href="http://www.pintuer.com">拼图前端框架</a>构建</p>
        <br>
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

<div class="hidden">
    <script>
        var _hmt = _hmt || [];
        (function() {
            var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
            document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F637f0fe043ea4b7f59c05d4491e27667' type='text/javascript'%3E%3C/script%3E"));
        })();
    </script>
</div>
<script src="http://www.pintuer.com/js/jquery.js"></script>
<script src="http://www.pintuer.com/js/pintuer.js"></script>
<script src="http://www.pintuer.com/plugins/respond.js"></script>
<script src="http://www.pintuer.com/plugins/layer/layer.js"></script>
<script src="js/admin.js"></script>
<script>
    $(function() {
        //大于移动端800宽度才弹出提示
        if ($(window).width() >= 800) {
            layer.open({
                type: 1,
                shade: false,
                title: false, //不显示标题
                area: ['420px', '540px'],
                content: $('#alert-talk'), //捕获的元素
                cancel: function(index) {
                    layer.close(index);
                }
            });
        }
    });
</script>
</body>

</html>
