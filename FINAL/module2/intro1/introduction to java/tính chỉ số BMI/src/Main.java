import java.util.Scanner;

public class Main {
    public class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cân nặng: ");
            double weight = sc.nextDouble();
            System.out.println("Nhập chiều cao: ");
            double height = sc.nextDouble();
            double BMI = weight / Math.pow(height, 2);
            if (BMI < 18.5) {
                System.out.println("Chỉ số BMI của bạn là: " + BMI + "\n" + "Bạn quá gầy");
            } else if (BMI < 25.0) {
                System.out.println("Chỉ số BMI của bạn là: " + BMI + "\n" + "Bạn hoàn toàn bình thường");
            } else if (BMI < 30.0) {
                System.out.println("Chỉ số BMI của bạn là: " + BMI + "\n" + "Bạn thừa cân");
            } else {
                System.out.println("Chỉ số BMI của bạn là: " + BMI + "\n" + "Bạn béo phì");
            }
        }
    }
}