package com.company.DataAccessLayer;
import com.company.Entities.HoaDon;
import java.io.*;
import java.util.ArrayList;
public class HoaDon_DAL {
    static File file = new File("HoaDon.txt");
    public static void DocFile(ArrayList<HoaDon>hoaDonArrayList) throws IOException{
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                String mahoadon = line.split("#")[0];
                String tensanpham = line.split("#")[1];
                String ngayban = line.split("#")[2];
                int soluong = Integer.parseInt(line.split("#")[3]);
                int giaban = Integer.parseInt(line.split("#")[4]);
                hoaDonArrayList.add(new HoaDon(mahoadon,tensanpham,ngayban, giaban,soluong));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public  static void GhiFile(ArrayList<HoaDon>hoaDonArrayList) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (HoaDon hoaDon:hoaDonArrayList){
            fileWriter.write(hoaDon.toString()+"\n");
        }
        fileWriter.close();
    }
}
