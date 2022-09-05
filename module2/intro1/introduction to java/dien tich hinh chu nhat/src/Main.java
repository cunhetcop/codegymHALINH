import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int width;
        int height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        width = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        height = sc.nextInt();
        int area = width*height;
        System.out.println("Diện tich hình chữ nhật là: " + area);
    }
}