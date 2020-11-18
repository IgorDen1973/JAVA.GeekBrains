package ru.geekbrains.lesson5;

public class Sotrudnik {    // задаем переменные класса
    String name; //ФИО
    String post; //должность
    String email; // e-mail
    String phoneN; //телефон
    int wage; //зарплата
    int age; //возраст

    // конструктор для класса
    public Sotrudnik(String name, String post, String email, String phoneN, int wage, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneN = phoneN;
        this.wage = wage;
        this.age = age;
    }

    public void printArray(){ //метод, который выводит информацию об объекте в консоль
        System.out.println();
        System.out.println("Имя: "+name+"   Должность: "+post+"   Email: "+email);
        System.out.println("Телефон: "+phoneN+"   Зарплата: "+wage+"   Возраст: "+age);
        System.out.println();
    }

    public static void main(String[] args)  {  // создаем массив из 5 сотрудников
        Sotrudnik[] staffArray = new Sotrudnik[5];
        staffArray[0] = new Sotrudnik("Константин Бобров", "Генеральный директор", "boss@koop.ru", "+74956965500", 250000, 51);
        staffArray[1] = new Sotrudnik("Николай Фомин", "Директор по PR", "nf@koop.ru", "+74956781158", 180000, 37);
        staffArray[2] = new Sotrudnik("Евлампий Тыквин", "Дизайнер", "et@koop.ru", "+74958901224", 140000, 21);
        staffArray[3] = new Sotrudnik("Марфа Забиякина", "Ведущий экономист", "mz@koop.ru", "+74954449889", 120000, 48);
        staffArray[4] = new Sotrudnik("Кэтти Пэрри", "Директор по работе VIP", "kp@koop.ru", "+74959075896", 200000, 27);

        for (int k=0; k < staffArray.length; k++)  // если у объекта/элемента "age" > 40, то вызывается метод printArray()
            if (staffArray[k].age > 40) staffArray[k].printArray();

    }
}




