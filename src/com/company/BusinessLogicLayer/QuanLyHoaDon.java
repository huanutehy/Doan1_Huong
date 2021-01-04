package com.company.BusinessLogicLayer;
import com.company.Entities.HoaDon;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
    static Scanner scanner = new Scanner(System.in);
    public static void nhapThongTin(ArrayList<HoaDon>hoaDonArrayList){

        System.out.println("Nhập mã hóa đơn ");
        String mahoadon = scanner.nextLine();
        while(mahoadon.equals("")){
            System.out.println("Bạn nhập sai! Nhập mã hóa đơn : ");
            mahoadon = scanner.nextLine();
        }
        System.out.println("Nhập tên sản phẩm ");
        String tensanpham = scanner.nextLine();
        while(tensanpham.equals("")){
            System.out.println("Bạn nhập sai! Nhập tên sản phẩm : ");
            tensanpham = scanner.nextLine();
        }
        System.out.println("Nhập ngày bán ");
        String ngayban = scanner.nextLine();
        System.out.println("Nhập giá bán ");
        int giaban = Integer.parseInt(scanner.nextLine());
        while (giaban <= 0) {
            System.out.println("Nhập giá bán:  ");
            giaban = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập số lượng ");
        int soluong = scanner.nextInt();
        while (soluong <= 0 ) {
            System.out.println("Nhập số lượng:  ");
            soluong = scanner.nextInt();
        }

        hoaDonArrayList.add(new HoaDon(mahoadon,tensanpham,ngayban,soluong,giaban));
    }
    public static HoaDon find(ArrayList<HoaDon>hoaDonArrayList,String keyword){
        HoaDon result = null;
        for (HoaDon hoaDon:hoaDonArrayList){
            if(keyword.equalsIgnoreCase(hoaDon.getMahoadon())||keyword.equalsIgnoreCase(hoaDon.getTensanpham())||keyword.equalsIgnoreCase(hoaDon.getNgayban())){
                result = hoaDon;
            }
        }
        return result;
    }
    public static void capNhat(ArrayList<HoaDon>hoaDonArrayList){
        System.out.println("Nhập mã hóa đơn,tên sản phẩm, hoặc ngày bán ");
        String keyword = scanner.nextLine();
        HoaDon result = find(hoaDonArrayList,keyword);
        if(result == null){
            System.out.println("Không tìm thấy hóa đơn");
        }
        else {
            System.out.println("Nhập mã hóa đơn ");
            result.setMahoadon(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm ");
            result.setTensanpham(scanner.nextLine());
            System.out.println("Nhập giá bán ");
            result.setGiaban(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập ngày bán ");
            result.setNgayban(scanner.nextLine());
            System.out.println("Nhập số lượng ");
            result.setSoluong(Integer.parseInt(scanner.nextLine()));
        }
    }
    public static void xoa(ArrayList<HoaDon>hoaDonArrayList){
        System.out.println("Nhập tên sản phẩm, mã hóa đơn, hoặc ngày bán ");
        String keyword = scanner.nextLine();
        HoaDon result = find(hoaDonArrayList,keyword);
        if(result == null){
            System.out.println("Không tìm thấy hóa đơn ");
        }
        else {
            hoaDonArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void TimKiemMa(ArrayList<HoaDon> hoaDonArrayList) {
        int cs = -1;
        System.out.println("Nhap Ma can tim: ");
        String ma= scanner.nextLine();
        for (int i = 0; i < hoaDonArrayList.size(); i++)
            if (hoaDonArrayList.get(i).getMahoadon().equals(ma)) {
                cs = i;
                System.out.println("\n");
                System.out.println("THONG TIN MA TIM THAY");
                System.out.println("________________________________________________");
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã hóa đơn","Tên sản phẩm","Gía bán","Ngày bán","Số lượng");
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", hoaDonArrayList.get(i).getMahoadon(), hoaDonArrayList.get(i).getTensanpham(), hoaDonArrayList.get(i).getGiaban(), hoaDonArrayList.get(i).getNgayban(),hoaDonArrayList.get(i).getSoluong());
            }
              if(cs==-1) {
            System.out.println("Khong ton tai ten nay! ");
        }
    }
    public static void display(HoaDon hoaDon){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n",hoaDon.getMahoadon(),hoaDon.getTensanpham(),hoaDon.getGiaban(),hoaDon.getNgayban(),hoaDon.getSoluong());
    }
    public static  void inHoaDon(ArrayList<HoaDon>hoaDonArrayList){
        System.out.println("Nhập tên sản phẩm,mã hóa đơn, hoặc ngày bán");
        String keyword = scanner.nextLine();
        HoaDon result = find(hoaDonArrayList,keyword);
        if(result == null){
            System.out.println("Không tìm thấy sản phẩm ");
        }


    }
    public static void hienHoaDon(ArrayList<HoaDon>hoaDonArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã hóa đơn","Tên sản phẩm","Gía bán","Ngày bán","Số lượng");
        for (HoaDon hoaDon:hoaDonArrayList){
            display(hoaDon);
        }
    }
}
