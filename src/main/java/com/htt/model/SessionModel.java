package com.htt.model;

import java.util.Date;

public class SessionModel{
	String id;
	Date createTime;
	Date lastAccessTime;
	String userID;
	Integer numOfVisit;
	String header;
	public SessionModel() {
	}
	public SessionModel(String id, Date createTime, Date lastAccessTime, String userID, Integer numOfVisit,
			String header) {
		this.id = id;
		this.createTime = createTime;
		this.lastAccessTime = lastAccessTime;
		this.userID = userID;
		this.numOfVisit = numOfVisit;
		this.header = header;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastAccessTime() {
		return lastAccessTime;
	}
	public void setLastAccessTime(Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Integer getNumOfVisit() {
		return numOfVisit;
	}
	public void setNumOfVisit(Integer numOfVisit) {
		this.numOfVisit = numOfVisit;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	
	public void addNumOfVisit(Integer num) {
		this.numOfVisit += num;
	}
}
