package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class KiemTraHaiSoNguyenTo {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra: ");
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " là số nguyên tố! ");
        } else {
            System.out.println(num + " không phải là số nguyên tố! ");
        }
    }
}
