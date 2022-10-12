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
        if (managerAdmin.loginAdmin()) {
            while (true) {
                System.out.println("╔===================================================╗");
                System.out.println("║        ▂ ▃ ▅ ▆ █ GIAO DIỆN QUẢN LÝ █ ▆ ▅ ▃ ▂      ║");
                System.out.println("╠===================================================╣");
                System.out.println("║[1]. Hiển thị danh sách sản phẩm                   ║");
                System.out.println("║[2]. Thêm Sản Phẩm                                 ║");
                System.out.println("║[3]. Sửa Sản Phẩm                                  ║");
                System.out.println("║[4]. Tìm kiếm Sản Phẩm                             ║");
                System.out.println("║[5]. Xóa sản phẩm                                  ║");
                System.out.println("║[6]. Hiển thị danh sách tài khoản                  ║");
                System.out.println("║[7]. Xóa tài khoản nhân viên theo username         ║");
                System.out.println("║[8]. Ủy quyền thành tài khoản quản trị             ║");
                System.out.println("║[9]. Tước quyền quản trị                           ║");
                System.out.println("║[0]. Thoát                                         ║");
                System.out.println("╚===================================================╝");
                System.out.println("Nhập lựa chọn:");
                try {
                    int choice1 = Integer.parseInt(sc.nextLine());
                    if (choice1 < 0 || choice1 > 9) {
                        System.out.println();
                        System.err.println("Lựa chọn không tồn tại");
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
                            break;
                        case 5:
                            managerProduct.deleteProduct();
                            break;
                        case 6:
                            managerUser.showACC();
                            break;
                        case 7:
                            managerUser.removeAcc();
                            break;
                        case 8:
                            managerUser.uyquyenAdmin();
                            break;
                        case 9:
                            managerUser.tuocquyenAdmin();
                            break;
                        case 0:
                            return;
                    }
                } catch (Exception e) {
                    System.err.println("Mời nhập lại");
                }
            }

        } else {
            System.err.println("Sai tài khoản hoặc mật khẩu, đăng nhập lại");
        }
    }
}

