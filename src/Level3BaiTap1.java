import java.util.Arrays;

public class Level3BaiTap1 {
    public static void main(String[] args) {
        int[] numbers1 = {2,7,11,15};
        int target = 18;

        System.out.println(Arrays.toString(finđIndexSumTarget(numbers1, target)));

    }
    static int[] finđIndexSumTarget(int[] numbers, int target){
        /**
         * Two Sum II - Input Array Is Sorted
         * Mô tả: Cho một mảng đã được sắp xếp tăng dần và một số nguyên target, hãy tìm hai số trong
         * mảng có tổng bằng target và trả về chỉ số (index) của chúng (bắt đầu từ 1).
         * Ví dụ:
         * Input: numbers = [2,7,11,15], target = 9
         * Output: [1,2]
         */

        int left = 0;
        int right = numbers.length - 1;

        System.out.println(Arrays.toString(numbers));

        while (left < right) {
//            System.out.println("left " +left + " right " + right);

            int sum = numbers[left] + numbers[right];
//            System.out.println("sum: " + sum);
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Trả về chỉ số bắt đầu từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Nếu không tìm thấy cặp số nào
    }


}
