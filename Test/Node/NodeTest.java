package Node;


/**
 * ClassName: NodeTest
 * Description:
 * date: 2019-06-16 11:43
 *
 * @author cmc
 */
public class NodeTest {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        System.out.println(n1.append(n2).append(n3).append(new Node(4))==n1);
//        n1.show();
//        n1.next().removeNext();
//        n1.show();
        n1.show();
        Node n5 = new Node(5);
        n1.next().after(n5);
        n1.show();
    }
}