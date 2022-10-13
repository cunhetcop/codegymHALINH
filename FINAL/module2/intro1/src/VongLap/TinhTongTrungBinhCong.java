package VongLap;

import java.util.Scanner;

public class TinhTongTrungBinhCong {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào giá trị của phần tử thứ: " + (i + 1) + ":");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for (double v : arr) {
            total = total + v;
        }
        double average = total / arr.length;
        System.out.println("Tổng trung bình cộng của mảng là: " + average);
    }

}

//    //mảng có sẵn
//    public static void main(String[] args) {
//        double[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
//        double total = 0;
//        for (int i = 0; i < arr.length; i++) {
//            total = total + arr[i];
//        }
//        double average = total / arr.length;
//        System.out.println("Tổng trung bình cộng của mảng là: " + average);
//    }
//
