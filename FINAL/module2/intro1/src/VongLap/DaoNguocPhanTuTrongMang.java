package VongLap;

import java.util.Scanner;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        int counter, i, j, temp;
        int[] number = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng: ");
        counter = scanner.nextInt();
        for (i = 0; i < counter; i++) {
            System.out.println("Phần tử " + (i + 1) + ": ");
            number[i] = scanner.nextInt();
        }
        j = i - 1;
        i = 0;
        scanner.close();
        while (i < j) {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
        System.out.println("Mảng sau khi được đảo ngược: ");
        for (i = 0; i < counter; i++) {
            System.out.println(number[i] + " ");
        }

    }
}
