package Node;

/**
 * ClassName: Node
 * Description:
 * date: 2019-06-16 10:59
 *
 * @author cmc
 */
public class Node {
    //结点存储的数据
    int data;
    //下一个结点的引用
    Node next;
    //构造方法（给结点赋值）
    public Node(int data) {
        this.data = data;
    }
    //追加结点（可以连续）
    public Node append(Node node) {
        //获取当前结点
        Node currentNode = this;
        while (true) {
            //取出下一个结点
            Node nextNode = currentNode.next;
            //如果下一个结点为null
            if (nextNode==null) {
                break;
            }
            //赋值给当前结点
            currentNode = nextNode;
        }
        //追加结点
        currentNode.next = node;
        //返回头结点
        return this;
    }
    //显示所有结点数据
    public void show() {
        //获取当前结点
        Node currentNode = this;
        do{
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        while (currentNode!=null);
        System.out.println();
    }
    //删除下一个结点
    public void removeNext() {
        //获取下下个结点
        Node newNode = next.next;
        //把下下个结点赋给下个结点
        this.next = newNode;
    }
    //插入结点
    public void after(Node node) {
        //获取下个结点，作为下下个结点
        Node nextNext = next;
        //赋给新结点的next
        node.next = nextNext;
        //当前结点的下一个结点指向新结点
        this.next = node;
    }
    //获取结点数据
    public int getData() {
        return this.data;
    }
    //返回下一个结点
    public Node next() {
        return this.next;
    }
    //当前结点是否为最后一个结点
    public boolean isLast() {
        return next==null;
    }
}
