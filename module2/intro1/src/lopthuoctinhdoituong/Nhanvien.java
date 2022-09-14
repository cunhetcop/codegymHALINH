package lopthuoctinhdoituong;

import java.util.Arrays;
import java.util.Scanner;

class Nhanvien {
    int id;
    String name;
    int age;
    String adress;

    public Nhanvien(int id, String name, int age, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String show() {
        return "tên là: " + name + " tuổi là " + age + " địa chỉ là: " + adress + " id là " +id;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên: ");
        this.id = Integer.parseInt(sc.nextLine());


        System.out.println("Nhập tên nhân viên: ");
        this.name = sc.nextLine();


        System.out.println("Nhập tuổi nhân viên: ");
        this.age = Integer.parseInt(sc.nextLine());


        System.out.println("Nhập địa chỉ nhân viên: ");
        this.adress = sc.nextLine();


    }

    public Nhanvien() {
    }

    public static void main(String[] args) {
        Nhanvien[] mang = new Nhanvien[2];

        Nhanvien nv1 = new Nhanvien();
        nv1.input();
        mang[0] = nv1;
        System.out.println(nv1.show());

        Nhanvien nv2 = new Nhanvien();
        nv2.input();
        mang[1] = nv2;
        System.out.println(nv2.show());


        System.out.println(Arrays.toString(mang));
    }
}
