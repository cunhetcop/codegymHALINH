import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("Ước chung lớn nhất của a và b là: " + i);
                break;
            }
        }
    }
}