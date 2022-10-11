package Views;

import managers.ManagerAdmin;
import managers.ManagerProduct;
import managers.ManagerUser;
import models.AccountAdmin;
import models.Cat;

import java.util.Scanner;

public class MenuAdmin {

    Scanner sc = new Scanner(System.in);
    ManagerProduct managerProduct = new ManagerProduct();

    AccountAdmin accountAdmin = new AccountAdmin();

    ManagerUser managerUser = new ManagerUser();

    ManagerAdmin managerAdmin = new ManagerAdmin();


    public void menuAdmin() {
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("╔===================================================╗");
            System.out.println("║                       ADMIN                       ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. Đăng nhập                                     ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("║                                                   ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 2) {
                    System.out.println();
                    System.out.println("Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                }
                switch (choice) {
                    case 1:
                        if (managerAdmin.loginAdmin()) {
                            while (true) {
                                System.out.println("╔===================================================╗");
                                System.out.println("║         ▂ ▃ ▅ ▆ █ QUẢN LÝ SẢN PHẨM █ ▆ ▅ ▃ ▂      ║");
                                System.out.println("╠===================================================╣");
                                System.out.println("║[1]. Hiển thị danh sách sản phẩm                   ║");
                                System.out.println("║[2]. Thêm Sản Phẩm                                 ║");
                                System.out.println("║[3]. Sửa Sản Phẩm                                  ║");
                                System.out.println("║[4]. Tìm kiếm Sản Phẩm                             ║");
                                System.out.println("║[5]. Xóa sản phẩm                                  ║");
                                System.out.println("║[6]. Hiển thị danh sách nhân viên                  ║");
                                System.out.println("║[7]. Xóa tài khoản nhân viên theo username         ║");
                                System.out.println("║[0]. Thoát                                         ║");
                                System.out.println("╚===================================================╝");
                                System.out.println("Nhập lựa chọn:");
                                try {
                                    int choice1 = Integer.parseInt(sc.nextLine());
                                    if (choice1 < 0 || choice1 > 7) {
                                        System.out.println();
                                        System.out.println("Lựa chọn không tồn tại");
                                    }

                                    switch (choice1) {
                                        case 1:
                                            managerProduct.showCat();
                                            break;
                                        case 2:
                                            Cat cat = managerProduct.create();
                                            managerProduct.add(cat);
                                            break;
                                        case 3:
                                            managerProduct.edit();
                                            break;
                                        case 4:
                                            managerProduct.findIndexById(1);
                                        case 5:
                                            managerProduct.deleteProduct();
                                            break;
                                        case 6:
                                            managerUser.showACC();
                                            break;
                                        case 7:
                                            managerUser.removeAcc();
                                            break;
                                        case 0:
                                            return;
                                    }

                                } catch (Exception e) {
                                    System.out.println("Mời nhập lại");
                                }
                            }

                        } else {
                            System.err.println("Sai tài khoản hoặc mật khẩu, đăng nhập lại");
                        }
                    case 0:
                        return;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
