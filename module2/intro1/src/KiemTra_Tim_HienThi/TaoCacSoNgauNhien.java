package KiemTra_Tim_HienThi;

import java.util.Random;
import java.util.Scanner;

public class TaoCacSoNgauNhien {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn random bao nhiêu số: ");
        num = scanner.nextInt();
        int counter;
        Random rNum = new Random();
        System.out.println("Các số random là: ");
        for (counter = 1; counter <= num; counter++) {
            System.out.println(rNum.nextInt(200));
        }
    }
}
