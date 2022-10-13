import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laisuat = 1.2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền vay:");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng đã vay:");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất:");
        laisuat = sc.nextDouble();
        double tonglaisuat = 0;
        for (int i = 0; i < month; i++ ){
            tonglaisuat += money * (laisuat/100)/12;
            money += money * (laisuat/100)/12;
        }
        System.out.println("Tổng số tiền lãi qua các tháng là: " + tonglaisuat);
    }
}