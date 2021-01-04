package com.company.Presentation;
import com.company.DataAccessLayer.HoaDon_DAL;
import com.company.DataAccessLayer.NhanVien_DAL;
import com.company.DataAccessLayer.KhachHang_DAL;
import com.company.DataAccessLayer.SanPham_DAL;
import com.company.Entities.KhachHang;
import com.company.Entities.HoaDon;
import com.company.Entities.NhanVien;
import com.company.Entities.SanPham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    static ArrayList<HoaDon> hoaDonArrayList = new ArrayList<>();
    static ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
    static ArrayList<KhachHang> khachHangArrayList = new ArrayList<>();
    static ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void Run()throws IOException{
        HoaDon_DAL.DocFile(hoaDonArrayList);
        NhanVien_DAL.DocFile(nhanVienArrayList);
        KhachHang_DAL.DocFile(khachHangArrayList);
        SanPham_DAL.DocFile(sanPhamArrayList);
        while (true) {
            System.out.println(".--------------------------------------");
            System.out.println("|          QUẢN LÝ CỬA HÀNG           |");
            System.out.println("+-------------------------------------+");
            System.out.println("|          1.QUẢN LÝ HÓA ĐƠN          |");
            System.out.println("|          2.QUẢN LÝ SẢN PHẨM         |");
            System.out.println("|          3.QUẢN LÝ NHÂN VIÊN        |");
            System.out.println("|          4.QUẢN LÝ KHÁCH HÀNG       |");
            System.out.println("|          5.Thoát                    |");
            System.out.println(".-------------------------------------.");
            int chon = -1 ;
            do {

                try {
                    System.out.println("Chon chuc nang: ");
                    chon = scanner.nextInt();
                    if (chon < 0 || chon > 5){
                        throw new Exception("Nhap sai! Nhap lai!");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (chon < 0 || chon > 5);
            switch (chon){
                case 1:
                    QuanLyHoaDon_GUI.chon(hoaDonArrayList);
                    break;
                case 2:
                    QuanLySanPham_GUI.chon(sanPhamArrayList);
                    break;
                case 4:
                    QuanLyKhachHang_GUI.chon(khachHangArrayList);
                    break;
                case 3:
                    QuanLyNhanVien_GUI.chon(nhanVienArrayList);
                    break;
                case  5:
                    return;
                default:break;
            }
        }
    }
}
