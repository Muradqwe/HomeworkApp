public class Main {
    public static void main(String[] args) {
        Animal[]  animals = {
                new Cat("Kesha"),
                new Cat("Tiger"),
                new Dog("Bobik",500,10),
                new Dog("Rex",600,20)
        };
        for ( Animal a : animals) {
            a.run(150);
            a.swim(10);
            a.run(600);
            a.swim(25);
            a.run(700);
            a.swim(30);
        }
        System.out.println("There where " + Cat.getCounter()+ "Cats");
        System.out.println("There where " + Dog.getCounter()+ "Cats");
    }
}
