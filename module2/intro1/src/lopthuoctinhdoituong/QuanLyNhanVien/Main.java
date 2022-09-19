package lopthuoctinhdoituong.QuanLyNhanVien;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        methodNV methodNV = new methodNV();

        while (true) {
        System.out.println("===================================");
        System.out.println("1. Hiển thị toàn bộ nhân viên");
        System.out.println("2. Thêm một nhân viên mới vào cuối danh sách");
        System.out.println("3. Sửa thông tin nhân viên tại vị trí index");
        System.out.println("4. Xóa nhân viên tại vị trí index");
        System.out.println("5. Tìm kiếm nhân viên theo số id");
        System.out.println("0. Thoát");
        System.out.println("====================================");
            System.out.print("Nhập số:                  ");
        int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    //Hiển thị
                    methodNV.showNV();
                    break;
                case 2:
                    //Thêm
                    methodNV.createNV();
                    break;
                case 3:
                    //Sửa
                    methodNV.changeNV();
                    break;
                case 4:
                    //xóa
                    methodNV.deleteNV();
                    break;
                case 5:
                    //Tìm
                    methodNV.searchNV();
                    break;
                case 0:
                    System.err.println("TIỄN VONG!");
                    return;
                default:
                    System.out.println("Xin vui lòng chọn đúng số menu có sẵn");
            }
        }
    }
}
