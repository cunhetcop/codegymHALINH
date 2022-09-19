package lopthuoctinhdoituong.QuanLyNhanVienTest;

import java.util.Scanner;

public class MethodNV {
    Scanner sc = new Scanner(System.in);
    NhanVien[] mainArr = new NhanVien[]{};

    public NhanVien CreateNV(){
        System.out.print("Nhập id nhân viên:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên nhân viên:");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi nhân viên:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ nhân viên:");
        String address = sc.nextLine();
        NhanVien nv = new NhanVien(id, name,age,address);
        return nv;
    }


}
