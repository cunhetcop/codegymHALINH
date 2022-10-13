package VongLap;

import java.util.Scanner;

public class TinhTongCacSoTrongMang {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Kết quả là: " + sum);
    }
}

//nhập mảng sử dụng Scanner
//public class TinhTongCacSoTrongMang {
//    public static void main(String[] args) {
//        System.out.println("Nhập vào số phần tử trong mảng: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        double[] arr = new double[n];
//        double total = 0;
//        for (double i : arr) {
//            System.out.println("Nhập vào giá trị của phần từ thứ: " + (i + 1) + ": ");
//            arr[(int) i] = scanner.nextDouble();
//        }
//        scanner.close();
//        for (double i : arr) {
//            total = total + arr[(int) i];
//        }
//        System.out.println("Tổng các số trong mảng là: " + total);
//    }
//}
