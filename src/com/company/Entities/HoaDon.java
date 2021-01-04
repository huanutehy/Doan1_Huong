package com.company.Entities;

public class HoaDon {
    private String mahoadon;
    private String tensanpham,ngayban;
    private int soluong;
    private int giaban;

    public HoaDon(String mahoadon,String tensanpham,String ngayban,int soluong,int giaban){
        this.mahoadon = mahoadon;
        this.tensanpham = tensanpham;
        this.ngayban = ngayban;
        this.soluong = soluong;
        this.giaban = giaban;
    }
    public String toString(){
        return mahoadon+"#"+tensanpham+"#"+ngayban+"#"+soluong+"#"+giaban;
    }
    public String getMahoadon(){
        return mahoadon;
    }
    public void setMahoadon(String mahoadon){
        this.mahoadon = mahoadon;
    }
    public String getTensanpham(){
        return tensanpham;
    }
    public void setTensanpham(String tensanpham){
        this.tensanpham = tensanpham;
    }
    public String getNgayban(){
        return ngayban;
    }
    public void setNgayban(String ngayban){
        this.ngayban = ngayban;
    }
    public int getSoluong(){
        return soluong;
    }
    public void setSoluong(int soluong){
        this.soluong = soluong;
    }
    public int getGiaban(){
        return giaban;
    }
    public void setGiaban(int giaban){
        this.giaban = giaban;
    }

}
