package com.company.BusinessLogicLayer;
import com.company.Entities.HoaDon;
import com.company.Entities.SanPham;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySanPham {
    static Scanner scanner = new Scanner(System.in);
    public static void NhapThongtin(ArrayList<SanPham>sanPhamArrayList){
        System.out.println("Nhập mã sản phẩm ");
        String masanpham = scanner.nextLine();
        while(masanpham.equals("")){
            System.out.println("Bạn nhập sai! Nhập mã sản phẩm : ");
            masanpham = scanner.nextLine();
        }
        System.out.println("Nhập tên sản phẩm ");
        String tensanpham = scanner.nextLine();
        while(tensanpham.equals("")){
            System.out.println("Bạn nhập sai! Nhập tên sản phẩm : ");
            tensanpham = scanner.nextLine();
        }
        System.out.println("Nhập giá bán ");
        double giaban = Double.parseDouble(scanner.nextLine());
        while(giaban<=0){
            System.out.println("Bạn nhập sai! Nhập  giá bán : ");
             giaban = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập số lượng ");
        int soluong = Integer.parseInt(scanner.nextLine());
        while(soluong <=0){
            System.out.println("Bạn nhập sai! Nhập số lượng : ");
            giaban = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập đơn vị tính ");
        String donvitinh = scanner.nextLine();
        while(donvitinh.equals("")){
            System.out.println("Bạn nhập sai! Nhập đơn vị tính : ");
            donvitinh= scanner.nextLine();
        }
        sanPhamArrayList.add(new SanPham(masanpham,tensanpham,giaban,soluong,donvitinh));
    }
    public static SanPham find(ArrayList<SanPham>sanPhamArrayList,String keyword){
        SanPham result = null;
        for (SanPham sanPham:sanPhamArrayList){
            if(keyword.equalsIgnoreCase(sanPham.getTensanpham())||keyword.equalsIgnoreCase(sanPham.getMasanpham())){
                result = sanPham;
            }
        }
        return result;
    }
    public static void TimKiemMaSP(ArrayList<SanPham> sp) {
        int cs = -1;
        System.out.println("Nhap ma san pham can tim: : ");
        String ma= scanner.nextLine();
        for (int i = 0; i < sp.size(); i++)
            if (sp.get(i).getMasanpham().equals(ma)) {
                cs = i;
                System.out.println("\n");
                System.out.println("THONG TIN MA SAN PHAM TIM THAY");
                System.out.println("________________________________________________");
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã sản phẩm","Tên sản phẩm","Gía bán","Số lượng","Đơn vị tính");
                System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", sp.get(i).getMasanpham(), sp.get(i).getTensanpham(), sp.get(i).getGiaban(), sp.get(i).getSoluong(),sp.get(i).getDonvitinh());
            }
        if(cs==-1) {
            System.out.println("Khong ton tai ten nay! ");
        }
    }
    public static void capNhat(ArrayList<SanPham>sanPhamArrayList){
        System.out.println("Nhập tên,mã sản phẩm");
        String keyword = scanner.nextLine();
        SanPham result = find(sanPhamArrayList,keyword);
        if(result == null){
            System.out.println("Không tìm thấy sản phẩm ");
        }
        else {
            System.out.println("Nhập mã sản phẩm: ");
            result.setMasanpham(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm: ");
            result.setTensanpham(scanner.nextLine());
            System.out.println("Nhập giá bán: ");
            result.setGiaban(Double.parseDouble(scanner.nextLine()));
            System.out.println("Nhập số lượng: ");
            result.setSoluong(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập đơn vị tính: ");
            result.setDonvitinh(scanner.nextLine());
            System.out.println("Cập nhật thành công");
        }
    }
    public static void xoa(ArrayList<SanPham>sanPhamArrayList){
        System.out.println("Nhập tên,mã sản phẩm");
        String keyword = scanner.nextLine();
        SanPham result = find(sanPhamArrayList,keyword);
        if(result == null){
            System.out.println("Không tìm thấy sản phẩm");
        }
        else {
            sanPhamArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void display(SanPham sanPham){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n",sanPham.getMasanpham(),sanPham.getTensanpham(),sanPham.getGiaban(),sanPham.getSoluong(),sanPham.getDonvitinh());
    }
    public static void hienSanPham(ArrayList<SanPham>sanPhamArrayList){
        System.out.printf("|%-20s|%-20s |%-20s|%-20s|%-20s|\n","Mã sản phẩm","Tên sản phẩm","Gía bán","Số lượng","Đơn vị tính");
        for (SanPham sanPham:sanPhamArrayList){
            display(sanPham);
        }
    }
}
