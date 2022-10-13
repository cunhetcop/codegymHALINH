package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class CachLamTronSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nNhập số muốn làm tròn: ");
        double num = scanner.nextDouble();
        //sử dụng format để làm tròn tới 3 chữ số thập phân "%3f"
        System.out.format("Số %f sau khi được làm tròn: %3f", num, num);
    }
}
