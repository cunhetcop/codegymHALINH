package GIT.QuanLyThuVien;

import java.util.Scanner;
public class SinhVien{
    private String MaSV;
    private String HoTen;
    private String Date;
    private String Lop;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String date, String lop) {
        MaSV = maSV;
        HoTen = hoTen;
        Date = date;
        Lop = lop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }
    Scanner scanner = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhập mã sinh viên: ");
        this.MaSV = scanner.nextLine();
        System.out.println("Nhập họ tên sinh viên: ");
        this.HoTen = scanner.nextLine();
        System.out.println("Nhập ngày sinh sinh viên: ");
        this.Date = scanner.nextLine();
        System.out.println("Nhập lớp sinh viên: ");
        this.Lop = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên: {" +
                "MaSV='" + MaSV + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", Date='" + Date + '\'' +
                ", Lop='" + Lop + '\'' +
                '}';
    }

    public void xuat(){
        System.out.println("SinhVien{" +
                "MaSV='" + MaSV + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", Date='" + Date + '\'' +
                ", Lop='" + Lop + '\'' +
                '}');
    }
}