package com.boot.security.server.model;

import java.util.Date;

/**
 * 友情链接
 */
public class TLinks extends BaseEntity<Long> {

	private String name;
	private String pic;
	private String url;
	private String status;
	private Integer sortNo;
	private String addUser;
	private String modUser;
	private String pageTitle;
	private String pageKeywords;
	private String pageDescription;
	private Integer seoType;
	private String type;
	private Date createTime;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getSortNo() {
		return sortNo;
	}
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	public String getAddUser() {
		return addUser;
	}
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}
	public String getModUser() {
		return modUser;
	}
	public void setModUser(String modUser) {
		this.modUser = modUser;
	}
	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	public String getPageKeywords() {
		return pageKeywords;
	}
	public void setPageKeywords(String pageKeywords) {
		this.pageKeywords = pageKeywords;
	}
	public String getPageDescription() {
		return pageDescription;
	}
	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}
	public Integer getSeoType() {
		return seoType;
	}
	public void setSeoType(Integer seoType) {
		this.seoType = seoType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
