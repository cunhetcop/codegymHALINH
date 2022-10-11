package managers;

import IO.ReadAndWrite;
import Validate.ValidateUser;
import Views.MenuUser;
import models.AccountAdmin;
import models.AccountUser;
import models.Cat;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUser {
    File file = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/case_study/CaseStudy/src/File_text/user.txt");
    File file1 = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/case_study/CaseStudy/src/File_text/giohang.txt");
    ReadAndWrite<AccountUser>readAndWrite = new ReadAndWrite<>();
    ReadAndWrite<Cat>readAndWrite2 = new ReadAndWrite<>();
    ArrayList<AccountUser> accountUsers = readAndWrite.read(file);
    ArrayList<Cat>giohang =readAndWrite2.read(file1);

    Scanner sc = new Scanner(System.in);

    MenuUser menuUser;
    ValidateUser validateUser;
    ManagerProduct managerProduct;

    ManagerAdmin managerAdmin = new ManagerAdmin();
    public boolean login() {
        try {
            System.out.println("Nhập username");
            String username = sc.nextLine();
            System.out.println("Nhập password");
            String password = sc.nextLine();
            for (int i = 0; i < accountUsers.size(); i++) {
                if (accountUsers.get(i).getUsername().equals(username) && accountUsers.get(i).getPassword().equals(password)) {
                      return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } return false;
    }
    public void register(){
        System.out.println("Nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        String age = validateUser.age();
        System.out.println("Nhập số điện thoại ( bắt đầu bằng +84 ): ");
        String telephone = validateUser.telephone();
        System.out.println("Nhập email: ");
        String email = validateUser.email();
        String username;
        while (true){
            System.out.println("Nhập username");
            username = validateUser.username();
            if (checkUserName(username)) {
                break;
            }
            System.out.println("Trùng username rồi");
        }
        System.out.println("Nhập password");
        String password = validateUser.password();
        System.out.println("Nhấn số '0' để hoàn tất đăng ký");
        String role = validateUser.role();

        accountUsers.add(new AccountUser(name,age,telephone,email,username,password,role,giohang));
        readAndWrite.write(file,accountUsers);
    }

    public void showACC() {
        for (int i = 0; i < accountUsers.size(); i++) {
            System.out.println(i + 1 + "." + "\n" + "ID:       " + accountUsers.get(i).getUsername() + "\n"
                    + "Password: " + accountUsers.get(i).getPassword() + "\n"
                    + "Tên:      " + accountUsers.get(i).getName() + "\n"
                    + "Tuổi:     " + accountUsers.get(i).getAge() + "\n"
                    + "SĐT:      " + accountUsers.get(i).getTelephone() + "\n"
                    + "Email     " + accountUsers.get(i).getEmail() + "\n"
                    +
                    "=====================");
        }
    }

    public void removeAcc() {
        String userremove = null;
        System.out.println("Nhập username muốn xóa");
        userremove = sc.nextLine();
        for (int i = 0; i < accountUsers.size(); i++) {
            if (userremove.equals(accountUsers.get(i).getUsername())) {
                accountUsers.remove(i);
            } else {
                System.out.println("username không tồn tại");
            }
        }
        readAndWrite.write(file , accountUsers);
    }

    public void uyquyenAdmin(){
        String usernameuyquyen = null;
        System.out.println("Nhập username muốn ủy quyền thành tài khoản Admin: ");
        usernameuyquyen = sc.nextLine();
        for (int i = 0; i < accountUsers.size(); i++) {
            if (usernameuyquyen.equals(accountUsers.get(i).getUsername())){
                accountUsers.remove(i);
                managerAdmin.accountAdmin.add(new AccountAdmin());
            }
        }
    }

    public boolean checkUserName(String username) {
        for (int i = 0; i < accountUsers.size(); i++) {
            if (accountUsers.get(i).getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    public void buyProduct(){
        System.out.println("Nhập tên sản phẩm muốn thêm vào giỏ hàng");
        String nameCaterory= sc.nextLine();
        for (int i = 0; i < managerProduct.CatList.size(); i++) {
            if(managerProduct.CatList.get(i).getNameCat().equals(nameCaterory)){
                giohang.add(managerProduct.CatList.get(i));
            }

        }
        readAndWrite.write(file , accountUsers);
        readAndWrite2.write(file1,giohang);
    }
    public void removeProduct(){
        System.out.println("Nhập tên sản phẩm muốn xóa khỏi giỏ hàng");
        String nameCaterory= sc.nextLine();
        for (int i = 0; i < giohang.size(); i++) {
            if(giohang.get(i).getNameCat().equals(nameCaterory)){
                giohang.remove(giohang.get(i));

            }

        }
//        readAndWrite.write(file,accountUsers);
        readAndWrite2.write(file1,giohang);
    }

    public void showProduct(){
        for (int i = 0; i <managerProduct.CatList.size() ; i++) {
            System.out.println(managerProduct.CatList.get(i).toString());
        }



    }
    public void showGioHang(){
        for (int i = 0; i < giohang.size(); i++) {
            System.out.println(giohang.get(i));
        }
        System.out.println("Tổng tiền giỏ hàng: " + tongTien());
    }


    public double tongTien(){
        double tongTien = 0.0;

        for (int i = 0; i < giohang.size(); i++) {
            tongTien += giohang.get(i).getPrice();
        }
        return tongTien;
    }

}