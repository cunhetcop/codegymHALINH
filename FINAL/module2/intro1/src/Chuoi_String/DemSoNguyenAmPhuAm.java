package Chuoi_String;

public class DemSoNguyenAmPhuAm {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        int nguyenAm = 0, phuAm = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                nguyenAm++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                phuAm++;
            }
        }
        System.out.println("Số nguyên âm: " + nguyenAm);
        System.out.println("Số phụ âm: " + phuAm);
    }
}
