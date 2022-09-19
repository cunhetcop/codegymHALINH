package lopthuoctinhdoituong.QuanLyMangSo;

import java.util.Scanner;

public class Manager {
    int[] numbers = {};
    Scanner scanner = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void them() {
        System.out.println("Nhập số muốn thêm");
        int so = Integer.parseInt(scanner.nextLine());

        int[] newArr = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newArr[i] = numbers[i];
        }
        newArr[newArr.length - 1] = so;
        numbers = newArr;
    }

    public void sua() {
        System.out.println("Nhập vị trí muốn sửa");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < numbers.length) {
            System.out.println("Nhập số muốn sửa");
            int so = Integer.parseInt(scanner.nextLine());
            numbers[index] = so;
        } else {
            System.out.println("Lỗi rồi");
        }
    }

    public void xoa() {
        System.out.println("Nhập vị trí muốn xóa");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < numbers.length) {
            int[] newArr = new int[numbers.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = numbers[i];
                } else {
                    newArr[i] = numbers[i + 1];
                }
            }
            numbers = newArr;
        } else {
            System.out.println("Lỗi rồi");
        }
    }
}