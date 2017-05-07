package com.radacat.vo;

import java.util.List;

import com.radacat.domain.HistoryPoint;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月20日 上午9:23:09
 * @version: V1.0
 */
public class UserPointsVo {
	private UserPointsVo userPointsVo;
	private List<HistoryPoint> historyPoints;
	public UserPointsVo getUserPointsVo() {
		return userPointsVo;
	}
	public void setUserPointsVo(UserPointsVo userPointsVo) {
		this.userPointsVo = userPointsVo;
	}
	public List<HistoryPoint> getHistoryPoints() {
		return historyPoints;
	}
	public void setHistoryPoints(List<HistoryPoint> historyPoints) {
		this.historyPoints = historyPoints;
	}
	
}
