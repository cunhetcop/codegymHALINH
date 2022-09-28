package lopthuoctinhdoituong.QuanLySanPham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("================================");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm mới một sản phẩm");
            System.out.println("3. Sửa một sản phẫm");
            System.out.println("4. Xóa một sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("6. Hiển thị sản phẩm có giá cao nhất");
            System.out.println("0. Thoát");
            System.out.println("===============================");
            System.out.print("Nhập số: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    //Show
                    manager.showProducts();
                    break;
                case 2:
                    //Thêm
                    manager.addProducts();
                    break;
                case 3:
                    //Sửa
                    manager.changeProducts();
                    break;
                case 4:
                    //Xóa
                    manager.removeProducts();
                    break;
                case 5:
                    //Sắp xếp theo giá từ thấp cao
                    manager.sortProduct();
                    break;
                case 6:
                    //Hiển thị sản phẩm giá cao nhất
                    manager.highestPriceProduct();
                    break;
                case 0:
                    System.err.println("Tạm biệt");
                    return;
            }
        }
    }
}
