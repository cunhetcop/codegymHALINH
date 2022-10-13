package Chuoi_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimCacKyTuTrungLap {
    public void timKiem(String str) {
        //Tạo một HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //Chuyển đổi chuỗi thành mảng char
        char[] chars = str.toCharArray();
        //char được chèn dưới dạng khóa và được tính giá trị. Nếu map đã chứa char rồi thì hãy tăng giá trị lên 1.

        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        //lấy key ra
        Set<Character> keys = map.keySet();

        //Hiển thị số lượng ký tự nếu nó là lớn hơn 1. Tất cả các ký tự trùng lặp sẽ có giá trị lớn hơn 1.
        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + "" + map.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        TimCacKyTuTrungLap obj = new TimCacKyTuTrungLap();
        System.out.println("String: Chào các bạn!!!");
        obj.timKiem("Chào các bạn!!!");

        System.out.println("\nString: Bài tập cuối tuần.");
        obj.timKiem("Bài tập về nhà.");

        System.out.println("\nString: !@#$#$%$#%");
        obj.timKiem("!#!#!$");
    }
}
