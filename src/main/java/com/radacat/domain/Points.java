package com.radacat.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_points")
public class Points {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Id
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.operation
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String operation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.reletive_point
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Double reletivePoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.max_point_day
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Double maxPointDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.comment
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Long createUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Long writeUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_points.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Date writeDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getReletivePoint() {
		return reletivePoint;
	}

	public void setReletivePoint(Double reletivePoint) {
		this.reletivePoint = reletivePoint;
	}

	public Double getMaxPointDay() {
		return maxPointDay;
	}

	public void setMaxPointDay(Double maxPointDay) {
		this.maxPointDay = maxPointDay;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getCreateUid() {
		return createUid;
	}

	public void setCreateUid(Long createUid) {
		this.createUid = createUid;
	}

	public Long getWriteUid() {
		return writeUid;
	}

	public void setWriteUid(Long writeUid) {
		this.writeUid = writeUid;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
}