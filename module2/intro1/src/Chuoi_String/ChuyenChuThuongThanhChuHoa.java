package Chuoi_String;

import java.util.Scanner;

public class ChuyenChuThuongThanhChuHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập chuỗi cần in hoa: ");
        message = scanner.nextLine();
        //khai báo một mảng rồi sử dụng phương thức toCharArray()
        //để chuyển dổi message thảnh một kiểu mảng char
        char[] charArray = message.toCharArray();
        //sử dụng vòng lặp để duyệt các phần tử trong mảng charArray
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        //chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi thanh đổi: \n" + message);
    }
}

