package lopthuoctinhdoituong.QuanLyNhanVienTest;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String address;

    public NhanVien(int id, String name, int age, String address) {

    }

    public void NhanVien ( int id, String name, int age, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

public NhanVien(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname(){
        return name;
    }
    public void setname ( String name ){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge( int age){
        this.age = age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
