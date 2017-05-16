$(function() {
	$('#container').highcharts({
		title: {
			text: 'XX科技各产品每月销售额统计'
		},
		xAxis: {
			categories: ['一月', '二月', '三月', '四月', '五月']
		},
		labels: {
			items: [{
				html: '总量占比',
				style: {
					left: '50px',
					top: '18px',
					color: (Highcharts.theme && Highcharts.theme.textColor) || 'black'
				}
			}]
		},
		series: [{
			type: 'column',
			name: 'Radacat',
			data: [3, 2, 1, 3, 4]
		}, {
			type: 'column',
			name: '智能宠物项圈',
			data: [2, 3, 5, 7, 6]
		}, {
			type: 'column',
			name: '网关',
			data: [4, 3, 3, 9, 1]
		}, {
			type: 'spline',
			name: '平均值',
			data: [3, 2.67, 3, 6.33, 3.33],
			marker: {
				lineWidth: 2,
				lineColor: Highcharts.getOptions().colors[3],
				fillColor: 'white'
			}
		}, {
			type: 'pie',
			name: '总量',
			data: [{
				name: 'Radacat',
				y: 13,
				color: Highcharts.getOptions().colors[0] // Radacat's color
			}, {
				name: '智能宠物项圈',
				y: 23,
				color: Highcharts.getOptions().colors[1] // 智能宠物项圈's color
			}, {
				name: '网关',
				y: 19,
				color: Highcharts.getOptions().colors[2] // 网关's color
			}],
			center: [100, 80],
			size: 100,
			showInLegend: false,
			dataLabels: {
				enabled: false
			}
		}]
	});
});