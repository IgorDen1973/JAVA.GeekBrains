package ru.geekbrains.lesson7;

public class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }


    boolean decreaseFood(int n) {
        int x = food - n;  // x - новый остаток пищи
        if (x < 0) return false;//чтобы не могло получиться отрицательного количества еды

        food -= n;
        return true;  // если нормик - возвращает true , чтобы кормился
    }

    void info() {
        System.out.println("plate: " + food);
    }

    void addFood(int food) {
        this.food += food;    //метод, с помощью которого можно добавлять еду в тарелку
    }
}
