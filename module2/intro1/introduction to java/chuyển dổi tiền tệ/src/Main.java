import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số tiền USD: ");
        usd = sc.nextDouble();
        double change = usd * vnd;
        System.out.println(usd+"USD" + " bằng " + change + " VNĐ");
    }
}