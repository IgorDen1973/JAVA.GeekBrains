package ru.geekbrains.lesson6;


public class Main {
    public static void main(String[] args) {
    Dog dogBobik = new Dog("Бобик");
    Cat catBazilio = new Cat("Базилио");
    Cat catBazi = new Cat("Базилио");

        dogBobik.run(120);
    dogBobik.swim(7);
    catBazilio.run(110);
    catBazilio.swim(300);
        catBazilio.cats(); ////   подсчет идет
    }

}

