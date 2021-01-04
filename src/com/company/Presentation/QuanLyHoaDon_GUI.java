package com.company.Presentation;
import com.company.BusinessLogicLayer.QuanLyHoaDon;
import com.company.DataAccessLayer.HoaDon_DAL;
import com.company.Entities.HoaDon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon_GUI {

    private static void Menu(){
        System.out.println(".------------------------------------------.");
        System.out.println("|              QUẢN LÝ HÓA ĐƠN             |");
        System.out.println("+------------------------------------------+");
        System.out.println("|         1.Nhập thông tin hóa đơn         |");
        System.out.println("|         2.Cập nhật thông tin hóa đơn     |");
        System.out.println("|         3.Xóa thông tin hóa đơn          |");
        System.out.println("|         4.Hiển thị thông tin hóa đơn     |");
        System.out.println("|         5.Tìm thông tin hóa đơn          |");
        System.out.println("|         6.Thoát                          |");
        System.out.println(".------------------------------------------.");

    }

    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<HoaDon>hoaDonArrayList) throws IOException{
        int chon;
        while (true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon==0)break;
            switch (chon){
                case 1:
                    QuanLyHoaDon.nhapThongTin(hoaDonArrayList);
                    HoaDon_DAL.GhiFile(hoaDonArrayList);
                    break;
                case 2:
                    QuanLyHoaDon.capNhat(hoaDonArrayList);
                    HoaDon_DAL.GhiFile(hoaDonArrayList);
                    break;
                case 3:
                    QuanLyHoaDon.xoa(hoaDonArrayList);
                    HoaDon_DAL.GhiFile(hoaDonArrayList);
                    break;
                case 4:
                    QuanLyHoaDon.hienHoaDon(hoaDonArrayList);
                    break;
                case 5:
                    QuanLyHoaDon.TimKiemMa(hoaDonArrayList);
                    break;
                case 6:
                    return;
                default:break;
            }
        }
    }
}
