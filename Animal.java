public class Animal {
    private static int counter;
    private String  type;
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal () {counter++;}

    public Animal(String type, String name, int maxRun, int maxSwim) {
        this();
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRun;
        this.maxSwimDistance = maxSwim;
    }

    public boolean run(int distance) {
        if (distance<=maxRunDistance) {
            System.out.printf("%s %s run %d meters\r\n", type, name, distance);
            return true;
        }else System.out.printf("%s %s could not run %d meters\r\n", type, name, distance);
        return  false;
    }
    public boolean swim (int distance) {
        if (distance<= maxSwimDistance){
            System.out.printf("%s %s swimmed %d meters \r\n", type, distance);
            return true;
        } else System.out.printf("%s %s could not swim %d meters \r\n", type, name, distance);
        return false;
    }

}
