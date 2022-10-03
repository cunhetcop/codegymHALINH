package lopthuoctinhdoituong.QuanLyPhuongTien.thuchanh;

import java.util.Scanner;

public class Car extends Vehicle {
    private int seat;
    private double engine;

    public Car() {
    }

    public Car(int seat, double engine) {
        super();
        this.seat = seat;
        this.engine = engine;
    }
    public Car (int id, String manufacturer, String year, double price, String color, int seat, double engine){
        super(id, manufacturer, year, price, color);
        this.seat = seat;
        this.engine = engine;
    }
    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("Nhập thông tin Oto");
        super.input();

        System.out.println("Nhập số ghế ngồi (int)");
        this.seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập công suất động cơ (double)");
        this.engine = Double.parseDouble(scanner.nextLine());
    }

    public String show(){
        super.show();
        System.out.println(     "Loại: Oto {" + "seat=" + seat + ", engine=" + engine + '}'    );
        return "====================";
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
