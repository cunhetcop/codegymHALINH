package GIT.QuanLyPhuongTien.thuchanh;

import java.util.Scanner;

public class Vehicle {
    private int id;
    private String manufacturer;
    private String year;
    private double price;
    private String color;

    public Vehicle(){

    }

    public Vehicle(int id, String manufacturer, String year, double price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("Nhập id phương tiện (int)");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất (String)");
        this.manufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất (String)");
        this.year = scanner.nextLine();
        System.out.println("Nhập giá (double)");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu (String)");
        this.color = scanner.nextLine();
    }

    public String show(){
        System.out.println("Thông tin phương tiện: {" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}');
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
