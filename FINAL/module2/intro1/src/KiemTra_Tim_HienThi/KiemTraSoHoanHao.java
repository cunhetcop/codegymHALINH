package KiemTra_Tim_HienThi;

import java.util.Scanner;

    public class KiemTraSoHoanHao {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0, a;
            System.out.println("\n\nNhập số cần kiểm tra: ");
            a = scanner.nextInt();
            //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) {
                    //tổng các ước số của a
                    sum += i;
                }
            }
            //nếu tổng ước số sum=a thì a là số hoàn hảo
            if (sum == a) {
                System.out.println(a + " là số hoàn hảo.");
            } else {
                System.out.println(a + " không phải là số hoàn hảo");
            }

        }
    }
