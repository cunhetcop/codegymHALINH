package Views;

import managers.ManagerAdmin;
import managers.ManagerProduct;
import managers.ManagerUser;

import java.util.Scanner;

public class MenuUser {
    Scanner sc = new Scanner(System.in);
    ManagerUser managerUser = new ManagerUser();

    MenuAdmin menuAdmin = new MenuAdmin();

    ManagerProduct managerProduct = new ManagerProduct();

    public void menuUser() {
        if (managerUser.login()) {
            System.out.println("Đăng nhập thành công");
            while (true) {
                System.out.println("╔===================================================╗");
                System.out.println("║       ▂ ▃ ▅ ▆ █ GIAO DIỆN NGƯỜI DÙNG █ ▆ ▅ ▃ ▂    ║");
                System.out.println("╠===================================================╣");
                System.out.println("║[1]. Hiển thị danh sách sản phẩm                   ║");
                System.out.println("║[2]. Thêm Sản Phẩm                                 ║");
                System.out.println("║[3]. Xóa Sản Phẩm                                  ║");
                System.out.println("║[4]. Hiển thị sản phẩm và tổng tiền                ║");
                System.out.println("║[0]. Thoát                                         ║");
                System.out.println("║                                                   ║");
                System.out.println("╚===================================================╝");
                System.out.println("Nhập lựa chọn:");
                try {
                    int choice1 = Integer.parseInt(sc.nextLine());
                    if (choice1 < 0 || choice1 > 5) {
                        System.out.println();
                        System.out.println("Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                    }

                    switch (choice1) {
                        case 1:
                            managerProduct.showCat();
                            break;
                        case 2:
                            managerUser.buyProduct();
                            break;
                        case 3:
                            menuAdmin.menuAdmin();
                            break;
                        case 4:
                            managerUser.showGioHang();
                            break;
                        case 0:
                            return;
                    }
                } catch (Exception e) {
                    System.err.println("Nhập lại !!!");

                }

            }

        } else {
            System.err.println("Tài khoản không tồn tại");
        }
    }
}