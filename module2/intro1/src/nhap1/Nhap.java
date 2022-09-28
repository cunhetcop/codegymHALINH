package nhap1;

import java.util.Arrays;

public class Nhap {
    public static void main(String[] args) {
        int[] list = new int[]{5,2,4,6,1,3};
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(list));
    }

}
