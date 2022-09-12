package lopthuoctinhdoituong;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyMang {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n");
            System.out.println("QUẢN LÝ MẢNG SỐ");
            System.out.println("=====================");
            System.out.println("1. Show mảng số");
            System.out.println("2. Thêm số");
            System.out.println("3. Xóa số");
            System.out.println("0. Thoát");
            System.out.println("======================");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {

                    }
                    System.out.println("                       Mảng số hiện tại là: " + Arrays.toString(numbers) + "                          ");
                    break;

                case 2:
                    System.out.println("Nhập vị trí index muốn thêm");
                    int indexmuonthem = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập số muốn thêm vào mảng");
                    int somuonthem = sc.nextInt();
                    int[] arrNew = new int[numbers.length + 1];
                    for (int i = 0; i < arrNew.length; i++) {
                        if (i < indexmuonthem) {
                            arrNew[i] = numbers[i];
                        } else if (i == indexmuonthem) {
                            arrNew[i] = somuonthem;
                        } else {
                            arrNew[i] = numbers[i - 1];
                        }
                    }
                    numbers = arrNew;
                    System.out.println("Mảng số hiện tại là: " + Arrays.toString(numbers));
                    break;

                case 3:
                    System.out.println("Chọn 1 vị trí index muốn xóa");
                    int index = sc.nextInt();
                    int[] arrDel = new int[numbers.length - 1];
                    for (int i = 0; i < arrDel.length; i++) {
                        if (i < index) {
                            arrDel[i] = numbers[i];
                        } else {
                            arrDel[i] = numbers[i + 1];
                        }
                    }
                    numbers = arrDel;
                    System.out.println("Mảng số hiện tại là: " + Arrays.toString(numbers));
                    break;

                case 0:
                    System.out.println("cút");
                    break;
                default:
                    System.out.println("Nhập lại số");
                    break;
            }
        }
    }

}
