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
				"aTargets": [0, 4]
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
/*管理员-角色-添加*/
function admin_role_add(title, url, w, h) {
	layer_show(title, url, w, h);
}
/*管理员-角色-编辑*/
function admin_role_edit(title, url, id, w, h) {
	layer_show(title, url, w, h);
}
/*管理员-角色-删除*/
function admin_role_del(obj, id) {
	layer.confirm('角色删除须谨慎，确认要删除吗？', function(index) {
		//此处请求后台程序，下方是成功后的前台处理……

		$(obj).parents("tr").remove();
		layer.msg('已删除!', {
			icon: 1,
			time: 1000
		});
	});
}