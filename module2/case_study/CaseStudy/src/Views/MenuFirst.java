package Views;

import java.util.Scanner;

public class MenuFirst {
    Scanner sc = new Scanner(System.in);
    MenuAdmin menuAdmin = new MenuAdmin();
    MenuUser menuUser = new MenuUser();

    public void menufirst() {

        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("╔===================================================╗");
            System.out.println("║              CHỌN VAI TRÒ ĐĂNG NHẬP               ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. ADMIN                                         ║");
            System.out.println("║[2]. KHÁCH HÀNG                                    ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menuAdmin.menuAdmin();
                    break;
                case 2:
                    menuUser.menuUser();
                    break;
            }

        } while (true);
    }
}
