public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{
                4, 7, 2, 15, 19, 2,1,0
        };

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Só nhỏ nhất trong mảng là: "+ min);
    }
}