package Chuoi_String;

public class ChuyenDoiCharSangString {
    public static void main(String[] args) {
        //Sử dụng phương thức toString().
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("Chuỗi là: " + str);
        //Sử dụng phương thức valueOf().
        String str2 = String.valueOf(ch);
        System.out.println("Chuỗi là: " + str2);
    }
}