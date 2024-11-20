import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Level2BaiTap1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long income = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Nhập thu nhập hàng năm: ");
            try {
//                income = input.nextInt();
                income = input.nextLong();
                if (income > 0) {

                    NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
                    String formattedIncome = formatter.format(income);

                    System.out.println("Thu nhập hàng năm của bạn là: " + formattedIncome + " VNĐ");
                    validInput = true;
                } else {
                    System.out.println("Lỗi: Vui lòng nhập một số nguyên dương.");
                    System.out.println("______");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên.");
                System.out.println("______");
                input.next(); // Xóa bỏ đầu vào không hợp lệ
            }
        }

        input.close();

        System.out.println("---> số thuế phải trả là: " + calculateIncomeTax(income) + " %");

        long incomeTaxToMoney =  income * calculateIncomeTax(income) /100 ;
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        String formatIncomeTaxToMoney = formatter.format(incomeTaxToMoney);

        System.out.println("Tính ra tiền : " + formatIncomeTaxToMoney  + " VNĐ");


    }
    static int calculateIncomeTax(long income){
        /**
         * Mô tả: Viết một chương trình Java tính thuế thu nhập cá nhân dựa trên mức thu nhập hàng năm của
         * một người. Chương trình sẽ yêu cầu người dùng nhập thu nhập hàng năm và sau đó tính thuế dựa
         * trên các mức thuế sau:
         * 1.Thu nhập từ 0 đến 5 triệu đồng: 5%
         * 2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
         * 3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
         * 4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
         * 5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
         * 6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
         * 7.Thu nhập trên 80 triệu đồng: 35%
         * Yêu cầu:
         * 1.Nhập thu nhập hàng năm từ người dùng.
         * 2.Tính số thuế phải trả theo từng mức thuế suất.
         * 3.Xuất số thuế phải trả.
         */
        int MILION = 1000000; // 1 triệu
        int result = 0;

        if (income > 0 && income <= (5*MILION)){
//            Thu nhập từ 0 đến 5 triệu đồng: 5%
            return 5 ;
        }else if (income> 5*MILION && income <=10 * MILION ){
//            Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
            return 10;
        }else if (income > 10*MILION && income <=18 * MILION ){
//            Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
            return 15;
        }else if (income> 18*MILION && income <=32 * MILION ){
//            Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
            return 20;
        }else if (income > 32*MILION && income <=52 * MILION ){
//            Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
            return 25;
        }else if (income > 52*MILION && income <=80 * MILION ){
//            Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
            return 30;
        }else if (income > 80*MILION){
//            Thu nhập trên 80 triệu đồng: 35%
            return 35;
        }

        return result;
    }

}
