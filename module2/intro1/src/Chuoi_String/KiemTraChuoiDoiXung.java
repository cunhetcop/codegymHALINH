package Chuoi_String;

import java.util.Scanner;

public class KiemTraChuoiDoiXung {

    //Sử dụng For/While
    public static void main(String[] args) {
        StringBuilder nguocChuoi = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String nhapChuoi = scanner.nextLine();
        int length = nhapChuoi.length();
        for (int i = length - 1; i > 0; i--)
            nguocChuoi.append(nhapChuoi.charAt(i));
        if (nhapChuoi.equals(nguocChuoi.toString()))
            System.out.println("Đây là chuỗi đối xứng! ");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");
    }

    /*
Sử dụng Stack.
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bạn muốn kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String nhapChuoi = scanner.nextLine();
        Stack<Character> stack;
        stack = new Stack<>();
        for (int i = 0; i < nhapChuoi.length(); i++) {
            stack.push(nhapChuoi.charAt(i));
        }
        StringBuilder reverseString = new StringBuilder();
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        if (nhapChuoi.equals(reverseString.toString())) System.out.println("Đây là chuỗi đối xứng.");
        else System.out.println("Đây không phải là chuỗi đối xứng.");
    }
Sử dụng Queue.
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String nhapChuoi = scanner.nextLine();
        LinkedList queue = new LinkedList();
        for (int i = nhapChuoi.length() - 1; i >= 0; i--) {
            queue.add(nhapChuoi.charAt(i));
        }
        String nguocChuoi = "";
        while (!queue.isEmpty()) {
            nguocChuoi = nguocChuoi + queue.remove();
        }
        if (nhapChuoi.equals(nguocChuoi))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
*/

}
