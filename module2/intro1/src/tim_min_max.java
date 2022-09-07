public class tim_min_max {
    public static void main(String[] args) {
//        int[] array = new int[]{
//                4, 7, 2, 15, 19, 2,1,0
//        };
//
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Só nhỏ nhất trong mảng là: "+ min);

        int[]array = {9,2,3,10,15,21,7};

        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("số lơn nhất là: " +max);
    }
}
