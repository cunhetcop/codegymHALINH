package lopthuoctinhdoituong.QuanLyPhuongTien;

import java.util.Scanner;

public class Method {
    Scanner scanner = new Scanner(System.in);
    public void menuchinh() {
        System.out.println("====================");
        System.out.println("1. Thêm/Sửa/Xóa phương tiện");
        System.out.println("4. Tìm phương tiện");
        System.out.println("5. Tìm phương tiện theo màu");
    }

    public void dieuChinhPT(){
        int key;
        do {
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Quay lại menu chính");
            key = scanner.nextInt();
            switch (key){
                case 1:
                    System.out.println("Thêm");
//                them();
                    break;
                case 2:
                    System.out.println("Sửa");
//                sua();
                    break;
                case 3:
                    System.out.println("Xóa");
//                xoa();
                    break;
                default:
            }
        } while (key != 4);

    }

    public void timPT(){
        int key;
        do{
            System.out.println("1. Tìm theo hãng");
            System.out.println("2. Tìm theo màu");
            key = scanner.nextInt();
        } while (true);
    }
}
