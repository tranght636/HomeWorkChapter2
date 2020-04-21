package com.htt.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.htt.model.SessionModel;
import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = { "/lab4" })
public class Lab4Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		String userID = "chan";
		SessionModel mySession = new SessionModel();
		if(session.getAttribute("session") == null) {
			mySession.setNumOfVisit(1);
			mySession.setHeader("Welcome, chan");
		} else {
			mySession = (SessionModel) session.getAttribute("session");
			mySession.addNumOfVisit(1);
			mySession.setHeader("Welcome back");
		}
		mySession.setId(session.getId());
		mySession.setCreateTime(createTime);
		mySession.setLastAccessTime(lastAccessTime);
		mySession.setUserID(userID);
		session.setAttribute("session", mySession);
		DispatcherUtil.returnViewName(req, res, "lab4");
	}
}
