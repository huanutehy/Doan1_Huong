package com.company.Presentation;
import com.company.DataAccessLayer.NhanVien_DAL;
import com.company.BusinessLogicLayer.QuanLyNhanVien;
import com.company.Entities.NhanVien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien_GUI {

    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<NhanVien>nhanVienArrayList) throws IOException{
        while (true){
            System.out.println(".--------------------------------------------.");
            System.out.println("|               QUẢN LÝ NHÂN VIÊN            |");
            System.out.println("+--------------------------------------------+");
            System.out.println("|        1.Nhập thông tin nhân viên          |");
            System.out.println("|        2.Cập nhật thông tin nhân viên      |");
            System.out.println("|        3.Xóa thông tin nhân viên           |");
            System.out.println("|        4.Hiển thị thông tin nhân viên      |");
            System.out.println("|        5.Tìm thông tin nhân viên           |");
            System.out.println("|        6.Thoát                             |");
            System.out.println(".--------------------------------------------.");
            int chon = -1 ;
            do {

                try {
                    System.out.println("Chon chuc nang: ");
                    chon = scanner.nextInt();
                    if (chon < 0 || chon > 6){
                        throw new Exception("Nhap sai! Nhap lai!");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (chon <= 0 || chon > 6);
            switch (chon){
                case 1:
                    QuanLyNhanVien.nhapThongTin(nhanVienArrayList);
                    NhanVien_DAL.GhiFile(nhanVienArrayList);
                    break;
                case 2:
                    QuanLyNhanVien.capNhat(nhanVienArrayList);
                    NhanVien_DAL.GhiFile(nhanVienArrayList);
                    break;
                case 3:
                    QuanLyNhanVien.xoa(nhanVienArrayList);
                    NhanVien_DAL.GhiFile(nhanVienArrayList);
                    break;
                case 4:
                    QuanLyNhanVien.hienNhanVien(nhanVienArrayList);
                    break;
                case 5:
                    QuanLyNhanVien.TimKiemNV(nhanVienArrayList);
                    break;
                case 6:
                    return;
            }
        }
    }
}
