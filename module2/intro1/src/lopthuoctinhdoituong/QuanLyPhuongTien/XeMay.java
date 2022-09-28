package lopthuoctinhdoituong.QuanLyPhuongTien;

public class XeMay extends PhuongTien{
    private double congsuat;

    public XeMay() {
    }

    public XeMay(double congsuat) {
        super();
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
}
