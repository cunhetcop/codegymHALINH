import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào số từ 1-999: ");
        int number = in.nextInt();
        if (number < 1 || number > 999) {
            System.out.println("vui lòng nhập số từ 1-999");
        } else {
            int u = number % 10;//số cuối
            int tt = number / 10;
            int t = tt % 10;//số hàng chục
            int h = number / 100;//số hàng trăm
            String uw[] = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};
            String tw[] = {" ", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String hw = " Hundred ";
            if (number < 20)// từ 1-19
                System.out.println(uw[number]);
            else if (number < 100)// từ 20 - 99
                System.out.println(tw[t] + " " + uw[u]);
            else // từ 100 đến 999
                System.out.println(uw[h] + hw + tw[t] + " " + uw[u]);
        }
    }
}
