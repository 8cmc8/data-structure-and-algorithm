package Node;

/**
 * ClassName: Node
 * Description: 单循环链表
 * date: 2019-06-16 10:59
 *
 * @author cmc
 */
public class LoopNode {
    //结点存储的数据
    int data;
    //下一个结点的引用
    LoopNode next = this;
    //构造方法（给结点赋值）
    public LoopNode(int data) {
        this.data = data;
    }
    //删除下一个结点
    public void removeNext() {
        //获取下下个结点
        LoopNode newNode = next.next;
        //把下下个结点赋给下个结点
        next = newNode;
    }
    //插入结点
    public void after(LoopNode node) {
        //获取下个结点，作为下下个结点
        LoopNode nextNext = next;
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
    public LoopNode next() {
        return this.next;
    }
}
