package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class ChuongTrinhTachMotSoNguyenThanhNhieuChuSo {
    public static void main(String[] args) {
        int num, temp, digit, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần tách: ");
        num = scanner.nextInt();
        scanner.close();
        temp = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            System.out.println("Vị trí số " + count + " là " + digit);
            temp = temp / 10;
            count--;
        }
    }
}
