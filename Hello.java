/*
 * generic type construct at compille time.
 * array type construct at runtime
 */
class Hello{
    public static void main(String[] args) {    
        String[] namesArray = new String[5];
        addToArray(namesArray, "Name 1");
        incorrectAddToArray(namesArray, 150);   //1. trying to pass argument 'namesArray' with Array of String type into parameter with Array of Object type
        String anotherName = namesArray[0];
    }

    private static void addToArray(String[] namesArray, String str) {
        namesArray[0] = str;
    }

    private static void incorrectAddToArray(Object[] namesArray, Integer i) {
        namesArray[0] = i;  //2. insertion element with type integer will cutoff at runtime because type doesn't match
    }
}