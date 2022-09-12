package Chuoi_String;

import java.util.Scanner;

public class SapXepChuoi {
    public static void main(String[] args) {
        int count;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số chuỗi mà bạn muốn sắp xếp theo Alphabet: ");
        count = scanner.nextInt();
        String[] str = new String[count];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập giá trị cho từng chuỗi: ");
        for (int i = 0; i < count; i++) {
            str[i] = scanner1.nextLine();
        }
        scanner.close();
        scanner1.close();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Các chuỗi sau khi sắp xếp là: ");
        for (int i = 0; i <= count - 1; i++) {
            System.out.println(str[i] + ",");
        }
    }
}

