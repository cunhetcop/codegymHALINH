package Tinhdientich;

import java.util.Scanner;

public class TinhDienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        double lenght = scanner.nextDouble();
        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();
        double area = lenght * width;
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}