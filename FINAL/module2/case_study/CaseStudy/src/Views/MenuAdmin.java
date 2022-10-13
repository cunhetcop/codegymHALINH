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

//    public void menuAdmin() {
//        if (managerAdmin.loginAdmin()) {
//            while (true) {
//                String menu= """
//                        *******  ******** *********  ********   ********   ********   ****
//                        *******  ******** *********  ********   ********   ********  *****
//                        **       **    **      ***   **    **   **    **   **       **  **
//                        **       **    **     ***         ***        ***   **   ***     **
//                        **       **    **    ***        ***        ***     **   ***     **
//                        **       **    **   ***        ***        ***      **    **     **
//                        *******  ********  ***       ********   ********   ********   ******
//                        *******  ********  ***       ********   ********   ********   ******
//
//
//                        **    **    **      **       **  **     **  **    **
//                        **    **    **      **       **  ***    **  **    **
//                        **    **   ****     **       **  ****   **  **    **
//                        ********   *  *     **       **  *****  **  ********
//                        ********  ******    **       **  **  *****  ********
//                        **    **  **   **   **       **  **   ****  **    **
//                        **    **  *     *   *******  **  **    ***  **    **
//                        **    ** **     **  *******  **  **     **  **    **
//                        """;
//                System.out.println(menu);
//                System.out.println("╔===================================================╗");
//                System.out.println("║        ▂ ▃ ▅ ▆ █ GIAO DIỆN QUẢN LÝ █ ▆ ▅ ▃ ▂      ║");
//                System.out.println("╠===================================================╣");
//                System.out.println("║[1]. Hiển thị danh sách sản phẩm                   ║");
//                System.out.println("║[2]. Thêm Sản Phẩm                                 ║");
//                System.out.println("║[3]. Sửa Sản Phẩm                                  ║");
//                System.out.println("║[4]. Tìm kiếm Sản Phẩm                             ║");
//                System.out.println("║[5]. Xóa sản phẩm                                  ║");
//                System.out.println("║[6]. Hiển thị danh sách tài khoản                  ║");
//                System.out.println("║[7]. Xóa tài khoản nhân viên theo username         ║");
//                System.out.println("║[8]. Ủy quyền thành tài khoản quản trị             ║");
//                System.out.println("║[9]. Tước quyền quản trị                           ║");
//                System.out.println("║[0]. Thoát                                         ║");
//                System.out.println("╚===================================================╝");
//                System.out.println("Nhập lựa chọn:");
//                try {
//                    int choice1 = Integer.parseInt(sc.nextLine());
//                    if (choice1 < 0 || choice1 > 9) {
//                        System.out.println();
//                        System.err.println("Lựa chọn không tồn tại");
//                    }
//
//                    switch (choice1) {
//                        case 1:
//                            managerProduct.showCat();
//                            break;
//                        case 2:
//                            Cat cat = managerProduct.create();
//                            managerProduct.add(cat);
//                            break;
//                        case 3:
//                            managerProduct.edit();
//                            break;
//                        case 4:
//                            managerProduct.findIndexById(1);
//                            break;
//                        case 5:
//                            managerProduct.deleteProduct();
//                            break;
//                        case 6:
//                            managerUser.showACC();
//                            break;
//                        case 7:
//                            managerUser.removeAcc();
//                            break;
//                        case 8:
//                            managerUser.uyquyenAdmin();
//                            break;
//                        case 9:
//                            managerUser.tuocquyenAdmin();
//                            break;
//                        case 0:
//                            return;
//                    }
//                } catch (Exception e) {
//                    System.err.println("Mời nhập lại");
//                }
//            }
//
//        } else {
//            System.err.println("Sai tài khoản hoặc mật khẩu, đăng nhập lại");
//        }
//    }

    public void menuAdmin() {
        if (managerAdmin.loginAdmin()) {
            while (true) {
                System.out.println("╔===================================================╗");
                System.out.println("║       ▂ ▃ ▅ ▆ █ GIAO DIỆN QUẢN LÝ █ ▆ ▅ ▃ ▂       ║");
                System.out.println("╠===================================================╣");
                System.out.println("║[1]. QUẢN LÝ SẢN PHẨM                              ║");
                System.out.println("║[2]. QUẢN LÝ TÀI KHOẢN                             ║");
                System.out.println("║[0]. THOÁT                                         ║");
                System.out.println("╚===================================================╝");
                try {
                    int choice = Integer.parseInt(sc.nextLine());
                    if (choice < 0 || choice > 2) {
                        System.out.println();
                        System.err.println("Lựa chọn không tồn tại");
                    }

                    switch (choice) {
                        case 1:
                            this.menuQLSP();
                            break;
                        case 2:
                            this.menuQLACCOUNT();
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

    public void menuQLSP() {
        while (true) {
            System.out.println("╔===================================================╗");
            System.out.println("║   ▂ ▃ ▅ ▆ █ GIAO DIỆN QUẢN LÝ SẢN PHẨM █ ▆ ▅ ▃ ▂  ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. Hiển thị danh sách sản phẩm                   ║");
            System.out.println("║[2]. Sắp xếp sản phẩm theo giá từ thấp - cao       ║");
            System.out.println("║[3]. Sắp xếp sản phẩm theo giá từ cao - thấp       ║");
            System.out.println("║[4]. Tìm kiếm Sản Phẩm theo tên                    ║");
            System.out.println("║[5]. Thêm Sản Phẩm                                 ║");
            System.out.println("║[6]. Sửa sản phẩm                                  ║");
            System.out.println("║[7]. Xóa sản phẩm                                  ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 7) {
                    System.out.println();
                    System.err.println("Lựa chọn không tồn tại");
                }

                switch (choice) {
                    case 1:
                        managerProduct.showCat();
                        break;
                    case 2:
                        managerProduct.priceMinToMax();
                        break;
                    case 3:
                        managerProduct.priceMaxToMin();
                        break;
                    case 4:
                        //tìm kiếm sp theo tên
                        managerProduct.timSP();
                        break;
                    case 5:
                        managerProduct.add();
                        break;
                    case 6:
                        managerProduct.edit();
                        break;
                    case 7:
                        managerProduct.deleteProduct();
                        break;
                    case 0:
                        return;
                }
            } catch (Exception e) {
                System.err.println("Mời nhập lại");
            }
        }
    }

    public void menuQLACCOUNT() {
        while (true) {
            System.out.println("╔===================================================╗");
            System.out.println("║  ▂ ▃ ▅ ▆ █ GIAO DIỆN QUẢN LÝ TÀI KHOẢN █ ▆ ▅ ▃ ▂  ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. Hiển thị danh sách tài khoản                  ║");
            System.out.println("║[2]. Xóa tài khoản thành viên theo username        ║");
            System.out.println("║[3]. Ủy quyền thành tài khoản quản trị             ║");
            System.out.println("║[4]. Tước quyền quản trị                           ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");
            try {
                int choice1 = Integer.parseInt(sc.nextLine());
                if (choice1 < 0 || choice1 > 4) {
                    System.out.println();
                    System.err.println("Lựa chọn không tồn tại");
                }
                switch (choice1) {
                    case 1:
                        managerUser.showACC();
                        break;
                    case 2:
                        managerUser.removeAcc();
                        break;
                    case 3:
                        managerUser.uyquyenAdmin();
                        break;
                    case 4:
                        managerUser.tuocquyenAdmin();
                        break;
                    case 0:
                        return;
                }
            } catch (Exception e) {
                System.err.println("Mời nhập lại");
            }
        }
    }
}

