package GIT.kethua;

public class main {
    public static void main(String[] args) {
//        các thuộc tinh cho sẵn
        Fulltime fulltime1 = new Fulltime(15, "Tuấn",25,"Hà Nội",15.0);
        System.out.println("Nhân viên fulltime 1 có thông tin như sau: " + "\n"+ fulltime1.showfull());
        Partime parttime1 = new Partime(16, "Toàn", 33, "Hải Phòng", 20);
        System.out.println("Nhân viên parttime1 có thông tin như sau: " + "\n" + parttime1.showpart());


    }
}
