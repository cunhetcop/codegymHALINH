package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class KiemTraSoAmDuong {
    public static void main(String[] args) {
        double number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số để kiểm tra: ");
        number = scanner.nextDouble();
        scanner.close();
        if (number > 0) {

            System.out.println(number + " là số dương!");
        } else if (number < 0) {
            System.out.println(number + " là số âm!");
        } else {
            System.out.println(number + " không phải là số câm cũng không phải là số dương!");
        }
    }
}
