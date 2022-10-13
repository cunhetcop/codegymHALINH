package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class KiemTraSoNguyenAmVaPhuAm {
    public static void main(String[] args) {
        boolean soNguyenAm = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> soNguyenAm = true;
        }
        if (soNguyenAm) {
            System.out.println(ch + " là số nguyên âm.");
        } else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(" là số phụ âm.");
            }
        }
    }
}
