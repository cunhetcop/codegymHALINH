public class Xe {
    private int id;
    private String trangthai;
    private String loaixe;
    private int soghe;
    private String biensoxe;

    private int idTaixe;

    public Xe() {
    }

    public Xe(int id, String trangthai, String loaixe, int soghe, String biensoxe, int idTaixe) {
        this.id = id;
        this.trangthai = trangthai;
        this.loaixe = loaixe;
        this.soghe = soghe;
        this.biensoxe = biensoxe;
        this.idTaixe = idTaixe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public String getBiensoxe() {
        return biensoxe;
    }

    public void setBiensoxe(String biensoxe) {
        this.biensoxe = biensoxe;
    }

    public int getIdTaixe() {
        return idTaixe;
    }

    public void setIdTaixe(int idTaixe) {
        this.idTaixe = idTaixe;
    }

    @Override
    public String toString() {
        return "Xe{" +
                "id=" + id +
                ", status='" + trangthai + '\'' +
                ", loaixe='" + loaixe + '\'' +
                ", soghe=" + soghe +
                ", biensoxe='" + biensoxe + '\'' +
                ", idTaixe=" + idTaixe +
                '}';
    }
}