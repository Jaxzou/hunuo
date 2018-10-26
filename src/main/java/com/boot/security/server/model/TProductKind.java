package com.boot.security.server.model;

import java.util.Date;

/**
 * 产品分类
 */
public class TProductKind extends BaseEntity<Long> {

	private Integer pkId;
	private String code;
	private Integer parentId;
	private String name;
	private String pic;
	private String file;
	private String content;
	private String url;
	private String status;
	private Integer sortNo;
	private String addUser;
	private Date createTime;
	private String modUser;
	private String classList;
	private Integer classLayer;
	private String pageTitle;
	private String pageKeywords;
	private String pageDescription;
	private Integer seoType;
	private Integer siteId;
	private String isIndex;
	private String htmlName;
	private String cViewName;
	private String kViewName;
	private String lViewName;
	private String dViewName;

	public Integer getPkId() {
		return pkId;
	}
	public void setPkId(Integer pkId) {
		this.pkId = pkId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
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
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModUser() {
		return modUser;
	}
	public void setModUser(String modUser) {
		this.modUser = modUser;
	}
	public String getClassList() {
		return classList;
	}
	public void setClassList(String classList) {
		this.classList = classList;
	}
	public Integer getClassLayer() {
		return classLayer;
	}
	public void setClassLayer(Integer classLayer) {
		this.classLayer = classLayer;
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
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public String getIsIndex() {
		return isIndex;
	}
	public void setIsIndex(String isIndex) {
		this.isIndex = isIndex;
	}
	public String getHtmlName() {
		return htmlName;
	}
	public void setHtmlName(String htmlName) {
		this.htmlName = htmlName;
	}
	public String getCViewName() {
		return cViewName;
	}
	public void setCViewName(String cViewName) {
		this.cViewName = cViewName;
	}
	public String getKViewName() {
		return kViewName;
	}
	public void setKViewName(String kViewName) {
		this.kViewName = kViewName;
	}
	public String getLViewName() {
		return lViewName;
	}
	public void setLViewName(String lViewName) {
		this.lViewName = lViewName;
	}
	public String getDViewName() {
		return dViewName;
	}
	public void setDViewName(String dViewName) {
		this.dViewName = dViewName;
	}

}
