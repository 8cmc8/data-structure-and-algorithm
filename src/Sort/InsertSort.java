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
            //如果当前数字比前一个数小
            if (arr[i] < arr[i-1]) {
                //将当前数字存在临时变量中
                int temp = arr[i];
                int j;
                for (j = i-1; j >= 0 && arr[j] > temp; j--) {
                    //把前一个数字赋给后一个数字
                    arr[j+1] = arr[j];
                }
                //把临时变量赋给不满足循环条件的后一个元素
                arr[j+1] = temp;
            }
        }
    }
}
