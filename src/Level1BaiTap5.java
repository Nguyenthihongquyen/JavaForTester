import java.util.ArrayList;
import java.util.Arrays;

public class Level1BaiTap5 {
    public static void main(String[] args) {
        String str1 = "Xin chào các bạn";
        String str2 = "Hello World";
        String str3 = "X 2";
        String str4 = "X 2     3   ";

        System.out.println("chữ cái đầu của mỗi từ là: " + printInitials(str1));
    }
    static String printInitials(String str){
        /**
         * In Chữ Cái Đầu Của Mỗi Từ
         * Mô tả: Viết một hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi.
         * Yêu cầu:
         * Hàm nhận vào một chuỗi.
         * Trả về chuỗi chứa các chữ cái đầu của mỗi từ.
         * Ví dụ:
         * Input: "Xin chào các bạn"
         * Output: "X C C B"
         * Input: "Hello World"
         * Output: "H W"
         */

        String[] words = str.replaceAll("  ", "").split(" ");
        System.out.println(Arrays.toString(words));

        ArrayList<String> newWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++){

            String letter = words[i].substring(0,1);
            newWords.add(letter);
//            System.out.println("newWords: " + newWords);
        }

        StringBuffer sb = new StringBuffer(); // tạo một đối tượng StringBuffer rỗng để xây dựng chuỗi kết quả
        for (String s : newWords) {
            sb.append(s);
            sb.append(" ");
        }

        String result = sb.toString().toUpperCase();

        return result;
    }


}
