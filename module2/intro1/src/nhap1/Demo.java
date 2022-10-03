package nhap1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    static File file = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/intro1/src/nhap1/linh.txt");
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        read();
        for (Integer i: numbers) {
            System.out.println(i);
        }
    }

    public static void write() {
        try {
            // Tạo kết nối.
            FileOutputStream ketnoi = new FileOutputStream(file);
            // Tạo bút để viết lên bảng.
            ObjectOutputStream but = new ObjectOutputStream(ketnoi);
            // đi viết
            but.writeObject(numbers);
            but.close();
            ketnoi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try {
            // tạo dòng chảy
            FileInputStream ketnoi = new FileInputStream(file);
            // tạo bút
            ObjectInputStream but = new ObjectInputStream(ketnoi);
            // Đọc.
            numbers = (List<Integer>) but.readObject();
            but.close();
            ketnoi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




