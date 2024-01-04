import java.util.ArrayList;
import java.util.Date;

/*
 * Adding a generic type of String into ArrayList will give
 * compiler to ensure the type of element we add is type of String.
 * No need to type casting when we get element because compiler know what
 * type of element will be called.
 */
class Hello{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        //names.add(new Date());    //cannot add Date type
        names.add("name 1");
        names.add("name 2");

        String result = names.get(0);
        System.out.println(result);
    }
}