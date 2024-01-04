import java.util.ArrayList;
import java.util.Date;

/*
 * Before generic comes, ArrayList accept to add
 * all type of object. When we call with get method
 * and assign with some type, it need to type casting
 * with that assignment type. The problem comes when we
 * cast incorrect type.
 */
class Hello{
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add(new Date());
        names.add("name 1");
        names.add("name 2");

        String result = (String) names.get(0);  //incorrect type casting
        System.out.println(result);
    }
}