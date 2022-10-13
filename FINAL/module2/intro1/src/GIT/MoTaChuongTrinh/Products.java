package GIT.MoTaChuongTrinh;

import java.util.Scanner;

public class Products {
    private String serial;
    private String name;
    private int price;
    private int quantity;
    private String description;

    public Products() {

    }

    public Products(String serial, String name, int price, int quantity, String description) {
        this.serial = serial;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public void createProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập serial sản phẩm");
        this.serial = sc.nextLine();

        System.out.println("Nhập tên sản phẩm");
        this.name = sc.nextLine();

        System.out.println("Nhập giá sản phẩm");
        this.price = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số lượng sản phẩm");
        this.quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập mô tả sản phẩm");
        this.description = sc.nextLine();
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Thông tín sản phẩm: {" +
                "serial='" + serial + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
