package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class InCacSoArmstrong {
    public static void main(String[] args) {
        int num, start, end, i, rem, temp, counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bắt đầu: ");
        start = scanner.nextInt();
        System.out.println("Nhập vào số kết thúc: ");
        end = scanner.nextInt();
        scanner.close();
        for (i = start; i < end; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == num) {
                if (counter == 0) {
                    System.out.println("Các số Armstrong giữa " + start + " và " + end + " là: ");
                }
                System.out.print(i + " ");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Không có số Armstrong giữa " + start + " và " + end);
        }
    }
}
