public class Sotrudnik {
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;



//   2 Конструктор класса должен заполнять эти поля при создании объекта.

    public Sotrudnik(String fullName, String  position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
//    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printInfo(){
        System.out.printf("Sotrudnik: fullName-%s,position - %s, email - %s, phone -%s, salary -%d, age -%d\n ",this.fullName,this.position,this.email,this.salary,this.age);
    }
    public int getAge () { return age;}






}
