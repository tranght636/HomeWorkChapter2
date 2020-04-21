package com.htt.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = {"/api/lab2"})
public class Lab2API extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String th1 = req.getParameter("toanHang1");
		String th2 = req.getParameter("toanHang2");
		if(th1.isEmpty() || th2.isEmpty()) {
			DispatcherUtil.send(res, 0);
			return;
		}
		Integer toanHang1 = Integer.parseInt(th1);
		Integer toanHang2 = Integer.parseInt(th2);
		DispatcherUtil.send(res, toanHang1 + toanHang2);
	}

}
