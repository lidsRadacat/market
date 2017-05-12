//$(function() {
//	
//})
$.fn.ProvinceCity = function(){
	$.ajax({
		url: "/area",
		type: "get",
		dataType: "json",
		contentType: "application/json",
		success : function(data) {
			GP = data.result.province;
//			console.log(GP)
			GT = data.result.city;
//			console.log(GT)
			GC = data.result.county;
//			console.log(GC)
			console.log(data);
		},
		error: function(errs) {
			alert(errs.responseText);
        }
	});
	
	var _self = this;
	//定义3个默认值
	_self.data("province",["请选择", "请选择"]);
	_self.data("city1",["请选择", "请选择"]);
	_self.data("city2",["请选择", "请选择"]);
	//插入3个空的下拉框
	_self.append("<span class='select-box' style='width:150px;'><select class='select' id='provice' name='provice' size='1'></select></span>");
	_self.append("<span class='select-box' style='width:150px;'><select class='select' id='city' name='city' size='1'></select></span>");
	_self.append("<span class='select-box' style='width:150px;'><select class='select' id='county' name='county' size='1'></select></span>");
	//分别获取3个下拉框
	var $sel1 = _self.find("select").eq(0);
	var $sel2 = _self.find("select").eq(1);
	var $sel3 = _self.find("select").eq(2);
	//默认省级下拉
	if(_self.data("province")){
		$sel1.append("<option value='"+_self.data("province")[1]+"'>"+_self.data("province")[0]+"</option>");
	}
	$.each( GP , function(index,data){
		$sel1.append("<option value='"+data+"'>"+data+"</option>");
	});
	//默认的1级城市下拉
	if(_self.data("city1")){
		$sel2.append("<option value='"+_self.data("city1")[1]+"'>"+_self.data("city1")[0]+"</option>");
	}
	//默认的2级城市下拉
	if(_self.data("city2")){
		$sel3.append("<option value='"+_self.data("city2")[1]+"'>"+_self.data("city2")[0]+"</option>");
	}
	//省级联动 控制
	var index1 = "" ;
	$sel1.change(function(){
		//清空其它2个下拉框
		$sel2[0].options.length=0;
		$sel3[0].options.length=0;
		index1 = this.selectedIndex;
		if(index1==0){	//当选择的为 “请选择” 时
			if(_self.data("city1")){
				$sel2.append("<option value='"+_self.data("city1")[1]+"'>"+_self.data("city1")[0]+"</option>");
			}
			if(_self.data("city2")){
				$sel3.append("<option value='"+_self.data("city2")[1]+"'>"+_self.data("city2")[0]+"</option>");
			}
		}else{
			$.each( GT[index1-1] , function(index,data){
				$sel2.append("<option value='"+data+"'>"+data+"</option>");
			});
			$.each( GC[index1-1][0] , function(index,data){
				var county=data.split(";")[0];
				var id = data.split(";")[1];
				$sel3.append("<option value='"+id+"'>"+county+"</option>");
			})
		}
	}).change();
	//1级城市联动 控制
	var index2 = "" ;
	$sel2.change(function(){
		$sel3[0].options.length=0;
		index2 = this.selectedIndex;
		$.each( GC[index1-1][index2] , function(index,data){
			var county=data.split(";")[0];
			var id = data.split(";")[1];
			$sel3.append("<option value='"+id+"'>"+county+"</option>");
		})
	});
	return _self;
};