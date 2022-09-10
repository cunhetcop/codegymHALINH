package nhap;

import java.lang.reflect.Constructor;
import java.util.Scanner;

class Nhanvien{
    static int id;
    static String name;
    static int age;
    static String adress;

    public Nhanvien( int id, String name, int age, String adress ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String show(){
        return "Id của nhân viên là: " + id + "\n"
                + "Tên của nhân viên là: " + name + "\n"
                + "Tuổi của nhân viên là: " + age + "\n"
                + "Địa chỉ của nhân viên là: " + adress;
    }

    public static void main(String[] args) {
       Nhanvien nv1 = new Nhanvien(15,"Linh",33,"Hanoi");
        System.out.println(nv1.show());
        Nhanvien nv2 = new Nhanvien(16,"Toàn",18,"Quang Ninh");
        System.out.println(nv2.show());
    }



}
