package lopthuoctinhdoituong.QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Products> listProducts = new ArrayList<>();

    public void showProducts() {
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }

    public void addProducts() {
        Products products = new Products();
        products.create();
        listProducts.add(products);
    }

    public void changeProducts() {
        System.out.println("Nhập ID sản phẩm muốn thay thế");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProducts.size(); i++) {
            if (id == listProducts.get(i).getId()) {
                listProducts.get(i).create();
            }
        }
    }

    public void removeProducts() {
        System.out.println("Nhập ID sản phẩm muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProducts.size(); i++) {
            if (id == listProducts.get(i).getId()) {
                listProducts.remove(i);
            }
        }
    }

    public void sortProduct() {
        for (int i = 0; i < listProducts.size() - 1; i++) {
            for (int j = i + 1; j < listProducts.size(); j++) {
                if (listProducts.get(i).getPrice() > listProducts.get(j).getPrice()) {
                    Products temp = listProducts.get(i);
                    listProducts.set(i, listProducts.get(j));
                    listProducts.set(j, temp);
                }
            }
        }
    }

    public void highestPriceProduct() {
        int maxPrice = 0;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getPrice() > maxPrice) {
                maxPrice = listProducts.get(i).getPrice();
            }
        }

        for (int i = 0; i < listProducts.size(); i++) {
            if (maxPrice == listProducts.get(i).getPrice()){
                System.out.println("Sản phẩm có giá lớn nhất là: "+maxPrice +"\n" +listProducts.get(i).toString());
            }
        }
    }
}
