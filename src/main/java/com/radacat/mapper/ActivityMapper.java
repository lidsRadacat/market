package com.radacat.mapper;

import com.radacat.domain.Activity;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Tue Apr 25 20:46:02 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Tue Apr 25 20:46:02 CST 2017
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Tue Apr 25 20:46:02 CST 2017
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Tue Apr 25 20:46:02 CST 2017
     */
    Activity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Tue Apr 25 20:46:02 CST 2017
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Tue Apr 25 20:46:02 CST 2017
     */
    int updateByPrimaryKey(Activity record);
}