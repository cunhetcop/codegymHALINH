import java.util.Arrays;

public class nhap1 {
    public static void main(String[] args) {
        //    xóa 1 phần từ tại vị trí index trong mảng
        int[] arr = new int[]{1, 2, 3, 4};
        int index = 2;
        int[] newarr = new int[arr.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            if(i<2){
                newarr[i]=arr[i];
            } else {
                newarr[i] = arr[i+1];
            }

        }
        System.out.println(Arrays.toString(newarr));
    }
}
