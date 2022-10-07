public class Khach {
    private int id;
    private String ten;
    private int sdt;
    private String diachi;
    private String email;

    public Khach() {
    }

    public Khach(int id, String ten, int sdt, String diachi, String email) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
