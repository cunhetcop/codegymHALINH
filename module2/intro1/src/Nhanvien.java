import java.util.Scanner;

public class Nhanvien {
    int id;
    String name;
    int age;
    String adress;

    public Nhanvien(int id, String name, int age, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String show(){
        return "tên là: " + name + " tuổi là " + age + " địa chỉ là: " + adress + " id là " +id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên: ");
        int id = Integer.parseInt(sc.nextLine());


        System.out.println("Nhập tên nhân viên: ");
        String name = sc.nextLine();


        System.out.println("Nhập tuổi nhân viên: ");
        int age = Integer.parseInt(sc.nextLine());


        System.out.println("Nhập địa chỉ nhân viên: ");
        String adress = sc.nextLine();

        Nhanvien nv1 = new Nhanvien(id,name,age,adress);
        System.out.println(nv1.show());
    }
}
