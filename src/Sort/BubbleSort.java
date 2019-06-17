package Sort;

import java.util.Arrays;

/**
 * ClassName: BubbleSort
 * Description: 冒泡排序
 * date: 2019-06-16 21:17
 *
 * @author cmc
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {7,6,4,3,2,1,5,8,3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
