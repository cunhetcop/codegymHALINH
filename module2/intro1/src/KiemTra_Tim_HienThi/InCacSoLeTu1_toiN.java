package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class InCacSoLeTu1_toiN {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số n: ");
        n = scanner.nextInt();
        System.out.println("Các số lẻ từ 1 đến " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
