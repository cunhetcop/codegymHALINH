package GIT.kethua.QuanLyCanBo;

public class Canbo {
    private String name;
    private int birthday;
    private String gender;
    private String address;

    public Canbo(){

    }

    public Canbo(String name, int birthday, String gender, String address){
        this.name=name;
        this.birthday=birthday;
        this.gender=gender;
        this.address=address;
    }

    public String getName() {
        return name;
    }
}
