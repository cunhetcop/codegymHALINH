package lopthuoctinhdoituong.kethua;

public class Partime extends QuanLyNhanVien {
    int workday;


    public Partime() {
    }

    public Partime(int id, String name, int age, String adress, int workday) {
        super(id, name, age, adress);
        this.workday = workday;
    }

    public String showpart(){
        return "ID: " + getId() + "\n"
                + "Tên: " + getName() + "\n"
                + "Tuổi: " + getAge() + "\n"
                + "Địa chỉ: " + getAdress() + "\n"
                + "Lương: " + workday*120000 + "\n";
    }
}
