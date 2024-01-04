/*
 * generic only support Object type, if we dealing with
 * primitive type like int, we can use wrapper class
 * Integer on it
 */
import java.util.Arrays;
import java.util.List;

class Hello{
    public static void main(String[] args) {
        int i = 10;
        Integer j = i;      //autoboxing

        Integer k = new Integer(15);
        int l = k;          //unboxing

        List<Integer> list = Arrays.asList(10, 20, 30);
        int first = list.get(0);

        System.out.println(first);
    }
}