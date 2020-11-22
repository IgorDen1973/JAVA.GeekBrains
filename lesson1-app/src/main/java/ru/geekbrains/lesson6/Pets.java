package ru.geekbrains.lesson6;

abstract  class Pets {
    private final int max_run = 0; // final ставим чтобы не наследовался
    private final int max_swim = 0;

    abstract void run(int length);
    abstract void swim(int length);
}

