$(function() {
	$('#container').highcharts({
		chart: {
			plotBackgroundColor: null,
			plotBorderWidth: null,
			plotShadow: false
		},
		title: {
			text: '全球用户占比图, 2017'
		},
		tooltip: {
			pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		},
		plotOptions: {
			pie: {
				allowPointSelect: true,
				cursor: 'pointer',
				dataLabels: {
					enabled: true,
					color: '#000000',
					connectorColor: '#000000',
					format: '<b>{point.name}</b>: {point.percentage:.1f} %'
				}
			}
		},
		series: [{
			type: 'pie',
			name: '用户总量',
			data: [
				['加拿大', 45.0],
				['美国', 26.8], {
					name: '中国',
					y: 12.8,
					sliced: true,
					selected: true
				},
				['非洲', 8.5],
				['欧洲', 6.2],
				['澳大利亚', 0.7]
			]
		}]
	});
});