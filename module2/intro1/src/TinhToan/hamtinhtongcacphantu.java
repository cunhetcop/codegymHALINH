package TinhToan;

public class hamtinhtongcacphantu {
    public static int sum(int[]arr){
        int sum = 0;
        int i;
        for ( i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main ( String[] args){
            int[] arrnew = new int[]{1,2,3,4,5,6,7};
        System.out.println("Tổng của mảng arrnew là: "+sum(arrnew));
    }
}