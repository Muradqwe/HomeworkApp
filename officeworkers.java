public class officeworkers {
//    4. Создать массив из 5 сотрудников.
    public static void main(String[] args) {
        Sotrudnik[] sotrudniks = {
                new Sotrudnik("Ivanov Dmitrii Igorevich", "Director", "ivanov@mail.ru", "89319995533", 100000, 50),
                new Sotrudnik("Michailova Anna Viktorovna", "Administrator", "Michailova@mail.ru", "89319995421", 70000, 25),
                new Sotrudnik("Fadeev Timur Alecsandrovich", "Teacher", "Fadeev@mail.ru", "89319995321", 50000, 45),
                new Sotrudnik("Arshavin Andrei Vitalievich", "Engineer", "Arshavin@mail.ru", "89319996541", 50000, 55),
                new Sotrudnik("Kozlov Arsenii Igorevich", "Mechanic", "Kozlov@mail.ru", "89319996543", 50000, 44),
        };

        for (Sotrudnik sotrudnik : sotrudniks){
            if (sotrudnik.getAge() > 50) sotrudnik.printInfo();
        }





    }

}
