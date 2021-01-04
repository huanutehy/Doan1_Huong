package com.company.Entities;

public class NhanVien {
    private int manhanvien;
    private String tennhanvien, gioitinh, ngaysinh;

    public String toString() {
        return manhanvien + "#" + tennhanvien + "#" + gioitinh + "#" + ngaysinh;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public NhanVien(int manhanvien, String tennhanvien, String gioitinh, String ngaysinh) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }
}
