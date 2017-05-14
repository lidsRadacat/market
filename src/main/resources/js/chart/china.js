$(function() {
	$('#container').highcharts({
		chart: {
			type: 'pie',
			options3d: {
				enabled: true,
				alpha: 45,
				beta: 0
			}
		},
		title: {
			text: '中国各城市的销售额, 2017'
		},
		tooltip: {
			pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		},
		plotOptions: {
			pie: {
				allowPointSelect: true,
				cursor: 'pointer',
				depth: 35,
				dataLabels: {
					enabled: true,
					format: '{point.name}'
				}
			}
		},
		series: [{
			type: 'pie',
			name: '销售量',
			data: [
				['广州', 45.0],
				['上海', 26.8], {
					name: '北京',
					y: 12.8,
					sliced: true,
					selected: true
				},
				['杭州', 8.5],
				['天津', 6.2],
				['成都', 0.7]
			]
		}]
	});
});