package lopthuoctinhdoituong.QuanLyNhanVienTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("1. Hiển thị nhân viên");
        System.out.println("2. Thêm nhân viên vào cuối danh sách");
        System.out.println("3. Sửa thông tin nhân viên vị trí index");
        System.out.println("4. Xóa nhân viên vị trí index");
        System.out.println("5. Tìm thông tin theo id");
        System.out.println("0. Thoát");
        int choice = Integer.parseInt(sc.nextLine());

        while (true) {
            switch (choice) {
                case 1:
                    //Hiển thị
                    break;
                case 2:
                    //Thêm
                    break;
                case 3:
                    //Sửa
                    break;
                case 4:
                    //Xóa
                    break;
                case 5:
                    //Tìm kiếm
                    break;
                case 0:
                    return;
            }
        }
    }
}
