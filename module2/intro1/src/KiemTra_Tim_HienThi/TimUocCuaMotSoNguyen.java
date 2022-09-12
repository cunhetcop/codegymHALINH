package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class TimUocCuaMotSoNguyen {
    static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        //khai báo biến n là số cần tìm ước số
        int n;
        //yêu cầu người dùng nhập vào số cần tìm ước số
        System.out.println("\n\nNhập vào số cần tìm ước số: ");
        n = sc.nextInt();
        System.out.printf("Các ước số của %d là: ", n);
        //sử dụng vòng lặp for lặp từ 1 đến n, với bước nhảy ++
        for (int i = 1; i <= n; i++) {
            //nếu number chia hết cho i thì in i ra màn hình
            if (n % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
