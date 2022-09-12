import java.util.Scanner;

public class TinhTong2SoNguyen {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
    }
}