package KiemTra_Tim_HienThi;

public class HienThiCacSoNguyenToTu1_toiN {
    public static void main(String[] args) {
        int i;
        int num;
        //Empty String
        StringBuilder primeNumbers = new StringBuilder();
        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến 100 là:");
        System.out.println(primeNumbers);
    }
}

