$(function() {
	$('.table-sort').dataTable({
		"aaSorting": [
			[1, "asc"]
		], //默认第几个排序
		"bStateSave": true, //状态保存
		"aoColumnDefs": [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable": false,
				"aTargets": [0, 10]
			} // 制定列不参与排序
		]
	});
	$('.table-sort tbody').on('click', 'tr', function() {
		if($(this).hasClass('selected')) {
			$(this).removeClass('selected');
		} else {
			table.$('tr.selected').removeClass('selected');
			$(this).addClass('selected');
		}
	});
});
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function admin_add(title, url, w, h) {
	layer_show(title, url, w, h);
}
/*管理员-删除*/
function admin_del(obj, id) {
	layer.confirm('确认要删除吗？', function(index) {
		//此处请求后台程序，下方是成功后的前台处理……
		$.ajax({
			url: "/admin/"+id,
			type: "delete",
			dataType: "json",
			contentType: "application/json",
			success : function(msg) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon: 1,
					time: 2000
				});
			},
		});
		
	});
}
/*密码-修改*/
function change_password(title, id) {
	layer_show(title, '/admin/admin-edit-pwd/'+id, '460', '500');
}

/*管理员-编辑*/
function admin_edit(title, id) {
	layer_show(title, '/admin/admin-edit/'+id, '460', '500');
}
/*管理员-查看*/
function admin_show(title,id) {
	layer_show(title, '/admin/'+id, '460','500');
}