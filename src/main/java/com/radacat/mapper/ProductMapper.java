package com.radacat.mapper;

import com.radacat.domain.Product;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbggenerated Mon May 01 01:46:17 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbggenerated Mon May 01 01:46:17 CST 2017
     */
    int insert(Product product);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbggenerated Mon May 01 01:46:17 CST 2017
     */
    int insertSelective(Product product);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbggenerated Mon May 01 01:46:17 CST 2017
     */
    Product selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbggenerated Mon May 01 01:46:17 CST 2017
     */
    int updateByPrimaryKeySelective(Product product);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbggenerated Mon May 01 01:46:17 CST 2017
     */
    int updateByPrimaryKey(Product product);
}