package com.company.Presentation;
import com.company.BusinessLogicLayer.QuanLySanPham;
import com.company.Entities.SanPham;
import com.company.DataAccessLayer.SanPham_DAL;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham_GUI {

    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<SanPham>sanPhamArrayList) throws IOException{
        while (true){
            System.out.println(".--------------------------------------");
            System.out.println("|             QUẢN LÝ SẢN PHẨM         |");
            System.out.println("+--------------------------------------+");
            System.out.println("|     1.Nhập thông tin sản phẩm        |");
            System.out.println("|     2.Cập nhật thông tin sản phẩm    |");
            System.out.println("|     3.Xóa thông tin sản phẩm         |");
            System.out.println("|     4.Hiển thị thông tin sản phẩm    |");
            System.out.println("|     5.Tìm thông tin sản phẩm         |");
            System.out.println("|     6.Thoát                          |");
            System.out.println(".--------------------------------------");
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
                    QuanLySanPham.NhapThongtin(sanPhamArrayList);
                    SanPham_DAL.GhiFile(sanPhamArrayList);
                    break;
                case 2:
                    QuanLySanPham.capNhat(sanPhamArrayList);
                    SanPham_DAL.GhiFile(sanPhamArrayList);
                    break;
                case 3:
                    QuanLySanPham.xoa(sanPhamArrayList);
                    SanPham_DAL.GhiFile(sanPhamArrayList);
                    break;
                case 4:
                    QuanLySanPham.hienSanPham(sanPhamArrayList);
                    break;
                case 5:
                    QuanLySanPham.TimKiemMaSP(sanPhamArrayList);
                    break;
                case 6:
                    return;
            }
        }
    }
}
