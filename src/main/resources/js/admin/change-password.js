$(function() {
	$("#form-change-password").validate({
		rules: {
			newpassword: {
				required: true,
				minlength: 6,
				maxlength: 16
			},
			newpassword2: {
				required: true,
				minlength: 6,
				maxlength: 16,
				equalTo: "#newpassword"
			},
		},
		onkeyup: false,
		focusCleanup: true,
		success: "valid",
		submitHandler: function(form) {
			$(form).ajaxSubmit(
				{
					type: 'post', // 提交方式 get/post
					url: '', // 需要提交的 url
					data: {
						'title': title,
						'content': content
					},
					success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
						// 此处可对 data 作相关处理
						alert('提交成功！');
					},
				}
			);
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
});