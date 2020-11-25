package ru.geekbrains.lesson7;

class MainCat {
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Fox", 20), new Cat("Sex", 15), new Cat("Six", 20), new Cat("Eye", 5)};

        Plate plate = new Plate(35); // наполним, чтобы хватило первым двум кошакам

        for(int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);        //попросить всех котов покушать из этой тарелки
            cats[i].info();  // и потом вывести информацию о сытости котов в консоль
        }
    }
}

