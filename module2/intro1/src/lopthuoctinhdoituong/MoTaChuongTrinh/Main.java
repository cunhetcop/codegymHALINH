package lopthuoctinhdoituong.MoTaChuongTrinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MethodProducts methodProducts = new MethodProducts();
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=============================");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm sản phẩm có giá đắt nhất");

            System.out.println("=============================");
            System.out.print("Nhập số: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    //Xem danh sách
                    methodProducts.showProducts();
                    break;
                case 2:
                    //Thêm mới
                    methodProducts.addProducts();
                    break;
                case 3:
                    //Cập nhật
                    methodProducts.updateProducts();
                    break;
                case 4:
                    //Xóa
                    methodProducts.deleteProducts();
                    break;
                case 5:
                    //Sắp xếp
                    break;
                case 6:
                    //Tìm sản phẩm có giá đắt nhất
                    break;
            }
        }
    }
}
