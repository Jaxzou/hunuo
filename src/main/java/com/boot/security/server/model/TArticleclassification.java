package com.boot.security.server.model;


/**
 * 文章分类
 */
public class TArticleclassification extends BaseEntity<Long> {

	private String name;
	private Integer parentId;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
