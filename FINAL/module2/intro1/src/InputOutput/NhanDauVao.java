package InputOutput;

import java.util.Scanner;

public class NhanDauVao {
    public static void main(String[] args) {
        int num;
        float fnum;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        str = in.nextLine();
        System.out.println("Chuỗi bạn vừa nhập vào là: " + str);
        System.out.println("Nhập vào một số nguyên: ");
        num = in.nextInt();
        System.out.println("Số nguyên bạn vừa nhập vào là: " + num);
        System.out.println("Nhập vào một số thực: ");
        fnum = in.nextFloat();
        System.out.println("Số thực bạn vừa nhập vào là: " + fnum);
    }
}

