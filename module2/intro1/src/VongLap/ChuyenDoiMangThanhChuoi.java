package VongLap;

public class ChuyenDoiMangThanhChuoi {
    public static void main(String[] args) {
        char[] chars = {'c', 'h', 'à', 'o', ' ', 'L', 'u', 'ậ', 'n'};
        //cách 1
        String str = new String(chars);
        System.out.println(str);

        //cách 2
        String str2 = String.valueOf(chars);
        System.out.println(str2);
    }
}