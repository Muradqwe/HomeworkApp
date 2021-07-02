public class Cat extends Animal {
    private static int counter;
    private static final int maxRun = 200;

    Cat(String name ){
        super("Cat",name,200,0);
        counter++;
    }
    @Override
    public boolean swim( int distance) {
        System.out.println(" won`t swim");
        return false;
    }


    public static int getCounter(){ return counter;}
}
