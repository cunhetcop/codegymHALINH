package Chuoi_String;

import java.util.Scanner;

public class ChuyenChuHoaThanhChuThuong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi chữ hoa cần chuyển đổi in thường: ");
        message= scanner.nextLine();

        char[] charArray =message.toCharArray();
        for(int i=0; i< charArray.length;i++){
            if(charArray[i]>= 65&& charArray[i]<=90){
                charArray[i] +=32;
            }
        }
        //chuyển đổi mảng char thành string
        message=String.valueOf(charArray);
        System.out.println("Chuỗi chữ hoa sau khi đổi: \n"+ message);
    }
}
