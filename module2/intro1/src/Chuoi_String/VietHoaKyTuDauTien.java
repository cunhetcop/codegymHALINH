package Chuoi_String;

public class VietHoaKyTuDauTien {
    public static void main(String[] args) {
        String name = "luanlieulinh";
        System.out.println("\n\nChuỗi ban đầu: " + name);
        //tạo hai chuỗi con firrsLetter và remainingLetters
        String firstLetter = name.substring(0, 1);
        //chuỗi remainingLetters chứa phần còn lại của name
        String remainingLetters = name.substring(1);

        //sử dụng phương thức toUpperCase() để chuyển dổi firstLetter thành chữ in hoa
        firstLetter = firstLetter.toUpperCase();

        //sau khi chuyển đổi thì gộp chúng lại
        name = firstLetter + remainingLetters;
        System.out.println("chuỗi sau khi thay đổi: " + name);
    }
}
