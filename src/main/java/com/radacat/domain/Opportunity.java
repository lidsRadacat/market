package com.radacat.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_opportunity")
public class Opportunity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.name
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
	private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.user_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
	private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.product_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
	private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.quantity
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
	private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.volume
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private BigDecimal volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.stage_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Integer stageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.comment
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.type
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Long createUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Long writeUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_opportunity.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Date writeDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.id
     *
     * @return the value of tb_opportunity.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.id
     *
     * @param id the value for tb_opportunity.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.active
     *
     * @return the value of tb_opportunity.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public String getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.active
     *
     * @param active the value for tb_opportunity.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.name
     *
     * @return the value of tb_opportunity.name
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.name
     *
     * @param name the value for tb_opportunity.name
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.user_id
     *
     * @return the value of tb_opportunity.user_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.user_id
     *
     * @param userId the value for tb_opportunity.user_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.product_id
     *
     * @return the value of tb_opportunity.product_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.product_id
     *
     * @param productId the value for tb_opportunity.product_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.quantity
     *
     * @return the value of tb_opportunity.quantity
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.quantity
     *
     * @param quantity the value for tb_opportunity.quantity
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.volume
     *
     * @return the value of tb_opportunity.volume
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.volume
     *
     * @param volume the value for tb_opportunity.volume
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.stage_id
     *
     * @return the value of tb_opportunity.stage_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Integer getStageId() {
        return stageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.stage_id
     *
     * @param stageId the value for tb_opportunity.stage_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.comment
     *
     * @return the value of tb_opportunity.comment
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.comment
     *
     * @param comment the value for tb_opportunity.comment
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.type
     *
     * @return the value of tb_opportunity.type
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.type
     *
     * @param type the value for tb_opportunity.type
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.create_uid
     *
     * @return the value of tb_opportunity.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.create_uid
     *
     * @param createUid the value for tb_opportunity.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setCreateUid(Long createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.write_uid
     *
     * @return the value of tb_opportunity.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.write_uid
     *
     * @param writeUid the value for tb_opportunity.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setWriteUid(Long writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.create_date
     *
     * @return the value of tb_opportunity.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.create_date
     *
     * @param createDate the value for tb_opportunity.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_opportunity.write_date
     *
     * @return the value of tb_opportunity.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_opportunity.write_date
     *
     * @param writeDate the value for tb_opportunity.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}