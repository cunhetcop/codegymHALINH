package GIT.QuanLyHocVien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager {
    ArrayList<Students> students = IOStudent_nhiPhan.read();
    ArrayList<ClassCG> classCGS = IOClassCG_nhiPhan.read();
    Scanner scanner = new Scanner(System.in);


    public Manager() {
        classCGS.add(new ClassCG(1, "C0722G1"));
        classCGS.add(new ClassCG(2, "C0822J1"));
        classCGS.add(new ClassCG(3, "C0922K1"));
    }

    public void input() {
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính học viên: ");
        String gender = scanner.nextLine();

        int age = 0;
        while (true) {
            try {
                System.out.println("Nhập tuổi học viên:");
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng: ");
            }
        }

        System.out.print("Nhập số điện thoại học viên: ");
        String phone = scanner.nextLine();

        Date date = null;
        while (true) {
            System.out.println("Nhập ngày sinh của học viên theo định dạng dd/MM/yyyy: ");
            String birthday = scanner.nextLine();
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
                break;
            } catch (Exception e) {
                System.out.println("Sai định dạng");
            }
        }
        for (int i = 0; i < classCGS.size(); i++) {
            System.out.println(i+1 + ": " + classCGS.get(i).getName());
        }
        System.out.println("Mời bạn chọn lớp theo thứ tự: ");
        int choice = Integer.parseInt(scanner.nextLine());
        ClassCG classCG = classCGS.get(choice - 1);
        Students students1 = new Students(name,gender, age, phone, date, classCG );
        students.add(students1);
        IOStudent_nhiPhan.write(students);

    }
    public void show(){
        for (Students s : students) {
            System.out.println(s.toString());
        }
    }
    public void showClass(){
        int lop=0;
        boolean check = false;

        while (!check || lop<0){
            try {


                System.out.println("Nhap id lop: ");
                lop = Integer.parseInt(scanner.nextLine());
                check = true;

            } catch (NumberFormatException e){
                System.out.println("Nhap lai id la so nguyen lon hon 0");
            }
        }

        for (Students s : students) {
            if (lop == s.getClassCG().getId()){
                System.out.println(s);
                break;
            }
        }

    }


    public void menu(){
        int choice;
        do{
            System.out.println("\n========================");
            System.out.println("Menu lua chon chuc nang");
            System.out.println("1: Them");
            System.out.println("2: Show");
            System.out.println("3: Show theo id lop.  ");
            System.out.println("4: Thoat ");
            System.out.println("========================");
            System.out.println("Lua chon: ");
            while (true)
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Chon Lai: ");
                }
            switch (choice){
                case 1:
                    input();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    showClass();
                    break;
                case 4:
                    System.out.println("Cam on");
                    break;
                default:
                    System.out.println("chon lai di");
                    break;
            }
        }while (choice != 4);
    }
}