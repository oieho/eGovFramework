package egovframework.sample.service;

import java.sql.Date;

public class SampleVO {
	private String id;
	private String title;
	private String regUser;
	private String content;
	private Date regDate;
	private String searchCondition;
	private String searchKeyword;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("SampleVO(title) : " + title);
		this.title = title;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		System.out.println("SampleVO(regUser) : " + regUser);
		this.regUser = regUser;
	}
	@Override
	public String toString() {
		return "SampleVO [id=" + id + ", title=" + title + ", regUser=" + regUser + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		System.out.println("SampleVO(content) : " + content);
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
}
