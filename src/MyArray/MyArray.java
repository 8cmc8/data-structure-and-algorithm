package MyArray;


import java.util.Arrays;

/**
 * ClassName: MyArray <br/>
 * Description: <br/>
 * date: 2019-05-06 00:38<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class MyArray {

    private int[] array;

    public MyArray() {
        //初始化数组长度为0
        array = new int[0];
    }
    //输出数组到控制台
    public void show() {
        System.out.println(Arrays.toString(array));
    }
    //增加i到数组末尾
    public int[] add(int element) {
        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[array.length] = element;
        array = newArr;
        return array;
    }
    //增加i到第index+1个位置
    public int[] add(int element,int index) {
        if(index < 0 || index > array.length){
            throw new RuntimeException("数组下标越界,index参数请输入"+0+"到"+ (array.length));
        }
        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = array[i];
            }
            if(i == index) {
                newArr[i] = element;
            }
            if(i > index) {
                newArr[i] = array[i-1];
            }
        }
        array = newArr;
        return array;
    }
    //根据下标删除
    public int[] delete(int index) {
        if(index < 0 || index > array.length-1){
            throw new RuntimeException("数组下标越界,参数请输入"+0+"到"+ (array.length-1));
        }
        int[] newArr = new int[array.length-1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArr[i] = array[i];
            }
            if (i > index) {
                newArr[i-1] = array[i];
            }
        }
        array = newArr;
        return array;
    }
    //根据下标修改元素
    public int[] update(int element,int index) {
        array[index] = element;
        return array;
    }
    //查找元素(针对不重复数组)
    //顺序查找
    public int search(int element) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }
    //二分法查找（适用于正序数组）
    public int binarySearch(int element) {
        int index = -1;
        int begin = 0;
        int end = array.length - 1;
        int mid = (begin + end)/2;
        while(true) {
            if(begin > end) {
                break;
            }
            if (element < array[mid]) {
                end = mid - 1;
            }
            if (element == array[mid]) {
                return index = mid;
            }
            if (element > array[mid]) {
                begin = mid + 1;
            }
            mid = (begin + end)/2;
        }
        return index;
    }
    public int[] clear() {
        array = new int[0];
        return array;
    }
    public int[] init() {
        array = new int[]{1,2,3,4,5,6,7,8,9,10};
        return array;
    }
}
