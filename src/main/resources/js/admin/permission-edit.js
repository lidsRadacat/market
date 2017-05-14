$(function() {
	$("#form-admin-role-edit").validate({
		rules: {
			roleName: {
				required: true,
			},
			url:{
				required: true,
			}
		},
		onkeyup: false,
		focusCleanup: true,
		success: "valid",
		submitHandler: function(form) {
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);
		}
	});
});