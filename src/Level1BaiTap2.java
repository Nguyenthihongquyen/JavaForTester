import java.util.Arrays;
import java.util.Collections;

public class Level1BaiTap2 {
    public static void main(String[] args) {
        int[] numbers1 = {10, 5, 6, 10};
        int[] numbers2 = {1, 3, 4, 5, 0, 2};
        int[] numbers3 = {2};

        System.out.println("Mảng: " + Arrays.toString(numbers1));
        System.out.println("Giá trị lớn thứ hai trong mảng là: " + findSecondLargestInArray(numbers1));
    }

    public static int findSecondLargestInArray(int[] numbers){
        /**
         * Tìm Giá Trị Lớn Thứ Hai Trong Mảng
         * Mô tả: Viết một hàm để tìm giá trị lớn thứ hai trong một mảng số nguyên. Hàm sẽ nhận vào một
         * mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
         * Yêu cầu:
         * Hàm sẽ nhận vào một mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
         * Nếu mảng có ít hơn hai phần tử, trả về một giá trị đặc biệt (ví dụ: Integer.MIN_VALUE).
         * Ví dụ:
         * Input: [1, 3, 4, 5, 0, 2]
         * Output: 4
         * Input: [10, 5, 10]
         * Output: 5
         * Input: [3]
         * Output: Integer.MIN_VALUE
         */
        if (numbers.length <2){
            return Integer.MIN_VALUE;
        }

        Integer[] sortedNumbers = Arrays.stream(numbers)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(sortedNumbers, Collections.reverseOrder());

        int[] sortedNumbersDesc = Arrays.stream(sortedNumbers)
                .mapToInt(Integer::intValue)
                .toArray();

        int size = sortedNumbers.length;
        int secondLargest = sortedNumbersDesc[0];

        for(int i = 1; i < size; i++){
            if(secondLargest > sortedNumbers[i] ){
                secondLargest = sortedNumbers[i];
                break;
            }
        }

        return secondLargest;
    }
}

//        int[] sortedNumbers = Arrays.parallelSort(numbers); // tương tự như Arrays.sort(), nhưng thực thi song song trên nhiều luồng để tăng tốc độ sắp xếp.
