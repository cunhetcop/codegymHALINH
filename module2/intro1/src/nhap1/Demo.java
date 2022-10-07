package nhap1;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    static File file = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/intro1/src/nhap1/linh.txt");
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        numbers.add(15);
        numbers.add(19);
        numbers.add(22);
        write();
        read();
        for (Integer i: numbers) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String regexname = "[a-zA-z]{4,}";
            Pattern patternname = Pattern.compile(regexname);
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            Matcher matchername = patternname.matcher(name);
            if (matchername.matches()) {
                System.out.print("Nhập email:");
                String regexemail = "^[a-zA-Z]+[0-9_a-zA-z.]*@([a-z]+\\.[a-z]+)+";
                String email = scanner.nextLine();
                Pattern patternemail = Pattern.compile(regexemail);
                Matcher matcheremail = patternemail.matcher(email);
                if (matcheremail.matches()) {
                    System.out.print("Nhập số điện thoại đầu +84: ");
                    String regexphone = "\\+84[0-9]{1,9}";
                    String phone = scanner.nextLine();
                    Pattern patternphone = Pattern.compile(regexphone);
                    Matcher matcherphone = patternphone.matcher(phone);
                    if (matcherphone.matches()) {
                        System.out.println("===================");
                        System.out.println("Tên: " +name + "\nEmail: " +email + "\nSĐT: " +phone);
                    } else {
                        System.out.println("Sai định dạng");
                    }
                } else {
                    System.out.println("Sai định dạng");
                }

            } else {
                System.err.println("Sai định dạng");
            }
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

    public static ArrayList<Integer> read() {
        try {
            // tạo dòng chảy
            FileInputStream ketnoi = new FileInputStream(file);
            // tạo bút
            ObjectInputStream but = new ObjectInputStream(ketnoi);
            // Đọc.
            numbers = (List<Integer>) but.readObject();
            but.close();
            ketnoi.close();
            return (ArrayList<Integer>) numbers;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}




