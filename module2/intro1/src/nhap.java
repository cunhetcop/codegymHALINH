import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        int count = 0;
        int i;
        int j;

        for (i = 2; i <=1000000 ; i++){
            boolean check = true;
            if(count == 20){
                break;
            }
            for (j = 2; j < i; j++){
                if (i%j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(i);
                count++;
            }

        }

    }
}