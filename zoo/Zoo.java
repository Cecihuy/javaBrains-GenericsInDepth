public class Zoo {
    public static void main(String[] args) {        
        Cage<Monkey> monkeyCage = new Cage<Monkey>(new Monkey(), new Monkey());
        monkeyCage.getAnimal1();        
    }
}
