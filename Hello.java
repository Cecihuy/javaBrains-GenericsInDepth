/*
 * wildcard overview
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Hello{
    public static void main(String[] args) {    
        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printList(numbers);
    }

    private static void printList(List<?> names) {     //1. if you specify wildcard ?
        names.forEach(System.out::println);
        //names.add(new Date());  //2. you only allow use for reading purpose. insertion doesn't allowed.
    }    
}