import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        if (sc.nextInt() % 2 == 0){
            System.out.println("Số chẵn");
        }
        else {
            System.out.println("Số lẻ");
        }
    }
}
