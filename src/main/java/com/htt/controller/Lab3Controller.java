package com.htt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htt.model.HangModel;
import com.htt.utils.DispatcherUtil;

@WebServlet(urlPatterns = { "/lab3" })
public class Lab3Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public static HashMap<Integer, HangModel> h= new HashMap<>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String action = req.getParameter("action");{
			if(action.equals("mua_hang")) {
				getMuaHang(req, res);
				return;
			} else if(action.equals("gio_hang")) {
				getGioHang(req, res);
				return;
			}
		}
		
	}
	private void getGioHang(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		Map<Integer, HangModel> gioHang  =  (Map<Integer, HangModel>) req.getSession().getAttribute("gioHang");
		Integer tongSoLuong = 0;
		Integer tongTien = 0;
		for(Map.Entry<Integer, HangModel> h2 : gioHang.entrySet()) {
			tongSoLuong += h2.getValue().getSoLuong();
			tongTien += h2.getValue().getGia() * h2.getValue().getSoLuong();
		}
		req.setAttribute("GioHang", gioHang);
		req.setAttribute("soLuongMua", tongSoLuong);
		req.setAttribute("tongTien", tongTien);
		DispatcherUtil.returnViewName(req, res, "lab3KetQua");
	}
	private void getMuaHang(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		h.put(1, new HangModel(1,"Laptop Sony Vaio SR2400",15000000,0));
		h.put(2, new HangModel(2,"Laptop Sony Vaio SR3400",17000000,0));
		h.put(3, new HangModel(3,"Laptop Sony Vaio SR7400",25000000,0));
		h.put(4, new HangModel(4,"Laptop Sony Vaio SR9400",35000000,0));
		h.put(5, new HangModel(5,"Laptop HP HP1100",12000000,0));
		h.put(6, new HangModel(6,"Laptop HPPro X5400",15000000,0));
		h.put(7, new HangModel(7,"Laptop HPPro X9990",25000000,0));
		h.put(8, new HangModel(8,"Laptop HPPro X20-3100",18000000,0));
		if(req.getSession().getAttribute("gioHang") == null) {
			req.setAttribute("MatHang", h);
			req.setAttribute("soLuongMua", 0);
		} else {
			@SuppressWarnings("unchecked")
			Map<Integer, HangModel> gioHang  =  (Map<Integer, HangModel>) req.getSession().getAttribute("gioHang");
			Integer tongSoLuong = 0;
			for(Map.Entry<Integer, HangModel> h2 : gioHang.entrySet()) {
				tongSoLuong += h2.getValue().getSoLuong();
				h.get(h2.getKey()).setSoLuong(h2.getValue().getSoLuong());
			}
			req.setAttribute("MatHang", h);
			req.setAttribute("soLuongMua", tongSoLuong);
		}
		
		DispatcherUtil.returnViewName(req, res, "lab3");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		DispatcherUtil.returnViewName(req, res, "lab3KetQua");
	}
}
 
