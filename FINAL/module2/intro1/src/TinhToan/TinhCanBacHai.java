package TinhToan;

import java.util.Scanner;
public class TinhCanBacHai {
    public static double squareRoot(int number) {
        double temp;
        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào một số: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Căn bậc hai của " + num + " là: " + squareRoot(num));
    }
}
