package lopthuoctinhdoituong.QuanLySinhVien.io;

import lopthuoctinhdoituong.QuanLySanPham.product.Product;
import lopthuoctinhdoituong.QuanLySinhVien.product.SinhVien;

import java.io.*;
import java.util.ArrayList;

public class IOsinhvien {
    static File file = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/intro1/src/lopthuoctinhdoituong/QuanLySinhVien/file_text/sinhViens.txt");

    public static void write(ArrayList<SinhVien> sinhViens) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SinhVien sinhVien : sinhViens) {
                String s = sinhVien.getID() + ", " + sinhVien.getName() + ", " + sinhVien.getAge() +
                        ", " + sinhVien.getGender() + ", " + sinhVien.getAddress() + ", " + sinhVien.getAveragemark();
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<SinhVien> read() {
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(", ");
                int ID = Integer.parseInt(arr[0]);
                String name = arr[1];
                int age = Integer.parseInt(arr[2]);
                String gender = arr[3];
                String address = arr[4];
                int ave = Integer.parseInt(arr[5]);

                SinhVien sinhVien = new SinhVien(ID, name, age, gender, address, ave);
                sinhViens.add(sinhVien);
                str = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sinhViens;
    }
}
