public class Level1BaiTap3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        int n3 = 1;
        int n4 = 2;
        int n5 = 3;

        System.out.println("Tổng của tất cả các số chẵn từ 0 đến n là: " + sumOfEven(n1));

    }
    static int sumOfEven(int n){
        /**
         * Tính Tổng Các Số Chẵn
         * Mô tả: Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước.
         * Yêu cầu:
         * Hàm nhận vào một số nguyên dương n.
         * Trả về tổng của tất cả các số chẵn từ 0 đến n.
         * Ví dụ:
         * Input: 10
         * Output: 30
         * Input: 5
         * Output: 6
         */
        int sum = 0;

        for (int i = 2; i <= n; i++){
            if (i%2 == 0){
                sum +=i ;
            }
        }

        int result = sum;
        return result;
    }

}
