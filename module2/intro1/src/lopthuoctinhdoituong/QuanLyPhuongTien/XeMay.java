package lopthuoctinhdoituong.QuanLyPhuongTien;

public class XeMay extends PhuongTien{
    private double CongXuat;

    public XeMay() {
    }

    public XeMay(double congXuat) {
        CongXuat = congXuat;
    }

    public XeMay(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe, double congXuat) {
        super(id, hangSanXuat, namSanXuat, giaXe, mauXe);
        CongXuat = congXuat;
    }

    public double getCongXuat() {
        return CongXuat;
    }

    public void setCongXuat(double congXuat) {
        CongXuat = congXuat;
    }

    @Override
    public void nhap() {
        System.out.println("Nhập thông tin xe máy ! ");
        super.nhap();
        System.out.println("Nhập công suất xe máy: ");
        this.CongXuat = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loại: xe máy{" +
                "CongXuat=" + CongXuat +
                '}');
    }
}