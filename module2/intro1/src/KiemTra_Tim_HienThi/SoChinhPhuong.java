package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class SoChinhPhuong {
    static boolean checkPerfectSquare(double x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào số vần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();
        if (checkPerfectSquare(num)) {
            System.out.println(num + " là số chính phương.");
        } else {
            System.out.println(num + " không phải là số chính phương.");
        }
    }
}
