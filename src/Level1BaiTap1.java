public class Level1BaiTap1 {
    public static void main(String[] args) {
        String str1 = "Cybersoft atitetotU";
        System.out.println("Xóa Nguyên Âm Trong Chuỗi: " + xoaNguyenAmChuoi(str1));

    }

    static String xoaNguyenAmChuoi(String str) {
        /**
         * Xóa Nguyên Âm Trong Chuỗi
         * Mô tả: Viết một hàm để xóa tất cả các nguyên âm (a, e, i, o, u) trong một chuỗi ký tự. Hàm sẽ nhận
         * vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm.
         * Yêu cầu:
         * Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm.
         * Không sử dụng các hàm có sẵn để xóa ký tự.
         * Ví dụ:
         * Input: "Cybersoft"
         * Output: "Cbrsft"
         * Input: "hello"
         * Output: "hll"
         */

        String strNew = str.replaceAll("([aeiouAEIOU])", "");
        return strNew;
    }
}
