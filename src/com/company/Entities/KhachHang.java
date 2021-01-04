package com.company.Entities;

public class KhachHang {
    private String tenkhachhang, diachi;
    private int sodienthoai;

    public String toString() {
        return tenkhachhang + "#" + diachi + "#" + sodienthoai;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public KhachHang(String tenkhachhang, String diachi, int sodienthoai) {
        this.tenkhachhang = tenkhachhang;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
    }
}
