package geekbrainshomework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }



    public static void printThreeWords() {
        System.out.println("Banana");
        System.out.println("Orange");
        System.out.println("Apple");

    }
    public static void checkSumSign() {
    int first = 1;
    int second = 3;
    if (first + second >= 0)
        System.out.println("Сумма положительная");
    else
        System.out.println("Сумма отрицательная");
    }


    public static void printColor() {
        int value = 55;
        if (value <= 0)
            System.out.println("RED");

        else if (value <= 100)
            System.out.println("YELLOW");
        else
            System.out.println("GREEN");




}
    public static void  compareNumbers(){
    int a = 666;
    int b = 777;
    if (a >= b){
        System.out.println(a>=b);}
    else if (a < b);{
            System.out.println(a<b);
        }
    }

}



