public class Dog extends Animal {
    private static int counter;

    Dog(String name, int maxRun, int maxSwim) {
        super("Dog", name, maxRun, maxSwim);
        counter++;

    }

    public boolean swim(int distance) {
        System.out.println();
        return false;

        }
        public static int getCounter() { return  counter;}

}

