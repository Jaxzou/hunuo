package com.boot.security.server.model;



public class TArticleContent extends BaseEntity<Long> {

	private String content;

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
