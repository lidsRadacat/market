$(function() {
	// Set up the chart
	var chart = hightchar();
	
	// Activate the sliders
	$('#R0').on('change', function() {
		chart.options.chart.options3d.alpha = this.value;
		showValues();
		chart.redraw(false);
	});
	
	$('#R1').on('change', function() {
		chart.options.chart.options3d.beta = this.value;
		showValues();
		chart.redraw(false);
	});

	function showValues() {
		$('#R0-value').html(chart.options.chart.options3d.alpha);
		$('#R1-value').html(chart.options.chart.options3d.beta);
	}
	showValues();
	
	function hightchar() {
		return new Highcharts.Chart({
			chart: {
				renderTo: 'container',
				type: 'column',
				margin: 75,
				options3d: {
					enabled: true,
					alpha: 15,
					beta: 15,
					depth: 50,
					viewDistance: 25
				}
			},
			title: {
				text: '十大经销商'
			},
			subtitle: {
				text: '销售额排名前十的经销商'
			},
			xAxis: {
				categories: ['张三', '李四', '王五', '赵六', '孙七', '王八', '丽丽', '小明', '小红', '小王']
			},
			yAxis: {
				title: {
					text: '销售量 (万元)'
				},
				plotLines: [{
					value: 0,
					width: 1,
					color: '#808080'
				}]
			},
			plotOptions: {
				column: {
					depth: 25
				}
			},
			series: [{
				name: '销量',
				data: [299.9, 171.5, 136.4, 129.2, 114.0, 106.0, 95.6, 88.5, 66.4, 54.1]
			}]
		});
	}
});