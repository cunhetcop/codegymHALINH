package lopthuoctinhdoituong.QuanLySanPham.product;

public class Product {
    private int IDproduct;
    private String name;
    private double price;
    private int quantity;
    private String describe;

    public Product() {
    }

    public Product(int IDproduct, String name, double price, int quantity, String describe) {
        this.IDproduct = IDproduct;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
    }

    public int getIDproduct() {
        return IDproduct;
    }

    public void setIDproduct(int IDproduct) {
        this.IDproduct = IDproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + IDproduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String in() {
        return
                "ID=" + IDproduct + ", Tên Mèo= '" + name + '\'' + ", Giá= " + price + ", Số lượng= " + quantity + ", Mô tả= '" + describe + '\'';
    }
}

