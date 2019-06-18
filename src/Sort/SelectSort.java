package Sort;

import java.util.Arrays;

/**
 * ClassName: SelectSort
 * Description: 选择排序
 * date: 2019-06-18 23:25
 *
 * @author cmc
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,1,7,3,9,6,8,2,0};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //遍历所有的数
        for (int i = 0; i < arr.length; i++) {
            //记录最小数的下标
            int minIndex = i;
            //把当前遍历的数和后面所有的数依次进行比较
            for (int j = i+1; j < arr.length; j++) {
                //如果后面比较的数比记录的最小的数小
                if (arr[minIndex] > arr[j]) {
                    //把较小数的下标赋值给minIndex
                    minIndex = j;
                }
            }
            //如果最小数的下标和当前遍历的数的下标不一致，说明下标为minIndex的数比当前遍历的数更小
            if (minIndex != i) {
                //交换
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
