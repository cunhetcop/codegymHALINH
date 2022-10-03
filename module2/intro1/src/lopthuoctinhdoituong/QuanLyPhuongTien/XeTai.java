package lopthuoctinhdoituong.QuanLyPhuongTien;

public class XeTai extends PhuongTien {
    private double TrongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        TrongTai = trongTai;
    }

    public XeTai(int id, String hangSanXuat, String namSanXuat, double giaXe, String mauXe, double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaXe, mauXe);
        TrongTai = trongTai;
    }

    public double getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(double trongTai) {
        TrongTai = trongTai;
    }
    @Override
    public void nhap() {
        System.out.println("Nhập thông tin xe tải ! ");
        super.nhap();
        System.out.println("Nhập trọng tải: ");
        this.TrongTai = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loại: xe tải{" +
                "TrongTai=" + TrongTai +
                '}');

    }
}