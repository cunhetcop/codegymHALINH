package TinhToan;

import java.util.Scanner;
public class TinhLaiSuat {
    public static void main(String[] args) {
        float tienGoc, laiXuat, thoiGian, soTienLai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi vào ngân hàng: ");
        tienGoc = scanner.nextFloat();
        System.out.println("Nhập vào lãi xuất hàng năm(%): ");
        laiXuat = scanner.nextFloat();
        System.out.println("Nhập vào thời gian gửi(tính bằng năm): ");
        thoiGian = scanner.nextFloat();
        scanner.close();
        soTienLai = (tienGoc * laiXuat * thoiGian)/100;
        System.out.println("Số tiền lãi bạn nhận được là: "+soTienLai);
    }
}