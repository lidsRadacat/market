package com.radacat.service;

import java.util.List;

import com.radacat.domain.Goal;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:30:05
 * @version: V1.0
 */
public interface GoalService {
	public void add(Goal goal);
	public void update(Goal goal);
	public void delete(Goal goal);
	public Goal find(Goal goal);
	public List<Goal> findList(int pageNum, int pageSize);
}
