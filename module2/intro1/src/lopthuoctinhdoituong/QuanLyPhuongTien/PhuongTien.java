package lopthuoctinhdoituong.QuanLyPhuongTien;

import java.util.Scanner;

public class PhuongTien {
    private int id;
    private String hangsanxuat;
    private int year;
    private int price;
    private String color;
    Scanner scanner = new Scanner(System.in);

    public PhuongTien() {
    }

    public void PhuongTien(int id, String hangsanxuat, int year, int price, String color) {
        this.id = id;
        this.hangsanxuat = hangsanxuat;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
        return "Thông tin xe: {" +
                "id=" + id +
                ", hangsanxuat='" + hangsanxuat + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
