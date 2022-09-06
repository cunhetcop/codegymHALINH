import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean check = true;
        System.out.println("Mời nhập số để kiểm tra: ");
        number = sc.nextInt();


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }

        if (check)
            System.out.println(number + " là số nguyên tố");
        else
            System.out.println(number + " không phải số nguyên tố");
    }
}