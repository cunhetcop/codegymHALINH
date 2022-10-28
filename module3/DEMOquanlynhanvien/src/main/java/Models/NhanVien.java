package Models;

public class NhanVien {
    private int id;
    private String name;
    private String img;
    private boolean status;

    public NhanVien() {
    }

    public NhanVien(int id, String name, String img, boolean status) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
