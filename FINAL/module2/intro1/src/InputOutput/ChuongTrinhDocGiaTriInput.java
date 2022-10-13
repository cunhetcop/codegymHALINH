package InputOutput;

import java.util.Scanner;

public class ChuongTrinhDocGiaTriInput {
    public static void main(String[] args) {
        //Khởi tạo đối tượng Scanner để người dùng có thể nhập dữ liệu vào

        //Kiểu chữ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Tên bạn vừa nhập là: " + name);


        //Kiểu số nguyên
        System.out.println("Vui lòng nhập số tuổi: ");
        int num = scanner.nextInt();
        System.out.println("Số tuổi bạn vừa nhập là: " + num);


        //Kiểu số thực float
        System.out.println("Vui lòng nhập số thực bất kì kiểu F: ");
        float rNum = scanner.nextFloat();
        System.out.println("Số thực bạn vừa nhập là: " + rNum);

        //Kiểu số thực double
        System.out.println("Vui lòng nhập số thực bất kì kiểu D: ");
        double rNum2 = scanner.nextDouble();
        System.out.println("Số thực bạn vừa nhập là: " + rNum2);

    }
}
