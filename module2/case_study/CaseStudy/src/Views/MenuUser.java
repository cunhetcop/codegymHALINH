package Views;

import managers.ManagerUser;

import java.util.Scanner;

public class MenuUser {
    public void menuUser() {
        Scanner sc = new Scanner(System.in);
        ManagerUser managerUser = new ManagerUser();
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("╔===================================================╗");
            System.out.println("║   ▂ ▃ ▅ ▆ █ WELCOME TO KIMCHI CATTERY █ ▆ ▅ ▃ ▂   ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. Đăng nhập                                     ║");
            System.out.println("║[2]. Đăng ký                                       ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 2) {
                    System.out.println();
                    System.out.println("⛔ Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                }
                switch (choice) {
                    case 1:
                        if (managerUser.login()) {
                            System.out.println("Đăng nhập thành công");
                        } else{
                            System.out.println("Không có tài khoản");
                        return;
                }
                        while (true) {
                            System.out.println("╔===================================================╗");
                            System.out.println("║    ▂ ▃ ▅ ▆ █ WELCOME TO KIMCHI CATTERY █ ▆ ▅ ▃ ▂  ║");
                            System.out.println("╠===================================================╣");
                            System.out.println("║[1]. Hiển thị danh sách sản phẩm                   ║");
                            System.out.println("║[2]. Thêm Sản Phẩm                                 ║");
                            System.out.println("║[3]. Xóa Sản Phẩm                                  ║");
                            System.out.println("║[4]. Hiển thị sản phẩm và tổng tiền                ║");
                            System.out.println("║[5]. Thoát                                         ║");
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
                                        managerUser.showProduct();
                                        break;
                                    case 2:
                                        managerUser.buyProduct();
                                        break;
                                    case 3:
                                        managerUser.removeProduct();
                                        break;
                                    case 4:
                                        managerUser.showGioHang();
                                        break;
                                    case 5:
                                        return;
                                }
                            } catch (Exception e) {
                                System.err.println("⛔ Bạn nhập sai dữ liệu, mời nhập lại !!!");

                            }

                        }

                    case 2:
                        managerUser.register();
                        break;
                    case 0:
                        return;
                }

            } catch (Exception e) {
                System.err.println("⛔ Bạn nhập sai dữ liệu, mời nhập lại !!!");
                menuUser();
            }

        }
    }
}