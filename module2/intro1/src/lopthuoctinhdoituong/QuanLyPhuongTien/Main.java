package lopthuoctinhdoituong.QuanLyPhuongTien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method method = new Method();
        method.menuchinh();
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                method.dieuChinhPT();
                break;
            case 2:

        }
    }
}
