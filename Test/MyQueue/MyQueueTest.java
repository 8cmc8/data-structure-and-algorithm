package MyQueue;

/**
 * ClassName: MyQueueTest
 * Description:
 * date: 2019-05-28 18:07
 *
 * @author cmc
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.add(1);
        mq.add(2);
        mq.add(3);
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());

    }
}
