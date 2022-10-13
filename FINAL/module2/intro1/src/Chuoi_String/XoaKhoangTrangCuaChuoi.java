package Chuoi_String;

import java.util.Scanner;

public class XoaKhoangTrangCuaChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nNhập vào chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();
        System.out.println("Chuỗi ban đầu là: " + input);

        //sử dụng phương thức replaceAll() để thay thê "" bằng "".
        input = input.replaceAll("\\s", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + input);
    }
}
