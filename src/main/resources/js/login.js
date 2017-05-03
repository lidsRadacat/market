$(function() {
	$("#register").click(function() {
		location.href = "register";
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
			}/*,
			validate: {
				required: true,
			}*/
		},
		onkeyup: false,
		focusCleanup: true,
//		success:"valid",
//		onsubmit:true,// 是否在提交是验证
//		submitHandler:function(form) {
			// 进行ajax传值
//			 $(form).ajaxSubmit({
//	            dataType:"json",
//	            success:function( jsondata ){
//	                if( jsondata.code = 200 ){
//	                    alert("success");
//	                }else{
//	                    alert("fail");
//	                }
//	              }
//	        });
//			$.ajax({
//				url: "api/login",
//				type: "post",
//				dataType: "json",
//				contentType: "application/x-www-form-urlencoded",
//				data: {
//					username: $("#username").val(),
//					password: $("#password").val(),
//					validate: $("#validate").val(),
//					remeberMe: $("input:[name='remeberMe']:checked").val(),
//				},
//				success: function(data) {
//					console.log("data");
//					alert(data);
//					// 要执行的代码
//					if(data.code === '20000'){
//						layer.msg('登录成功!', {
//							icon: 1,
//							time: 1000
//						});
//						location.href = "index";
//					}else{
//						alert("错误");
//					}
//				},
//				error: function(errs) {
//					alert(errs.responseText);
//                },
//			});
//		},
//		invalidHandler: function(form, validator) {return false;}
	});
});

function login(){
    var flag = $("#form-user-login").valid();
    if(!flag){
        //没有通过验证
        return;
    }
    
	$.ajax({
	url: "api/login",
	type: "post",
	dataType: "json",
	contentType: "application/x-www-form-urlencoded",
	data: {
		username: $("#username").val(),
		password: $("#password").val(),
		validate: $("#validate").val(),
		remeberMe: $("remeberMe").val(),
	},
	success: function(data) {
		console.log("data");
//		alert(data);
		// 要执行的代码
		if(data.code === '20000'){
			layer.msg('登录成功!', {
				icon: 1,
				time: 1000
			});
			location.href = "index";
		}else{
			alert("错误");
		}
	},
	error: function(errs) {
		alert(errs.responseText);
    },
});
}