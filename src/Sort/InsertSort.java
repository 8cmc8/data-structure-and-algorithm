package Sort;

import java.util.Arrays;

/**
 * ClassName: InsertSort
 * Description: 直接插入排序（认为前面的数都是有序的）
 * date: 2019-06-17 22:55
 *
 * @author cmc
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,3,4,8,6,9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        //从数组的第二个数开始遍历所有数
        for (int i = 1; i < arr.length; i++) {
            //将要比较的数赋值给临时变量
            int temp = arr[i];
            //依次和有序数做比较
            for (int j = i; j > 0; j--) {
                //小于前一个数，则交换位置
                if (arr[j] < arr[j-1]) {
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
