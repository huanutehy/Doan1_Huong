package com.company.DataAccessLayer;
import com.company.Entities.KhachHang;
import java.io.*;
import java.util.ArrayList;
public class KhachHang_DAL {
    static File file = new File("KhachHang.txt");
    public static void DocFile(ArrayList<KhachHang>khachHangArrayList) throws IOException{
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String tenkhachhang = line.split("#")[0];
                String diachi = line.split("#")[1];
                int sodienthoai = Integer.parseInt(line.split("#")[2]);
                khachHangArrayList.add(new KhachHang(tenkhachhang,diachi,sodienthoai));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<KhachHang>khachHangArrayList) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (KhachHang khachHang: khachHangArrayList){
            fileWriter.write(khachHang.toString()+"\n");
        }
        fileWriter.close();
    }
}
