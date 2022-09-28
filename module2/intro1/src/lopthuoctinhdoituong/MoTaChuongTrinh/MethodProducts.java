package lopthuoctinhdoituong.MoTaChuongTrinh;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodProducts {
    public MethodProducts(){

    }

    private ArrayList<Products> listProducts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);



    public void showProducts(){
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }

    public void addProducts(){
        Products products = new Products();
        products.createProducts();
        listProducts.add(products);
    }

    public void updateProducts(){
        System.out.print("Nhập serial sản phẩm muốn thay thế: ");
        String serial = sc.nextLine();
        for (int i = 0; i < listProducts.size(); i++) {
            if(serial.equals(listProducts.get(i).getSerial())){
                listProducts.get(i).createProducts();
            }
        }
    }

    public void deleteProducts(){
        System.out.println("Nhập serial của sản phẩm muốn xóa: ");
        String serial = sc.nextLine();
        for (int i = 0; i < listProducts.size(); i++) {
            if (serial.equals(listProducts.get(i).getSerial())){
                listProducts.remove(i);
            }
        }
    }
}
