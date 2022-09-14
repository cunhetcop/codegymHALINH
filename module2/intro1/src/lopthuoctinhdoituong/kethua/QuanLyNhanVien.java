package lopthuoctinhdoituong.kethua;
//quản lý nhân viên bao gồm các thuộc tính id name, age, adress
//nhân viên fulltime có thêm thuộc tính salary
//nhân viên partime có thêm thuộc tính số ngày đi làm
//về phương thức show lương thì nhân viên fulltime hiên thị lương, nv partime thì số ngày x120k
public class QuanLyNhanVien {
     private int id;
     private String name;
     private int age;
     private String adress;

    public QuanLyNhanVien() {
    }

    public QuanLyNhanVien(int id, String name, int age, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
