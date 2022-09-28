package lopthuoctinhdoituong.QuanLySanPham;

import java.util.Scanner;

public class Products {
    private int id;
    private String name;
    private int price;

    public Products(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void create(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id sản phẩm");
        this.id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sản phẩm");
        this.name = sc.nextLine();

        System.out.println("Nhập giá sản phẩm");
        this.price = Integer.parseInt(sc.nextLine());


    }
}
