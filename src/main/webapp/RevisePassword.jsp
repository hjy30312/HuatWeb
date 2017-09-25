
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
            <li><a href="#">选课管理</a></li>
        </div>
        <hr />
        <div class="padding-little">
            <li><a href="#">信息维护</a></li>
        </div>
        <hr />
        <div class="padding-little">
            <li><a href="#">修改密码</a></li>
        </div>
    </div>
    <div class="xl10 xs10 xm10 xb10 padding-small-top border-left">
        <ul class="bread bg">
            <li><a href="#" class="icon-home">首页</a> </li>
            <li><a href="#">系统中心</a></li>
        </ul>
        <form action="RevisePassword"  method="post" class="form form-block">
            <div class="form-group">
                <div class="label">
                    <label for="oldpassword">
                        原始密码</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="oldPassword" name="oldPassword" size="50" data-validate="required:必填" placeholder="原密码" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="newPassword">
                        密码</label>
                </div>
                <div class="field">
                    <input type="password" class="input" id="newPassword" name="newPassword" size="50" data-validate="required:必填" placeholder="新密码" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="rePassword">
                        确认密码</label>
                </div>
                <div class="field">
                    <input type="password" class="input" id="rePassword" name="rePassword" size="50" data-validate="required:必填" placeholder="确认密码" />
                </div>
            </div>
            <div class="form-button">
                <button class="button" type="submit">
                    登录</button>
            </div>
        </form>
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
