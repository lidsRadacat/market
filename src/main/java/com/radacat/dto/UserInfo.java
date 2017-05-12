package com.radacat.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月9日 下午7:48:17
 * @version: V1.0
 */
public class UserInfo implements Serializable{
	private static final long serialVersionUID = -560867466128777720L;

	private String name;

    private String comment;

    private String gender;

    private String hometown;

    private Integer tradeId;

    private String functions;

    private Date   birthday;

    private String signature;

    private String email;

    private String mobile;

    private String phone;

    private String qq;

    private String weibo;

    private String skill;

    private String interest;

    private String lang;

    private String avatarFile;

    private Integer areaId;

    private String street;

    private String zip;

    private Long   companyId;

    private Long   createUid;
    
    private Integer roleId;
    
    private String login;
    
    private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public String getFunctions() {
		return functions;
	}

	public void setFunctions(String functions) {
		this.functions = functions;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getAvatarFile() {
		return avatarFile;
	}

	public void setAvatarFile(String avatarFile) {
		this.avatarFile = avatarFile;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCreateUid() {
		return createUid;
	}

	public void setCreateUid(Long createUid) {
		this.createUid = createUid;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", comment=" + comment + ", gender=" + gender
				+ ", hometown=" + hometown + ", tradeId=" + tradeId + ", function=" + functions + ", birthday="
				+ birthday + ", signature=" + signature + ", email=" + email + ", mobile=" + mobile + ", phone=" + phone
				+ ", qq=" + qq + ", weibo=" + weibo + ", skill=" + skill + ", interest=" + interest + ", lang=" + lang
				+ ", avatarFile=" + avatarFile + ", areaId=" + areaId + ", street=" + street + ", zip=" + zip
				+ ", companyId=" + companyId + ", createUid=" + createUid + ", roleId=" + roleId + ", login=" + login
				+ ", password=" + password + "]";
	}
}
