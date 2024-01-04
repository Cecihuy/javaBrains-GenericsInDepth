/*
 * wildcard overview
 */
import java.util.ArrayList;
import java.util.List;

class Hello{
    public static void main(String[] args) {    
        List<Integer> intgrs = new ArrayList<>();
        intgrs.add(1);
        intgrs.add(2);
        printList(intgrs);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1d);
        doubles.add(2d);        
        printList(doubles);

        List<Number> numbers = new ArrayList<>();
        numbers.add(1.5);
        addToList(numbers, 1.3);
    }

    private static void addToList(List<? super Number> numbers, Number i) {
        numbers.forEach(System.out::println);        
        numbers.add(i);
        //Number cobak = numbers.get(0);    //lowerbound can add but can't get
    }

    private static void printList(List<? extends Number> nomor) {
        nomor.forEach(System.out::println);
        Number cobak = nomor.get(0);
        //nomor.add(5);   //upperbound can't add but can get
    }    
}