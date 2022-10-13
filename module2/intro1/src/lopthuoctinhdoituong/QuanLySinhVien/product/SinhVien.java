package lopthuoctinhdoituong.QuanLySinhVien.product;

public class SinhVien {
    private int ID;
    private String name;
    private int age;
    private String gender;
    private String address;

    private int averagemark;

    public SinhVien() {
    }

    public SinhVien(int ID, String name, int age, String gender, String address, int averagemark) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averagemark=averagemark;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAveragemark() {
        return averagemark;
    }

    public void setAveragemark(int averagemark) {
        this.averagemark = averagemark;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", averagemark=" + averagemark +
                '}';
    }



    public String in() {
        return
                "ID=" + ID + ", Tên Sinh Viên= '" + name + '\'' + ", Tuổi= " + age + ", Giới tính= " + gender + ", = '" + address + ", Địa chỉ= "+averagemark+'\'';
    }
}

