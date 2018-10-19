package com.boot.security.server.model;

import java.util.Date;

public class TArticle extends BaseEntity<Long> {

	private String title;
	private Integer classifyId;
	private Integer contentId;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

}
