package com.company.BusinessLogicLayer;
import com.company.Entities.HoaDon;
import com.company.Entities.KhachHang;
import com.company.Entities.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang {
    static Scanner scanner = new Scanner(System.in);
    public static void NhapThongTin(ArrayList<KhachHang>khachHangArrayList){
        System.out.println("Nhập tên khách hàng: ");
        String tenkhachhang = scanner.nextLine();
        while(tenkhachhang.equals("")){
            System.out.println("Bạn nhập sai! Nhập tên khách hàng : ");
            tenkhachhang = scanner.nextLine();
        }
        System.out.println("Nhập địa chỉ: ");
        String diachi = scanner.nextLine();
        while(diachi.equals("")){
            System.out.println("Bạn nhập sai! Nhập địa chỉ : ");
            diachi = scanner.nextLine();
        }

        System.out.println("Nhập số điện thoại: ");
        int sodienthoai = Integer.parseInt(scanner.nextLine());

        khachHangArrayList.add(new KhachHang(tenkhachhang,diachi,sodienthoai));
    }
    public static KhachHang find(ArrayList<KhachHang>khachHangArrayList,String keyword){
        KhachHang result = null;
        for(KhachHang khachHang:khachHangArrayList){
            if(keyword.equalsIgnoreCase(String.valueOf(khachHang.getTenkhachhang()))||keyword.equalsIgnoreCase(khachHang.getDiachi())){
             result = khachHang;
            }
        }
        return result;
    }
    public static void capNhat(ArrayList<KhachHang>khachHangArrayList){
        System.out.println("Nhập tên khách hàng,địa chỉ");
        String keyword = scanner.nextLine();
        KhachHang result = find(khachHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy khách hàng");
        }
        else {
            System.out.println("Nhập tên khách hàng: ");
            result.setTenkhachhang(scanner.nextLine());
            System.out.println("Nhập địa chỉ: ");
            result.setDiachi(scanner.nextLine());
            System.out.println("Nhập số điện thoại: ");
            result.setSodienthoai(scanner.nextInt());
        }
    }
    public static void xoa(ArrayList<KhachHang>khachHangArrayList){
        System.out.println("Nhập tên khách hàng,địa chỉ ");
        String keyword = scanner.nextLine();
        KhachHang result = find(khachHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy khách hàng");
        }
        else {
            khachHangArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void TimKiemKH(ArrayList<KhachHang> kh) {
        int cs = -1;
        System.out.println("Nhap ten khach hang can tim: ");
        String ten= scanner.nextLine();
        for (int i = 0; i < kh.size(); i++)
            if (kh.get(i).getTenkhachhang().equals(ten)) {
                cs = i;
                System.out.println("\n");
                System.out.println("THONG TIN KHACH HANG TIM THAY");
                System.out.println("________________________________________________");
                System.out.printf("|%-20s|%-20s|%-20s|\n","Tên khách hàng","Địa chỉ","Số điện thoại");
                System.out.printf("|%-20s|%-20s|%-20s|\n", kh.get(i).getTenkhachhang(), kh.get(i).getDiachi(), kh.get(i).getSodienthoai());
            }
        if(cs==-1) {
            System.out.println("Khong ton tai ten nay! ");
        }
    }
    public static void display(KhachHang khachHang){
        System.out.printf("|%-20s|%-20s|%-20s|\n",khachHang.getTenkhachhang(),khachHang.getDiachi(),khachHang.getSodienthoai());
    }
    public static void hienKhachHang(ArrayList<KhachHang>khachHangArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|\n","Tên khách hàng","Địa chỉ","Số điện thoại");
        for (KhachHang khachHang:khachHangArrayList){
            display(khachHang);
        }
    }
}
