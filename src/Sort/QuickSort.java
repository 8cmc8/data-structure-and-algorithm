package Sort;

import java.util.Arrays;

/**
 * ClassName: QuickSort
 * Description: 快速排序
 * date: 2019-06-17 10:11
 *
 * @author cmc
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {4,3,5,1,6,7,9,0,5,4,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr 待排序数组
     * @param start 起始下标
     * @param end 结束下标
     */
    public static void quickSort(int[] arr,int start,int end) {
        //起始下标小于结束下标
        if (start < end) {
            //把数组的第一个数作为标准数
            int stand = arr[start];
            //左边数的下标
            int low = start;
            //右边数的下标
            int high = end;
            //循环找比标准数大的数和比标准数小的数
            while (low < high) {
                //右边的数比标准数大
                while (low < high && stand <= arr[high]) {  //循环内部可能出现low > high的结果，不能保证最后low和high相同，此处必须加low < high的条件
                    //下标左移
                    high--;
                }
                //右边的数比标准数小，用右边的数替换左边的数
                arr[low] = arr[high];
                //左边的数比标准数小
                while (low < high && arr[low] <= stand) {   //同上
                    //下标右移
                    low++;
                }
                //左边的数比标准数大，用左边的数替换右边的数
                arr[high] = arr[low];
            }
            //把标准数赋值到low和high的重合位置
            arr[low] = stand;
            //递归处理所有小于标准数的数字
            quickSort(arr,start,low - 1);
            //递归处理所有大于标准数的数字
            quickSort(arr,low + 1,end);
        }
    }
}
