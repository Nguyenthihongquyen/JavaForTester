public class Level2BaiTap2 {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println("isPalindrome: " + isPalindrome(str1));
    }

    static boolean isPalindrome(String str){
        /**
         * Kiểm Tra Chuỗi Đối Xứng
         * Mô tả: Viết một hàm kiểm tra xem một chuỗi có phải là chuỗi đối xứng (palindrome) không.
         * Yêu cầu:
         * Hàm nhận vào một chuỗi.
         * Trả về true nếu chuỗi là đối xứng, false nếu không.
         * Ví dụ:
         * Input: "madam"
         * Output: true
         * Input: "hello"
         * Output: false
         */

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Cách khác
//        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//        }