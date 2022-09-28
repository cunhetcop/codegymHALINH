package lopthuoctinhdoituong.QuanLyThuVien;

import java.util.Scanner;

public class TheMuon {
    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach; // ten sach
    private SinhVien SinhVien;

    public TheMuon() {
    }

    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.SinhVien = sinhVien;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return SinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.SinhVien = sinhVien;
    }
    Scanner scanner = new Scanner(System.in);
    public void nhapds(){
        System.out.println("Nhập số phiếu mượn: ");
        this.soPhieuMuon = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày mượn: ");
        this.ngayMuon = scanner.nextLine();
        System.out.println("Nhập ngày trả: ");
        this.hanTra = scanner.nextLine();
        System.out.println("Nhập số hiệu sách: ");
        this.soHieuSach = scanner.nextLine();

        SinhVien SinhVien1 = new SinhVien();
        this.SinhVien = SinhVien1;
        SinhVien1.nhap();
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "soPhieuMuon=" + soPhieuMuon +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                ", sinhVien=" + SinhVien +
                '}';
    }

    public void xuatds(){
        System.out.println("TheMuon{" +
                "soPhieuMuon=" + soPhieuMuon +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                ", sinhVien=" + SinhVien +
                '}');
    }
}