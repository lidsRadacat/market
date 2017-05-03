$(function() {
	// 发送验证码按钮
	var sendMobileCode = document.getElementById("sendMobileCode");
	$("#sendMobileCode").click(function() {
		$.ajax({
			url: "api/mobile?username="+$("#username").val(),
			type: "get",
			dataType: "json",
			contentType: "application/json",
			success: function(data) {
				//要执行的代码
				if(data.code === '20000'){
					layer.msg('发送成功!', {
						icon: 1,
						time: 1000
					});					
				}else{
					alert("未知异常")
				}
			},
			error: function(errs) {
				alert(errs.responseText);
            }
		});
		sendMobileCode.value = "剩余60 秒";
		var sendMobileCodeTimer = window.setInterval(function() {
			var second = parseInt(sendMobileCode.value.substring(2, 4));
			second--;
			sendMobileCode.value = "剩余" + second + "  秒";
			sendMobileCode.disabled = true;
			if (second == 0) {
				clearInterval(sendMobileCodeTimer);
				sendMobileCode.value = " 发送短信验证码 ";
				sendMobileCode.disabled = false;
			}
		}, 1000);
	});

	// 登录按钮
	$("#login").click(function() {
		location.href = "login.html";
	});

	$("#form-user-register").validate({
		rules: {
			username: {
				required: true,
				isMobile: true,
			},
			password: {
				required: true,
				isPassword: true,
			},
			password2: {
				required: true,
				equalTo: "#password"
			},
			mobileCode: {
				required: true,
				isCode: true,
			}
		},
		onkeyup: false,
		focusCleanup: true,
		success: "valid",
		onsubmit:true,// 是否在提交是验证
		submitHandler: function(form) {
			//进行ajax传值
			$.ajax({
				url: "api/user",
				type: "post",
				dataType: "json",
				contentType: "application/x-www-form-urlencoded",
				data: {
					username: $("#username").val(),
					password: $("#password").val(),
					mobilecode: $("#mobilecode").val(),
				},
				success: function(data) {
					//要执行的代码
					if(data.code === '20000'){
						var second = 3;
						var Timer = window.setInterval(function() {
							layer.msg('注册成功! '+second+'后跳转到登录页面......', {
								icon: 1,
								time: 1000
							});
							second -= 1;
							if (second == 0) {
								clearInterval(Timer);
								location.href = "login";								
							}
						}, 1000);
						alert("注册成功");
					}else{
						alert("未知异常")
					}
				},
				error: function(errs) {
					alert(errs.responseText);
                }
			});
			return false;
		},
		invalidHandler: function(form, validator) {return false;}
	});
});