package com.boot.security.server.model;


/**
 * 网站基本信息
 */
public class SysInformation extends BaseEntity<Long> {

	private int informationId;
	private String name;
	private String logoUrl;
	private String icoUrl;
	private String qrcodeUrl;
	private String tel;
	private String email;
	private String fax;
	private String weburl;
	private String address;
	private String copyright;
	private String ABOUTUS1;
	private String ABOUTUS2;

	public int getInformationId() {
		return informationId;
	}

	public void setInformationId(int informationId) {
		this.informationId = informationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getIcoUrl() {
		return icoUrl;
	}

	public void setIcoUrl(String icoUrl) {
		this.icoUrl = icoUrl;
	}

	public String getQrcodeUrl() {
		return qrcodeUrl;
	}

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWeburl() {
		return weburl;
	}

	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getABOUTUS1() {
		return ABOUTUS1;
	}

	public void setABOUTUS1(String ABOUTUS1) {
		this.ABOUTUS1 = ABOUTUS1;
	}

	public String getABOUTUS2() {
		return ABOUTUS2;
	}

	public void setABOUTUS2(String ABOUTUS2) {
		this.ABOUTUS2 = ABOUTUS2;
	}
}
