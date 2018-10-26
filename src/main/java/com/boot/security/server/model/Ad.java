package com.boot.security.server.model;

import java.util.Date;

/**
 * 广告
 */
public class Ad extends BaseEntity<Long> {

	private String title;
	private String adOverview;
	private String adUrl;
	private String imgUrl;
	private String sort;
	private Date time;
	private String status;

	public String getAdOverview() {
		return adOverview;
	}
	public void setAdOverview(String adOverview) {
		this.adOverview = adOverview;
	}
	public String getAdUrl() {
		return adUrl;
	}
	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
