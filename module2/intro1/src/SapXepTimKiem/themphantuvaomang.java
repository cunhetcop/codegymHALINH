package SapXepTimKiem;

import java.util.Arrays;

public class themphantuvaomang {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, -4, 22, 63, -42};
        int index = 2;
        int value = 10;
        int[] newArr = new int[arr.length + 1];
        int j = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (i == index) {
                newArr[index] = value;
                ++j;
            }

            newArr[j] = arr[i];
            ++j;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
