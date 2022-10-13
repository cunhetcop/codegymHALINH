package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class KiemTraSoChanHaySoLe {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số: ");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Đây là số chẵn! ");
        } else {
            System.out.println("Đây là số lẻ! ");
        }
    }
}

