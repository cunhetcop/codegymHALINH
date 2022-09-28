package lopthuoctinhdoituong.QuanLyPhuongTien;

public class oto extends PhuongTien{
    private int sochongoi;
    private String kieudongco;

    public oto() {
    }

    public oto(int sochongoi, String kieudongco) {
        super();
        this.sochongoi = sochongoi;
        this.kieudongco = kieudongco;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }
}
