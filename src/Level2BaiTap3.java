import java.util.LinkedHashSet;
import java.util.Set;

public class Level2BaiTap3 {
    public static void main(String[] args) {
        String str1 = "programming"; // progamin
        String str2 = "abca"; // abc
        String str3 = "Xin chào các bạn"; // Xin chàoábạ

        System.out.println("chuỗi mới không chứa ký tự lặp lại: " + removeDuplicateCharacters(str1) );
    }
    static String removeDuplicateCharacters(String str){
        /**
         * Xóa Ký Tự Lặp Lại Trong Chuỗi
         * Mô tả: Viết một hàm xóa các ký tự lặp lại trong chuỗi, chỉ giữ lại ký tự xuất hiện đầu tiên của mỗi loại
         * Yêu cầu:
         * Hàm nhận vào một chuỗi và trả về chuỗi mới không chứa ký tự lặp lại.
         * Ví dụ:
         * Input: "programming"
         * Output: "progamin"
         * Input: "abca"
         * Output: "abc"
         */

        Set<Character> seen = new LinkedHashSet<>(); // linkedHashSet để lưu các ký tự không trùng lặp
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) { // thêm ký tự vào Set; nếu đã tồn tại, không thêm
                result.append(ch);
            }
        }

        return result.toString();
    }
}
