package Tinhdientich;

import java.util.Scanner;

public class TinhDienTich_ChuViHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh hình vuông: ");
        double canh = scanner.nextDouble();
        double P = canh * canh;
        System.out.println("Chu vi hình vuông là: " + P);
        double S = canh * 4;
        System.out.println("Diện tích hình vuông là: " + S);
    }
}