package com.htt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = { "/lab4" })
public class Lab4Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Map<String, String> attributes = new HashMap<>();
	public static Integer count = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		String userID = "chan";
		MySession mySession = new MySession();
		if(session.getAttribute("session") == null) {
			mySession.numOfVisit = 1;
			mySession.setHeader("Welcome, chan");
		} else {
			mySession = (MySession) session.getAttribute("session");
			mySession.numOfVisit += 1;
			mySession.setHeader("Welcome back");
		}
		mySession.setId(session.getId());
		mySession.setCreateTime(createTime);
		mySession.setLastAccessTime(lastAccessTime);
		mySession.setUserID(userID);
		session.setAttribute("session", mySession);
		DispatcherUtil.returnViewName(req, res, "lab4");
	}

	public class MySession{
		String id;
		Date createTime;
		Date lastAccessTime;
		String userID;
		Integer numOfVisit;
		String header;
		public MySession() {
		}
		public MySession(String id, Date createTime, Date lastAccessTime, String userID, Integer numOfVisit,
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
	}
}
