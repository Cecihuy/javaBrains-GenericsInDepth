public class Zoo {
    public static void main(String[] args) {        
        Cage<Monkey> monkeyCage = new Cage(new Monkey(), new Lion());   //no type checking here, Lion can pass happyly
        Cage<Monkey> monkeyCage2 = new Cage<Monkey>(new Monkey(), new Monkey());    //type checking applied Lion can't pass
    }
}
