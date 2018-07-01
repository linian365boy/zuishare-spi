package top.zuishare.spi.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class WebConfig implements Serializable {
	/** 
	 * @since JDK 1.7 
	 */ 
	private static final long serialVersionUID = 3408093442472626994L;
	//网站描述信息
	private String description;
	//网站的关键字
	private String keyword;
	//修改时间
	private Date updateTime;
	//当前时间
	private Date now;
	//web site http url(domain name)
	private String website;
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getNow() {
		return now;
	}

	public void setNow(Date now) {
		this.now = now;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
