package lopthuoctinhdoituong.QuanLyMangSo;

import java.util.Scanner;

public class NhanVien {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quản lý số");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println("bạn đã chọn " + choice);

            switch (choice) {
                case 1:
                    manager.show();
                    break;
                case 2:
                    manager.them();
                    break;
                case 3:
                    manager.sua();
                    break;
                case 4:
                    manager.xoa();
                    break;
                case 5:
                    return;
            }
        }
    }
}
