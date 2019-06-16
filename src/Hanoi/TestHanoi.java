package Hanoi;

/**
 * ClassName: TestHanoi
 * Description: 汉诺塔问题
 * date: 2019-06-16 16:25
 *
 * @author cmc
 */
public class TestHanoi {
    static int i = 0;
    public static void main(String[] args) {
        hanoi(4,'A','B','C');
        System.out.println("最少需要移动"+i+"步");
    }

    /**
     *
     * @param n 共有n个盘子
     * @param from 起始柱子
     * @param medium 中间柱子
     * @param to 目标柱子
     */
    public static void hanoi(int n,char from,char medium,char to) {
        //只有1个盘子
        if (n==1) {
            System.out.println("第1个盘子从"+from+"移到"+to);
            i++;
        }
        //其他情况，都认为只有2个盘子(上面的所有盘子和最下面一个盘子）
        else {
            //将上面的所有盘子移动到中间位置
            hanoi(n-1,from,to,medium);
            //将下面的盘子移动到目标位置
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            i++;
            //将上面的所有盘子从中间位置移到目标位置
            hanoi(n-1,medium,from,to);
        }
    }
}
