package com.htt.utils;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherUtil {

	public static void returnViewName(HttpServletRequest req, HttpServletResponse res, String pageName) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/" + pageName + ".jsp");
		rd.forward(req, res);
	}
	
	public static void redirect(HttpServletRequest req, HttpServletResponse res, String url) throws ServletException, IOException {
		res.sendRedirect(req.getContextPath() + url);
	}
	
	//Dùng cho api
//	public static void send(HttpServletResponse res, Object object) throws ServletException, IOException {
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.writeValue(res.getOutputStream(), object);
//	}
}
