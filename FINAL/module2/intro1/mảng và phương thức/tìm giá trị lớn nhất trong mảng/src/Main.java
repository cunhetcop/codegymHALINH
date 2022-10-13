public class Main {
    public static void main(String[] args) {
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