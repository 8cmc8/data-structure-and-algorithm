package Fibonacci;

/**
 * ClassName: TestFibonacci
 * Description: 斐波那契数列（1，1，2，3，5，8，13，21......）
 * date: 2019-06-16 16:09
 *
 * @author cmc
 */
public class TestFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(40));
    }
    //传入参数为数列的第i项
    public static int fibonacci(int i) {
        if (i==1 || i==2) {
            return 1;
        }else {
            return fibonacci(i-2)+fibonacci(i-1);
        }
    }
}
