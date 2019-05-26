package MyArray;

/**
 * ClassName: MyArrayTest <br/>
 * Description: <br/>
 * date: 2019-05-06 01:22<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.show();

        myArray.add(1);
        myArray.show();
        myArray.add(2);
        myArray.show();
        myArray.add(3);
        myArray.show();

        myArray.add(6,2);
        myArray.show();
        myArray.add(7,3);
        myArray.show();
        myArray.add(8,4);
        myArray.show();

        myArray.delete(3);
        myArray.show();

        myArray.update(9,3);
        myArray.show();

        System.out.println(myArray.search(0));
        System.out.println(myArray.search(6));

        myArray.init();
        myArray.show();
        System.out.println(myArray.binarySearch(-5));
        System.out.println(myArray.binarySearch(20));
        System.out.println(myArray.binarySearch(4));
        System.out.println(myArray.binarySearch(6));
    }
}
