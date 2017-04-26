$("#register").click(function() {
	location.href = "register.html";
});

$("#code").click(function() {
 	var img = document.getElementById("code");  
	img.src = "/code?time=" + Math.random();
});

$("#kanbuq").click(function() {
 	var img = document.getElementById("code");
	img.src = "/code?time=" + Math.random();
});

$("#form-user-login").validate({
	rules: {
		username: {
			required: true,
			isMobile: true,
		},
		password: {
			required: true,
			isPassword: true,
		},
	},
	onkeyup: false,
	focusCleanup: true,
	success: "valid",
	onsubmit:true,// 是否在提交是验证
	submitHandler: function(form) {
		//进行ajax传值
		$.ajax({
			url: "login",
			type: "post",
			dataType: "json",
			contentType: "application/x-www-form-urlencoded",
			data: {
				username: $("#username").val(),
				password: $("#password").val(),
				validate: $("#validate").val(),
				remeberMe: $("input:[name='remeberMe']:checked").val(),
			},
			success : function(msg) {
				//要执行的代码
				alert("登录成功");
			}
		});
	},
	invalidHandler: function(form, validator) {return false;}
});