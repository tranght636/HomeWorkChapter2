package com.htt.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.htt.controller.Lab3Controller;
import com.htt.model.HangModel;
import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = {"/api/lab3"})
public class Lab3API extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Integer soLuong = Integer.parseInt(req.getParameter("soLuong"));
		Integer stt = Integer.parseInt(req.getParameter("stt"));
		HttpSession session = req.getSession();
		if(session.getAttribute("gioHang") == null) {
			Map<Integer, HangModel> gioHang = new HashMap<Integer, HangModel>();
			session.setAttribute("gioHang", gioHang);
		} 
		@SuppressWarnings("unchecked")
		Map<Integer, HangModel> gioHang = (Map<Integer, HangModel>) session.getAttribute("gioHang");
		if(gioHang.containsKey(stt)) {
			gioHang.get(stt).setSoLuong(gioHang.get(stt).getSoLuong() + soLuong);
		} else {
			HangModel hangModel = Lab3Controller.h.get(stt);
			hangModel.setSoLuong(soLuong);
			gioHang.put(stt, hangModel);
		}
		session.setAttribute("gioHang", gioHang);
		Integer tongSoLuong = 0;
		for(Map.Entry<Integer, HangModel> h : gioHang.entrySet()) {
			tongSoLuong += h.getValue().getSoLuong();
		}
		DispatcherUtil.send(res, tongSoLuong);
//		if(th1.isEmpty() || th2.isEmpty()) {
//			DispatcherUtil.send(res, 0);
//			return;
//		}
//		Integer toanHang1 = Integer.parseInt(th1);
//		Integer toanHang2 = Integer.parseInt(th2);
//		DispatcherUtil.send(res, toanHang1 + toanHang2);
	}

}
