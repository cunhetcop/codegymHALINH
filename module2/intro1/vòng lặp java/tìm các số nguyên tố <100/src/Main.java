public class Main {
    public static void main(String[] args) {
        int i;
        int j;
        for(i =2; i<100;i++){
            boolean check = true;

            for (j=2; j<i; j++){
                if (i%j==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(i);
            }
        }
    }
}