package lopthuoctinhdoituong.QuanLyPhuongTien;

public class Oto extends PhuongTien {
    private int soChoNgoi;
    private double KieuDongCo;

    public Oto() {
    }

    public Oto(int soChoNgoi, double kieuDongCo) {
        this.soChoNgoi = soChoNgoi;
        this.KieuDongCo = kieuDongCo;
    }

    public Oto(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe, int soChoNgoi, double kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaXe, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.KieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public double getKieuDongCo() {
        return KieuDongCo;
    }

    public void setKieuDongCo(double kieuDongCo) {
        KieuDongCo = kieuDongCo;
    }
    @Override
    public void nhap() {
        System.out.println("Nhập thông tin oto ! ");

        super.nhap();
        System.out.println("Nhập số chỗ ngồi cho xe: ");
        this.soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu động cơ cho xe: ");
        this.KieuDongCo = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loại: Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", KieuCoDong=" + KieuDongCo +
                '}');


    }
}