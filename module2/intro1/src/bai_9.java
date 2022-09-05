import java.util.Scanner;

public class bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int a = scanner.nextInt();
        String name = "";
        switch (a) {
            case 0:
                name = "zero";
                break;
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "three";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "five";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;
            case 10:
                name = "ten";
                break;
            case 11:
                name = "Eleven";
                break;
            case 12:
                name = "Twelve";
                break;
            case 13:
                name = " Thirteen";
                break;
            case 20:
                name = "Twenty";

        }
        if (0 <= a && a < 14) {
            System.out.println(name);
        } else if (a == 20) {
            System.out.println(name);
        } else if (14 <= a && a < 20) {
            System.out.println(name + "teen");
        } else if (20 < a && a < 100) {
            int b = a / 10;
            int c = a % 10;
            String name_1 = "";
            String name_2 = "";
            switch (b) {
                case 2:
                    name_1 = "Twenty";
                    break;
                case 3:
                    name_1 = "thirty";
                    break;
                case 4:
                    name_1 = "forty";
                    break;
                case 5:
                    name_1 = "fifty";
                    break;
                case 6:
                    name_1 = "sixty";
                    break;
                case 7:
                    name_1 = "seventy";
                    break;
                case 8:
                    name_1 = "eighty";
                    break;
                case 9:
                    name_1 = "ninety";
                    break;
            }
            switch (c) {
                case 1:
                    name_2 = "one";
                    break;
                case 2:
                    name_2 = "two";
                    break;
                case 3:
                    name_2 = "three";
                    break;
                case 4:
                    name_2 = "four";
                    break;
                case 5:
                    name_2 = "five";
                    break;
                case 6:
                    name_2 = "six";
                    break;
                case 7:
                    name_2 = "seven";
                    break;
                case 8:
                    name_2 = "eight";
                    break;
                case 9:
                    name_2 = "nine";
                    break;
            }
            System.out.println(name_1 + " " + name_2);

        }
    }

}