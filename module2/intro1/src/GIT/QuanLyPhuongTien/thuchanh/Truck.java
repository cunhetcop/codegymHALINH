package GIT.QuanLyPhuongTien.thuchanh;

import java.util.Scanner;

public class Truck extends Vehicle{
    private double load;

    public Truck(){

    }

    public Truck(double load) {
        super();
        this.load = load;
    }

    public Truck(int id, String manufacturer, String year, double price, String color, double load) {
        super(id, manufacturer, year, price, color);
        this.load = load;
    }
    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("Nhập thông tin xe tải");
        super.input();

        System.out.println("Nhâp tải trọng (double)");
        this.load = Double.parseDouble(scanner.nextLine());
    }

    public String show(){
        super.show();
        System.out.println("Loại: Xe tải{" + "load=" + load + '}');
        return "==========";
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}
