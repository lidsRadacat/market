package com.radacat.mapper;

import com.radacat.domain.UserRole;
import com.radacat.domain.UserRoleKey;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int deleteByPrimaryKey(UserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    UserRole selectByPrimaryKey(UserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_role
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    int updateByPrimaryKey(UserRole record);
}