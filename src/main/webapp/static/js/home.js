$(function() {
    /*当前页面导航高亮*/
    var href_all = window.location.href.split('/')[window.location.href.split('/').length - 1];
    var href = href_all.split('?')[0];
    var href1 = href_all.split("&")[0];
    if (href.length > 0) {
        $(function() {
            $(".doc-menu ul a[href='" + href + "']").addClass("active");
            $(".doc-menu ul a[href='" + href1 + "']").addClass("active");
        });
    } else {
        $(function() {
            $(".doc-menu ul a[href^='Index']").addClass("active");
        });
    }

    $('.student_sno').click(function() {
        var requestData = {sno: $(this).text()};
        $('.photo').load('ShowPicServlet', requestData);
        $('.photo').fadeOut().fadeIn();
        return false;
    });

    $(".small").click(function() {
        var thisele = $(".article-content").css("font-size");
        var textfontsize = parseFloat(thisele);
        textfontsize -= 2;
        $(".article-content").css('font-size', textfontsize);
//        $(".article-content").animate({fontSize:"-=2"});
    });

    $(".big").click(function() {
        var thisele = $(".article-content").css("font-size");
        var textfontsize = parseFloat(thisele);
        textfontsize += 2;
        $(".article-content").css('font-size', textfontsize);
//        $(".article-content").animate({fontSize:"+=2"});
    });

    $(".article-content").click(function() {
        if ($(".article-content").css('background-color') === 'rgb(199, 237, 204)')
            $(".article-content").css('background', '#F5F5F5');
        else
            $(".article-content").css('background', 'rgb(199, 237, 204)');
    });
});

//展开合并下级
function DisplayRows(id)
{
    var rowpid = $("div[rel='rowpid_" + id + "']");
    var rowid = $("span[id='rowid_" + id + "']");

    if (rowid.attr("class") === "disimg")
    {
        rowpid.slideUp(200);
        rowid.attr("class", "disimg2");
    }
    else
    {
        rowpid.slideDown(200);
        rowid.attr("class", "disimg");
    }
}

//全部显示行
function ShowAllRows()
{
    $("div[rel^='rowpid'][rel!='rowpid_0']").slideDown(200);
    ;
    $("span[id^='rowid']").attr("class", "disimg");
}


//全部隐藏行
function HideAllRows()
{
    $("div[rel^='rowpid'][rel!='rowpid_0']").slideUp(200);
    ;
    $("span[id^='rowid']").attr("class", "disimg2");
}
