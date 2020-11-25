package ru.geekbrains.lesson7;

class Cat {
    private String name;
    private int appetite;
    private boolean hangry; // Каждому коту нужно добавить поле сытость
                           // hungry (голодный) + angry (сердитый)
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hangry = true;   // когда создаем котов, они голодны и сердиты
    }

    void info() {
        String condition = "голоден";
        if (!hangry) {
            condition = "поел";}
        System.out.println(name + "-> " + condition);
    }      // выдает "голоден" по дефолту или если не покормлен; "поел" когда eat прошел

    void eat(Plate plate) {
        if (hangry && plate.decreaseFood(appetite)) // накормим если одновременно и голоден
            hangry = false;                         // и хватает в миске еды
    }                                               // после чего он сыт (!hangry)

}


