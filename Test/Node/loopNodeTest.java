package Node;


/**
 * ClassName: loopNodeTest
 * Description:
 * date: 2019-06-16 12:36
 *
 * @author cmc
 */
public class loopNodeTest {
    public static void main(String[] args) {
        loopNode n1 = new loopNode(1);
        loopNode n2 = new loopNode(2);
        loopNode n3 = new loopNode(3);
        loopNode n4 = new loopNode(4);
//        n1.after(n2);
//        System.out.println(n1.next().getData());
//        System.out.println(n2.next().getData());
        n1.after(n2);
        n2.after(n3);
        n3.after(n4);
        System.out.println(n1.next().getData());
        System.out.println(n2.next().getData());
        System.out.println(n3.next().getData());
        System.out.println(n4.next().getData());
    }
}