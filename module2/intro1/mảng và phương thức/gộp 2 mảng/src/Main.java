public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10, 11, 12};
        int[] newarr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newarr[j + arr1.length] = arr2[j];

        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}