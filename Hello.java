import java.util.ArrayList;
import java.util.List;
/*
 * generic type is associate with expression on the variable, not the instance it self.
 * try to create inconsistency generic type
 */
class Hello{
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        addToNames(names, "Name 1");
        addToNames(names, "Name 2");
        System.out.println(names);
        incorrectAddToNames(names, 100);    //1. trying to pass argument 'names' with List generic type into parameter with List old type
        System.out.println(names);
        String names3 = names.get(2);       //3. trying to get element at index 2 where element type actually are Integer
    }

    private static void addToNames(List<String> names, String str) {
        names.add(str);
    }

    private static void incorrectAddToNames(List list, Integer i) {
        list.add(i);    //2. element with type integer will happyly insert into List
    }
}