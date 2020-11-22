package ru.geekbrains.lesson6;


class Cat extends Pets {
    private final int max_run = 200;
    private final int max_swim = 0;
    String name;
    static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= max_run)) System.out.printf("%s пробежал %s метров\n", name, length);
        else System.out.printf("%s  так много не бегает\n", name);
//        System.out.println(catCount);
    }

    @Override
    protected void swim(int length) {
    System.out.printf("%s  не плавает, он - кот!\n", name);
//        System.out.println(catCount);
    }
//
//    public void cats() { ///   идет подсчет
//        System.out.println(catCount);
//    }

}