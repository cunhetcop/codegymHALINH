package lopthuoctinhdoituong.MoTaChuongTrinh;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodProducts {

    public void menu() {
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
                    this.showProducts();
                    break;
                case 2:
                    //Thêm mới
                    this.addProducts();
                    break;
                case 3:
                    //Cập nhật
                    this.updateProducts();
                    break;
                case 4:
                    //Xóa
                    this.deleteProducts();
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

    ArrayList<Products> listProducts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void showProducts() {
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }

    public void addProducts() {
        Products products = new Products();
        products.createProducts();
        listProducts.add(products);
    }

    public void updateProducts() {
        System.out.print("Nhập serial sản phẩm muốn thay thế: ");
        String serial = sc.nextLine();
        for (int i = 0; i < listProducts.size(); i++) {
            if (serial.equals(listProducts.get(i).getSerial())) {
                listProducts.get(i).createProducts();
            }
        }
    }

    public void deleteProducts() {
        System.out.println("Nhập serial của sản phẩm muốn xóa: ");
        String serial = sc.nextLine();
        for (int i = 0; i < listProducts.size(); i++) {
            if (serial.equals(listProducts.get(i).getSerial())) {
                listProducts.remove(i);
            }
        }
    }
}
