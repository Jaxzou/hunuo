package com.boot.security.server.model;

import java.util.Date;

public class TProduct extends BaseEntity<Long> {

	private Integer pkid;
	private String name;
	private String pic;
	private String content;
	private String url;
	private Integer hist;
	private String notes;
	private String status;
	private Integer sortNo;
	private String addUser;
	private Date addTime;
	private String modUser;
	private Integer productKindId;
	private String no;
	private String pageTitle;
	private String pageKeywords;
	private String pageDescription;
	private Integer seoType;
	private Integer siteId;
	private Integer tab1;
	private Integer tab2;
	private Integer tab3;
	private Integer tab4;
	private Integer tab5;
	private String titleTab1;
	private String titleTab2;
	private String titleTab3;
	private String titleTab4;
	private String titleTab5;
	private String contentTab1;
	private String contentTab2;
	private String contentTab3;
	private String contentTab4;
	private String contentTab5;
	private String price;
	private String marketPrice;
	private String fileUrl;
	private String memberPrice;
	private String isNew;
	private String isRecommend;
	private String isHot;
	private String isUser;
	private String htmlName;

	public Integer getPkid() {
		return pkid;
	}
	public void setPkid(Integer pkid) {
		this.pkid = pkid;
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
	public Integer getHist() {
		return hist;
	}
	public void setHist(Integer hist) {
		this.hist = hist;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
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
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getModUser() {
		return modUser;
	}
	public void setModUser(String modUser) {
		this.modUser = modUser;
	}
	public Integer getProductKindId() {
		return productKindId;
	}
	public void setProductKindId(Integer productKindId) {
		this.productKindId = productKindId;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public Integer getTab1() {
		return tab1;
	}
	public void setTab1(Integer tab1) {
		this.tab1 = tab1;
	}
	public Integer getTab2() {
		return tab2;
	}
	public void setTab2(Integer tab2) {
		this.tab2 = tab2;
	}
	public Integer getTab3() {
		return tab3;
	}
	public void setTab3(Integer tab3) {
		this.tab3 = tab3;
	}
	public Integer getTab4() {
		return tab4;
	}
	public void setTab4(Integer tab4) {
		this.tab4 = tab4;
	}
	public Integer getTab5() {
		return tab5;
	}
	public void setTab5(Integer tab5) {
		this.tab5 = tab5;
	}
	public String getTitleTab1() {
		return titleTab1;
	}
	public void setTitleTab1(String titleTab1) {
		this.titleTab1 = titleTab1;
	}
	public String getTitleTab2() {
		return titleTab2;
	}
	public void setTitleTab2(String titleTab2) {
		this.titleTab2 = titleTab2;
	}
	public String getTitleTab3() {
		return titleTab3;
	}
	public void setTitleTab3(String titleTab3) {
		this.titleTab3 = titleTab3;
	}
	public String getTitleTab4() {
		return titleTab4;
	}
	public void setTitleTab4(String titleTab4) {
		this.titleTab4 = titleTab4;
	}
	public String getTitleTab5() {
		return titleTab5;
	}
	public void setTitleTab5(String titleTab5) {
		this.titleTab5 = titleTab5;
	}
	public String getContentTab1() {
		return contentTab1;
	}
	public void setContentTab1(String contentTab1) {
		this.contentTab1 = contentTab1;
	}
	public String getContentTab2() {
		return contentTab2;
	}
	public void setContentTab2(String contentTab2) {
		this.contentTab2 = contentTab2;
	}
	public String getContentTab3() {
		return contentTab3;
	}
	public void setContentTab3(String contentTab3) {
		this.contentTab3 = contentTab3;
	}
	public String getContentTab4() {
		return contentTab4;
	}
	public void setContentTab4(String contentTab4) {
		this.contentTab4 = contentTab4;
	}
	public String getContentTab5() {
		return contentTab5;
	}
	public void setContentTab5(String contentTab5) {
		this.contentTab5 = contentTab5;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getMemberPrice() {
		return memberPrice;
	}
	public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
	}
	public String getIsNew() {
		return isNew;
	}
	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}
	public String getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
	public String getIsHot() {
		return isHot;
	}
	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}
	public String getIsUser() {
		return isUser;
	}
	public void setIsUser(String isUser) {
		this.isUser = isUser;
	}
	public String getHtmlName() {
		return htmlName;
	}
	public void setHtmlName(String htmlName) {
		this.htmlName = htmlName;
	}

}
