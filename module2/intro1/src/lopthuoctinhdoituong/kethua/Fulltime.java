package lopthuoctinhdoituong.kethua;

import java.util.Scanner;

public class Fulltime extends QuanLyNhanVien {
    static double salary;

    public Fulltime(int id, String name, int age, String adress, double salary) {
        super(id, name, age, adress);
        this.salary = salary;
    }

    public Fulltime() {
    }

        public String showfull(){
        return "ID: " + getId() + "\n"
                + "Tên: " + getName() + "\n"
                + "Tuổi: " + getAge() + "\n"
                + "Địa chỉ: " + getAdress() + "\n"
                + "Lương: " + salary + "\n";
    }

//    public String inputfull(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập ID nhân viên: ");
//        this.getId() = Integer.parseInt(sc.nextLine());
//    }

}
