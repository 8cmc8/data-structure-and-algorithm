package Sort;

import java.util.Arrays;

/**
 * ClassName: ShellSort
 * Description: 希尔排序
 * date: 2019-06-18 22:42
 *
 * @author cmc
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,2,7,8,1,9,0,6,7,4,3,8};
        System.out.println("排序前"+Arrays.toString(arr));
        shellSort(arr);
        System.out.println("排序后"+Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        //记录不同步长的次数
        int t = 1;
        //步长(首个步长取值为数组长度除以2，之后都取值为自身除以2，直至为1)
        for (int gap = arr.length / 2; gap >= 1; gap = gap / 2) {
            //对每个步长，都把相应的数放在同一个组里，进行直接插入排序（注意：此处是轮流排序，并不是把一个组完全排好序后在对下一个组进行排序）
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                for (int j = i; j >= gap && arr[j] < arr[j-gap]; j = j - gap) {
                    arr[j] = arr[j-gap];
                    arr[j-gap] = temp;
                }
            }
            System.out.println("第"+t+"次排序结果"+Arrays.toString(arr));
            t++;
        }
    }
}
