package GIT.QuanLyPhuongTien;

import java.util.Scanner;

public class PhuongTien {
    private int id;
    private String HangSanXuat;
    private String NamSanXuat;
    private double GiaXe;
    private String MauXe;

    public PhuongTien() {
    }

    public PhuongTien(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe) {
        this.id = id;
        HangSanXuat = hangSanXuat;
        NamSanXuat = namSanXuat;
        GiaXe = giaXe;
        MauXe = mauXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public double getGiaXe() {
        return GiaXe;
    }

    public void setGiaXe(double giaXe) {
        GiaXe = giaXe;
    }

    public String getMauXe() {
        return MauXe;
    }

    public void setMauXe(String mauXe) {
        MauXe = mauXe;
    }
    Scanner scanner = new Scanner(System.in);


    public void nhap() {
        System.out.println("Nhập id phương tiện: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất phương tiện: ");
        this.HangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất phương tiện: ");
        this.NamSanXuat = scanner.nextLine();
        System.out.println("Nhập giá bán phương tiện: ");
        this.GiaXe = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu phương tiện: ");
        this.MauXe = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Phương tiện: {" +
                "id=" + id +
                ", HangSanXuat='" + HangSanXuat + '\'' +
                ", NamSanXuat='" + NamSanXuat + '\'' +
                ", GiaXe=" + GiaXe +
                ", MauXe='" + MauXe + '\'' +
                ", scanner=" + scanner +
                '}';
    }

    public void xuat() {
        System.out.println( "Phương tiện: {" +
                "id=" + id +
                ", HangSanXuat='" + HangSanXuat + '\'' +
                ", NamSanXuat='" + NamSanXuat + '\'' +
                ", GiaXe=" + GiaXe +
                ", MauXe='" + MauXe + '\'' +
                '}');
    }
}