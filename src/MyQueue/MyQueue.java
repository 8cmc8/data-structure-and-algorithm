package MyQueue;

import MyStack.MyStack;

/**
 * ClassName: MyQueue
 * Description:
 * date: 2019-05-28 17:56
 *
 * @author cmc
 */
public class MyQueue {
    //底层数组实现
    int[] elements;
    //构造函数
    public MyQueue() {
        //初始化数组长度为零
        elements = new int[0];
    }
    //入队
    public void add(int element) {
        //创建一个长度多一位的数组
        int[] newArray = new int[elements.length + 1];
        //将原数组赋值给新数组，新数组最后一位为0
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        //将要入队的元素放入新数组最后一位
        newArray[elements.length] = element;
        //重新赋值
        elements = newArray;
    }
    //出队
    public int poll() {
        //队列为空，抛异常
        if(elements.length == 0) {
            throw new RuntimeException("Queue is empty!");
        }
        //获取队头元素
        int element = elements[0];
        //创建数组长度少一位的新数组
        int[] newArray = new int[elements.length - 1];
        //将原数组除队头外的数据赋值给新数组
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i+1];
        }
        //重新赋值
        elements = newArray;
        //返回队头元素
        return element;
    }
    //判断队列是否为空
    public boolean isEmpty() {
        return elements.length == 0 ? true : false;
    }
}
