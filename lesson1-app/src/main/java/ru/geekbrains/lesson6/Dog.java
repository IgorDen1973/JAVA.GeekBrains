package ru.geekbrains.lesson6;

   class Dog extends Pets {
      private final int max_run = 500;
      private final int max_swim = 10;
      String name;

       public Dog(String name) {
           this.name = name;
       }

       @Override
           void run(int length) {
           if ((length >= 0) && (length <= max_run)) System.out.printf("%s пробежал %s метров\n", name, length);
           else System.out.printf("%s  так много не бегает\n", name);
       }
        @Override
        protected void swim(int length) {
            if ((length >= 0) && (length <= max_swim)) System.out.printf("%s проплыл %s метров\n", name, length);
            else System.out.printf("%s  так далеко не плавает\n", name);
        }
      }