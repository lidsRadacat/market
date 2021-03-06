package com.radacat.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="tb_user_log")
public class UserLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.owner_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
	private Long ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.ip
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private String ip;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Long createUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Long writeUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_log.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
	@Column
    private Date writeDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.id
     *
     * @return the value of tb_user_log.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.id
     *
     * @param id the value for tb_user_log.id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.active
     *
     * @return the value of tb_user_log.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public String getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.active
     *
     * @param active the value for tb_user_log.active
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.owner_id
     *
     * @return the value of tb_user_log.owner_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.owner_id
     *
     * @param ownerId the value for tb_user_log.owner_id
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.ip
     *
     * @return the value of tb_user_log.ip
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.ip
     *
     * @param ip the value for tb_user_log.ip
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.create_uid
     *
     * @return the value of tb_user_log.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.create_uid
     *
     * @param createUid the value for tb_user_log.create_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setCreateUid(Long createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.write_uid
     *
     * @return the value of tb_user_log.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Long getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.write_uid
     *
     * @param writeUid the value for tb_user_log.write_uid
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setWriteUid(Long writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.create_date
     *
     * @return the value of tb_user_log.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.create_date
     *
     * @param createDate the value for tb_user_log.create_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_log.write_date
     *
     * @return the value of tb_user_log.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_log.write_date
     *
     * @param writeDate the value for tb_user_log.write_date
     *
     * @mbggenerated Sat Apr 15 12:44:39 CST 2017
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}