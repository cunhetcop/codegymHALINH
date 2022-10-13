public class Main {
    public static void main(String[] args) {
//     for (int i=1; i <=5; i++){
//         for(int j = i; j <= 5; j++){
//             System.out.print("*");
//         }  System.out.println("");
//        }
//        hiển thị ra:
//        *****
//        ****
//        ***
//        **
//        *
//

//        for (int i=1; i <=5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }  System.out.println("");
//        }
//        hiển thị ra:
//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 8; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 6 ; i++){
            for (int j = 0; j < i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < 6 ; i++){
            for (int j = 6; j > i ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}