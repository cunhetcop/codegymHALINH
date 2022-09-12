package KiemTra_Tim_HienThi;

import java.util.Scanner;

public class TimBoiChungNhoNhat {
    public static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        //khai báo n1, n2 là hai số cần tính bội chung nhỏ nhất
        //lcm là BCNN của a và b, gcd là UCLN của a và b
        int n1, n2, gcd = 1, lcm;
        System.out.println("\n\nNhập vào số thứ nhất: ");
        n1 = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        n2 = sc.nextInt();
        //sử dụng vòng lặp For để tính UCLN
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        //BCNN = (số thứ nhất * số thứ 2) / UCLN
        lcm = (n1 * n2) / gcd;
        System.out.printf("Bội chung nhỏ nhất của %d và %d là: %d", n1, n2, lcm);

    }
}
