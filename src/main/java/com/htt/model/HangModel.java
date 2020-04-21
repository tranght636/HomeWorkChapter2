package com.htt.model;

public class HangModel {
	int stt;
	String tenHang;
	int gia;
	int soLuong;

	public HangModel() {
		super();
	}

	public HangModel(int stt, String tenHang, int gia, int soLuong) {
		super();
		this.stt = stt;
		this.tenHang = tenHang;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	public int getThanhTien() {
		return gia*soLuong;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
