package com.company.BusinessLogicLayer;
import com.company.Entities.HoaDon;
import com.company.Entities.NhanVien;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyNhanVien {
    static Scanner scanner = new Scanner(System.in);
    public static void nhapThongTin(ArrayList<NhanVien>nhanVienArrayList){
        System.out.println("Nhập mã nhân viên: ");
        int manhanvien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhân viên: ");
        String tennhanvien = scanner.nextLine();
        while(tennhanvien.equals("")){
            System.out.println("Bạn nhập sai! Nhập tên nhân viên: ");
            tennhanvien = scanner.nextLine();
        }
        System.out.println("Nhập giới tính: ");
        String gioitinh = scanner.nextLine();
        while(gioitinh.equals("")){
            System.out.println("Bạn nhập sai! Nhập giới tính : ");
            gioitinh = scanner.nextLine();
        }

        System.out.println("Nhập ngày sinh:");
        String ngaysinh = scanner.nextLine();
        while(ngaysinh.equals("")){
            System.out.println("Bạn nhập sai! Nhập ngày sinh khách hàng : ");
            ngaysinh = scanner.nextLine();
        }
        nhanVienArrayList.add(new NhanVien(manhanvien,tennhanvien,gioitinh,ngaysinh));
    }
    public static NhanVien find(ArrayList<NhanVien>nhanVienArrayList,String keyword){
        NhanVien result = null;
        for (NhanVien nhanVien:nhanVienArrayList){
            if(keyword.equalsIgnoreCase(String.valueOf(nhanVien.getManhanvien()))||keyword.equalsIgnoreCase(nhanVien.getTennhanvien())){
                result = nhanVien;
            }
        }
        return result;
    }
    public static void capNhat(ArrayList<NhanVien>nhanVienArrayList){
        System.out.println("Nhập tên nhân viên, mã nhân viên");
        String keyword = scanner.nextLine();
        NhanVien result = find(nhanVienArrayList,keyword);
        if(result == null){
        System.out.println("Không tìm thấy nhân viên");
    }
    else {
            System.out.println("Nhập mã nhân viên: ");
            result.setManhanvien(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập tên nhân viên: ");
            result.setTennhanvien(scanner.nextLine());
            System.out.println("Nhập giới tính: ");
            result.setGioitinh(scanner.nextLine());
            System.out.println("Nhập ngày sinh: ");
            result.setNgaysinh(scanner.nextLine());
    }
}
public static void xoa(ArrayList<NhanVien>nhanVienArrayList){
    System.out.println("Nhập tên nhân viên, mã nhân viên");
    String keyword = scanner.nextLine();
    NhanVien result = find(nhanVienArrayList,keyword);
    if(result == null){
        System.out.println("Không tìm thấy nhân viên ");
    }
    else {
        nhanVienArrayList.remove(result);
        System.out.println("Xóa thành công ");
    }
}
    public static void TimKiemNV(ArrayList<NhanVien> nv) {
        int cs = -1;
        System.out.println("Nhap ten nhan vien can tim: ");
        String ten= scanner.nextLine();
        for (int i = 0; i < nv.size(); i++)
            if (nv.get(i).getTennhanvien().equals(ten)) {
                cs = i;
                System.out.println("\n");
                System.out.println("THONG TIN NHAN VIEN CAN TIM");
                System.out.println("________________________________________________");
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n","Mã nhân viên","Tên nhân viên","Giới tính","Ngày sinh");
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", nv.get(i).getManhanvien(), nv.get(i).getTennhanvien(), nv.get(i).getGioitinh(), nv.get(i).getNgaysinh());
            }
        if(cs==-1) {
            System.out.println("Khong ton tai ten nay! ");
        }
    }
public static void display(NhanVien nhanVien){
    System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n",nhanVien.getManhanvien(),nhanVien.getTennhanvien(),nhanVien.getGioitinh(),nhanVien.getNgaysinh());
    }
    public static void hienNhanVien(ArrayList<NhanVien>nhanVienArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n","Mã nhân viên","Tên nhân viên","Giới tính","Ngày sinh");
        for(NhanVien nhanVien:nhanVienArrayList){
            display(nhanVien);
        }
    }
}

