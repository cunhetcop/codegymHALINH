package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        num2 = scanner.nextInt();
        scanner.close();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        System.out.println("Ước chung lớn nhất là: " + num2);
    }
}
