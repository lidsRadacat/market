package com.radacat.mapper;

import com.radacat.domain.Goal;

public interface GoalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goal
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goal
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int insert(Goal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goal
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int insertSelective(Goal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goal
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    Goal selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goal
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int updateByPrimaryKeySelective(Goal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goal
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int updateByPrimaryKey(Goal record);
}