package MyStack;

/**
 * ClassName: MyStackTest
 * Description:
 * date: 2019-05-28 17:30
 *
 * @author cmc
 */
public class MyStackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.isEmpty());
        System.out.println(ms.pop());
        System.out.println(ms.isEmpty());
        System.out.println(ms.peek());
    }
}
