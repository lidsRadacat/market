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
				"aTargets": [0, 5]
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
/*管理员-权限-添加*/
function admin_permission_add(title, url, w, h) {
	layer_show(title, url, w, h);
}
/*管理员-权限-编辑*/
function admin_permission_edit(title, url, id, w, h) {
	layer_show(title, url, w, h);
}

/*管理员-权限-删除*/
function admin_permission_del(obj, id) {
	layer.confirm('角色删除须谨慎，确认要删除吗？', function(index) {
		$(obj).parents("tr").remove();
		layer.msg('已删除!', {
			icon: 1,
			time: 1000
		});
	});
}