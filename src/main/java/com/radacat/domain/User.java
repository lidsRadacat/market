package com.radacat.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity()
@Table(name="tb_user")
public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.active
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private String active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.login
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private String login;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.password
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.salt
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.partner_id
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private Long partnerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.register_ip
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private String registerIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.register_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private Date registerDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.create_uid
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private Long createUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.write_uid
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private Long writeUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.create_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.write_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
	@Column
    private Date writeDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.active
     *
     * @return the value of tb_user.active
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public String getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.active
     *
     * @param active the value for tb_user.active
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.login
     *
     * @return the value of tb_user.login
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.login
     *
     * @param login the value for tb_user.login
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.salt
     *
     * @return the value of tb_user.salt
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.salt
     *
     * @param salt the value for tb_user.salt
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.partner_id
     *
     * @return the value of tb_user.partner_id
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.partner_id
     *
     * @param partnerId the value for tb_user.partner_id
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.register_ip
     *
     * @return the value of tb_user.register_ip
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.register_ip
     *
     * @param registerIp the value for tb_user.register_ip
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.register_date
     *
     * @return the value of tb_user.register_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.register_date
     *
     * @param registerDate the value for tb_user.register_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.create_uid
     *
     * @return the value of tb_user.create_uid
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Long getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.create_uid
     *
     * @param createUid the value for tb_user.create_uid
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setCreateUid(Long createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.write_uid
     *
     * @return the value of tb_user.write_uid
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Long getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.write_uid
     *
     * @param writeUid the value for tb_user.write_uid
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setWriteUid(Long writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.create_date
     *
     * @return the value of tb_user.create_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.create_date
     *
     * @param createDate the value for tb_user.create_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.write_date
     *
     * @return the value of tb_user.write_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.write_date
     *
     * @param writeDate the value for tb_user.write_date
     *
     * @mbggenerated Wed Apr 19 18:39:30 CST 2017
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}