import java.util.Arrays;

public class dao_nguoc_mang {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));
        int i;
        int j;

        for (i = 0, j = arr.length -1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (i =0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}