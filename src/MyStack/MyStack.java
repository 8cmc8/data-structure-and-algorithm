package MyStack;

/**
 * ClassName: MyStack
 * Description:
 * date: 2019-05-28 17:08
 *
 * @author cmc
 */
public class MyStack {
    // 底层数组实现
    int[] elements;
    //构造函数
    public MyStack() {
        //初始化数组长度为零
        elements = new int[0];
    }
    //元素入栈
    public void push(int element) {
        //创建一个长度多一位的数组
        int[] newArray = new int[elements.length + 1];
        //将原数组赋值给新数组，新数组最后一位为0
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        //将要入栈的元素放入新数组最后一位
        newArray[elements.length] = element;
        //重新赋值
        elements = newArray;
    }
    //元素出栈
    public int pop() {
        //若栈为空，抛异常
        if (elements.length == 0) {
            throw new RuntimeException("Stack is empty!");
        }
        //获取栈顶元素
        int element = elements[elements.length - 1];
        //弹出栈顶元素
        //创建一个长度少一位的数组
        int[] newArray = new int[elements.length - 1];
        //将原数组除最后一位赋值给新数组
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i];
        }
        //重新赋值
        elements = newArray;
        //返回栈顶元素
        return element;
    }
    //查看栈顶元素
    public int peek() {
        //若栈为空，抛异常
        if (elements.length == 0) {
            throw new RuntimeException("Stack is empty!");
        }
        //返回栈顶元素
        return elements[elements.length - 1];
    }
    //判断栈是否为空
    public boolean isEmpty() {
        return elements.length == 0 ? true : false;
    }
}
