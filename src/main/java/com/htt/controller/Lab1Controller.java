package com.htt.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = { "/lab1" })
public class Lab1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		DispatcherUtil.returnViewName(req, res, "lab1");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int a = Integer.parseInt(req.getParameter("ToanHang1"));
		int b = Integer.parseInt(req.getParameter("ToanHang2"));
		String phepToan = req.getParameter("PhepToan");
		if (phepToan.equals("cong")) {
			req.setAttribute("ketQua", a + b);
		} else if (phepToan.equals("tru")) {
			req.setAttribute("ketQua", a - b);
		} else if (phepToan.equals("nhanh")) {
			req.setAttribute("ketQua", a * b);
		} else if (phepToan.equals("chia")) {
			req.setAttribute("ketQua", a / b);
		}
		DispatcherUtil.returnViewName(req, res, "lab1KetQua");
	}
}
