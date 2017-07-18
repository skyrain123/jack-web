(function($) {
    var loadObj;
    $.extend({
        myAjax: function(settings) { // 自定义Ajax
            $.loading();
            var options = $.extend(true, {}, settings, {
                success: function(data) {
                    $.loaded();
                    if(data.code == 200) {
                        if(settings.success instanceof Function) {
                            settings.success(data.data);
                        }
                    } else {
                        if(settings.error instanceof Function) {
                            settings.error(data);
                        } else {
                            $.alertError(data);
                        }
                    }
                },
                error: function(data) {
                    $.loaded();
                    if(settings.error instanceof Function) {
                        settings.error(data);
                    } else {
                        $.alertError(data);
                    }
                }
            });
            $.ajax(options);
        },
        loading: function() { // 加载中效果
            loadObj = $('<div class="load"></div>');
            $("html").append(loadObj);
        },
        loaded: function() { // 加载中效果（移除）
            loadObj.remove();
        },
        alert: function(msg, type, showTime) {// 提示框（type：success、info、warning、danger）
            type = type || 'info';
            var alertObj = $('<div class="alert alert-' + type + '" role="alert">'
            + msg
            + '<button type="button" class="close" data-dismiss="alert">&times;</button>'
            + '</div>');
            $("html").append(alertObj);
            setTimeout(function() {
                alertObj.animate({opacity : 0}, "slow", "linear", function() {
                    $(this).remove();
                });
            }, 1000 + (showTime || 2000));
        },
        alertError: function(data) {// 显示错误信息
            if (!data.code) {
                $.alert("网络异常", "danger");
            } else if (data.data) {
                $.alert(data.data, "danger");
            } else {
                $.alert("系统异常", "danger");
            }
        },
        goURL: function(url, time) { // 延迟跳转（默认延迟时间0）
            setTimeout(function() {
                window.location = url;
            }, time || 0);
        }
    });
})(jQuery);