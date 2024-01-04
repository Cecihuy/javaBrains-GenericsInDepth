public class Zoo {
    public static void main(String[] args) {
        
        Cage<Monkey> monkeyCage = new Cage<Monkey>();
        monkeyCage.setAnimal1(new Monkey());
        monkeyCage.setAnimal2(new Monkey());
        Monkey monkey1 = monkeyCage.getAnimal1();
        System.out.println(monkey1);

        Cage<Lion> lionCage= new Cage<Lion>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());
        Lion lion1 = lionCage.getAnimal1();
        System.out.println(lion1);
    }
}
