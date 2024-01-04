/*
 * wildcard overview
 */
import java.util.ArrayList;
import java.util.List;

class Hello{
    public static void main(String[] args) {    
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        printList(num);

        List<Double> dbl = new ArrayList<>();
        dbl.add(1d);
        dbl.add(2d);        
        printList(dbl);
    }

    private static void printList(List<? extends Number> nomor) {     //1. if you specify wildcard ?
        nomor.forEach(System.out::println);
        Number cobak = nomor.get(0);
        //nomor.add(5);   //tetep gak bisa add
    }    
}