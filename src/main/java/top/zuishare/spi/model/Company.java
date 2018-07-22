package top.zuishare.spi.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable{
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 公司名称
	 */
	private String name;
	/**
	 * 公司联系方式
	 */
	private String telPhone;
	/**
	 * 子联系人电话
	 */
	private String secondTelPhone;
	/**
	 * 公司地址
	 */
	private String address;
	/**
	 * 公司邮箱
	 */
	private String email;
	/**
	 * 子联系人邮箱
	 */
	private String secondEmail;
	/**
	 * 公司简介
	 */
	private String introduce;
	/**
	 * 公司logo标志
	 */
	private String logo;
	/**
	 * 热线图片标志
	 */
	private String phonePic;
	/**
	 * 公司口号
	 */
	private String slogan;
	/**
	 * 公司网站
	 */
	private String website;
	/**
	 * 公司创建日期
	 */
	private Date createDate;
	/**
	 * 联系人
	 */
	private String contactUser;

	/**
	 * 联系人facebbook地址
	 */
	private String contactUserFacebook;
	/**
	 * 联系人Twitter地址
	 */
	private String contactUserTwitter;
	/**
	 * 联系人Google+地址
	 */
	private String contactUsergooglePlus;
	/**
	 * 联系人Instagram地址
	 */
	private String contactUserinstagram;
	/**
	 * 联系人linkedin地址
	 */
	private String contactUserlinkedin;
	/**
	 * 联系人skyke
	 */
	private String contactUserSkype;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelPhone() {
		return telPhone;
	}
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getPhonePic() {
		return phonePic;
	}
	public void setPhonePic(String phonePic) {
		this.phonePic = phonePic;
	}
	public String getContactUser() {
		return contactUser;
	}
	public void setContactUser(String contactUser) {
		this.contactUser = contactUser;
	}
	public String getContactUserFacebook() {
		return contactUserFacebook;
	}
	public void setContactUserFacebook(String contactUserFacebook) {
		this.contactUserFacebook = contactUserFacebook;
	}
	public String getContactUserTwitter() {
		return contactUserTwitter;
	}
	public void setContactUserTwitter(String contactUserTwitter) {
		this.contactUserTwitter = contactUserTwitter;
	}
	public String getContactUsergooglePlus() {
		return contactUsergooglePlus;
	}
	public void setContactUsergooglePlus(String contactUsergooglePlus) {
		this.contactUsergooglePlus = contactUsergooglePlus;
	}
	public String getContactUserinstagram() {
		return contactUserinstagram;
	}

	public String getContactUserlinkedin() {
		return contactUserlinkedin;
	}

	public void setContactUserlinkedin(String contactUserlinkedin) {
		this.contactUserlinkedin = contactUserlinkedin;
	}

	public void setContactUserinstagram(String contactUserinstagram) {
		this.contactUserinstagram = contactUserinstagram;
	}

	public String getSecondTelPhone() {
		return secondTelPhone;
	}

	public void setSecondTelPhone(String secondTelPhone) {
		this.secondTelPhone = secondTelPhone;
	}

	public String getSecondEmail() {
		return secondEmail;
	}

	public void setSecondEmail(String secondEmail) {
		this.secondEmail = secondEmail;
	}

	public String getContactUserSkype() {
		return contactUserSkype;
	}

	public void setContactUserSkype(String contactUserSkype) {
		this.contactUserSkype = contactUserSkype;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toStringExclude(this, "introduce");
	}
}
