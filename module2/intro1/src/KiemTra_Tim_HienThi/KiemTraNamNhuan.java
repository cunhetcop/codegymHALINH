package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập năm muốn kiểm tra: ");
        year = scanner.nextInt();
        scanner.close();
        boolean isLeap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap) System.out.println(year + " là năm nhuận.");
        else System.out.println(year + " không phải là năm nhuận.");

    }
}
