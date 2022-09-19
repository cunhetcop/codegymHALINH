package nhap1;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] ArrA = new int[]{10,15};
        int[] ArrB = ArrA;
        ArrB = new int[]{10, 15, 20};
        System.out.println(Arrays.toString(ArrA));

    }
}