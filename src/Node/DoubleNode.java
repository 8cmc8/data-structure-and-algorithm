package Node;

/**
 * ClassName: doubleNode
 * Description: 双循环链表
 * date: 2019-06-16 14:43
 *
 * @author cmc
 */
public class DoubleNode {
    //上一个结点
    DoubleNode pre = this;
    //下一个结点
    DoubleNode next = this;
    //结点数据
    int data;
    //构造方法
    public DoubleNode(int data) {
        this.data = data;
    }
    //向后插入结点
    public void after(DoubleNode node) {
        //将下一个结点作为下下个结点
        DoubleNode nextNext = this.next;
        //将下一个结点指向新结点
        this.next = node;
        //将新结点的上一结点指向当前结点
        node.pre = this;
        //将新结点指向下下个结点
        node.next = nextNext;
        //将下下个结点的上一个结点指向新结点
        nextNext.pre = node;
    }
    //获取数据
    public int getData() {
        return this.data;
    }
    //获取下一个结点
    public DoubleNode next() {
        return this.next;
    }
    //获取上一个结点
    public DoubleNode pre() {
        return this.pre;
    }
}
