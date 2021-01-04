package com.company.DataAccessLayer;
import com.company.Entities.SanPham;
import java.io.*;
import java.util.ArrayList;
public class SanPham_DAL {
    static File file = new File("SamPham.txt");
    public static void DocFile(ArrayList<SanPham>sanPhamArrayList) throws IOException{
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String masanpham = line.split("#")[0];
                String tensanpham = line.split("#")[1];
                double giaban = Double.parseDouble(line.split("#")[2]);
                int soluong = Integer.parseInt(line.split("#")[3]);
                String donvitinh = line.split("#")[4];
                sanPhamArrayList.add(new SanPham(masanpham,tensanpham,giaban,soluong,donvitinh));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<SanPham>sanPhamArrayList) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (SanPham sanPham:sanPhamArrayList){
            fileWriter.write(sanPham.toString()+"\n");
        }
        fileWriter.close();
    }
}

