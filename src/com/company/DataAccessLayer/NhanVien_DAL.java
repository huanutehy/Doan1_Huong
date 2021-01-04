package com.company.DataAccessLayer;
import com.company.Entities.NhanVien;
import java.io.*;
import java.util.ArrayList;

public class NhanVien_DAL {
    static File file = new File("NhanVien.txt");
    public static void DocFile(ArrayList<NhanVien>nhanVienArrayList) throws IOException{
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                int manhanvien = Integer.parseInt(line.split("#")[0]);
                String tennhanvien = line.split("#")[1];
                String gioitinh = line.split("#")[2];
                String ngaysinh = line.split("#")[3];
                nhanVienArrayList.add(new NhanVien(manhanvien,tennhanvien,gioitinh,ngaysinh));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<NhanVien>nhanVienArrayList)throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (NhanVien nhanVien:nhanVienArrayList){
            fileWriter.write(nhanVien.toString()+"\n");
        }
        fileWriter.close();
    }

}
