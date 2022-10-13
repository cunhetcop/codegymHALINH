package Tinhdientich;

import java.util.Scanner;

public class TinhDienTichTamGiac {
    public static double tinhDienTich(double canhDay, double chieuCao) {
        return (canhDay * chieuCao) / 2;
    }

    public static void main(String[] args) {
        double canhDay, chieuCao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chiều dài cạnh đáy: ");
        canhDay = scanner.nextDouble();
        System.out.println("Vui lòng nhập chiều cao: ");
        chieuCao = scanner.nextDouble();
        System.out.println("Diện tích hình tam giác là: " + tinhDienTich(canhDay, chieuCao));
    }
}