import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int j;
        int count = 0;

        for (i = 2; i < 1000; i++) {
            boolean check = true;
            if (count == 20) {
                break;
            }

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                count++;
            }
        }
    }
}