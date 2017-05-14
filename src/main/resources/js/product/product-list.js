$('.table-sort').dataTable({
	"aaSorting": [
		[1, "asc"]
	], //默认第几个排序
	"bStateSave": true, //状态保存
	"aoColumnDefs": [{
			"orderable": false,
			"aTargets": [0, 8]
		} // 制定列不参与排序
	]
});
/*产品-添加*/
function product_add(title, url) {
	layer_show(title, url, 1080, 720);
}
/*产品-显示*/
function product_show(title,id) {
	layer_show(title, "product/"+id, 720, 720);
}
/*产品-下架*/
function product_stop(obj, id) {
	layer.confirm('确认要下架吗？', function(index) {
		$.ajax({
			url: "/product/stop/"+id,
			type: "patch",
			dataType: "json",
			contentType: "application/json",
			success : function(msg) {
				//要执行的代码
				alert("下架成功");
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_start(this,'+id+')" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
				$(obj).remove();
				layer.msg('已下架!', {
					icon: 5,
					time: 1000
				});
			},
		});
	});
}
/*产品-发布*/
function product_start(obj, id) {
	layer.confirm('确认要发布吗？', function(index) {
		$.ajax({
			url: "/product/start/"+id,
			type: "patch",
			dataType: "json",
			contentType: "application/json",
			success : function(msg) {
				//要执行的代码
				alert("发布成功");
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_stop(this,'+id+')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
				$(obj).remove();
				layer.msg('已发布!', {
					icon: 6,
					time: 1000
				});
			},
		});
	});
}
/*产品-编辑*/
function product_edit(title, id) {
	layer_show("编辑"+title, "/product/product-edit/"+id, 1080, 720);
	/* var index = layer.open({
		type: 2,
		title: "编辑"+title,
		content: "product-edit/"+id
	});
	layer.full(index); */
}
/*产品-删除*/
function product_del(obj, id) {
	layer.confirm('确认要删除吗？', function(index) {
		$.ajax({
			url: "/product/"+id,
			type: "delete",
			dataType: "json",
			contentType: "application/json",
			success : function(msg) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon: 1,
					time: 1000
				});
			},
		});
	});
}