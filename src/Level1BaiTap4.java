public class Level1BaiTap4 {
    public static void main(String[] args) {
        String str1 = "Xin chào các bạn";
        String str2 = "Hello World";
        String str3 = "X 2";
        String str4 = "X 2     3   "; // cách 5 khoản trắng

        System.out.println("Số từ trong chuỗi là: " + countWordsInString(str4));
    }

    static int countWordsInString(String str){
        /**
         * Đếm số từ trong một chuỗi
         * Mô tả: Viết một hàm đếm số từ trong một chuỗi.
         * Yêu cầu:
         * Hàm nhận vào một chuỗi.
         * Trả về số từ trong chuỗi.
         * Ví dụ:
         * Input: "Xin chào các bạn"
         * Output: 4
         * Input: "Hello World"
         * Output: 2
         */

        String[] words = str.replaceAll("  ", "").split(" ");
//        System.out.println(Arrays.toString(words));

        int result = words.length;
        return result;
    }
}
