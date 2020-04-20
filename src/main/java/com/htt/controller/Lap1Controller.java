package com.htt.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = {"/lab1"})
public class Lap1Controller extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//DispatcherUtil.returnViewName(req, res, "lap1");
		String action = req.getParameter("action");
		if (action != null) {
			if (action.equals("pheptoan")) {
				DispatcherUtil.returnViewName(req, res, "lab1");
			} 
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//super.doPost(req, res);
		String action = req.getParameter("action");
		if (action.equals("ketqua")) {
			KetQua(req,res);
		}
	}
	private void KetQua(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println(req.getParameter("ToanHang1")+req.getParameter("ToanHang2"));
		DispatcherUtil.returnViewName(req, res, "lab1KetQua");
	}
}
