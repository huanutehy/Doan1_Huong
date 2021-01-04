package com.company.Presentation;
import com.company.Entities.KhachHang;
import com.company.BusinessLogicLayer.QuanLyKhachHang;
import com.company.DataAccessLayer.KhachHang_DAL;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang_GUI {
    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<KhachHang>khachHangArrayList) throws IOException{
        while (true){

            System.out.println(".---------------------------------------------.");
            System.out.println("|            QUẢN LÝ KHÁCH HÀNG               |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|          1.Nhập thông tin khách hàng        |");
            System.out.println("|          2.Cập nhật thông tin khách hàng    |");
            System.out.println("|          3.Xóa thông tin khách hàng         |");
            System.out.println("|          4.Hiển thị thông tin khách hàng    |");
            System.out.println("|          5.Tìm thông tin khách hàng         |");
            System.out.println("|          6.Thoát                            |");
            System.out.println(".---------------------------------------------.");
            int chon = -1 ;
            do {

                try {
                    System.out.println("Chon chuc nang: ");
                    chon = scanner.nextInt();
                    if (chon < 0 || chon > 7){
                        throw new Exception("Nhap sai! Nhap lai!");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (chon <= 0 || chon > 7);

            switch (chon){
                case 1:
                    QuanLyKhachHang.NhapThongTin(khachHangArrayList);
                    KhachHang_DAL.GhiFile(khachHangArrayList);
                    break;
                case 2:
                    QuanLyKhachHang.capNhat(khachHangArrayList);
                    KhachHang_DAL.GhiFile(khachHangArrayList);
                    break;
                case 3:
                    QuanLyKhachHang.xoa(khachHangArrayList);
                    KhachHang_DAL.GhiFile(khachHangArrayList);
                    break;
                case 4:
                    QuanLyKhachHang.hienKhachHang(khachHangArrayList);
                    break;
                case 5:
                    QuanLyKhachHang.TimKiemKH(khachHangArrayList);
                    break;
                case 6:
                    return;
            }
        }
    }
}
