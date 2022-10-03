package lopthuoctinhdoituong.QuanLyPhuongTien.thuchanh;

import java.util.Scanner;

public class Motor extends Vehicle{
    private double power;

    public Motor() {
    }

    public Motor(double power) {
        super();
        this.power = power;
    }
    public Motor (int id, String manufacturer, String year, double price, String color, double power){
        super(id, manufacturer, year, price, color);
        this.power = power;
    }
    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("Nhập thông tin xe máy");
        super.input();

        System.out.println("Nhập công suất động cơ (double)");
        this.power = Double.parseDouble(scanner.nextLine());
    }

    public String show(){
        super.show();
        System.out.println("Loại: Motor{" + "power=" + power + '}');
        return "================";
    }


    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
