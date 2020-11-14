package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;


public class MainClassLesson4 {
    public static int SIZE = 3; //константа размера поля
    public static int DOTS_TO_WIN = 3; //константа количества занятых полей для победы
    public static final char DOT_EMPTY = '.'; // именная константа = пустая ячейка
    public static final char DOT_X = 'X'; // именная константа = крестик
    public static final char DOT_O = 'O'; // именная константа = нолик
    public static char[][] map; //поле - двумерный СИМВОЛЬНЫЙ массив размером 3х3
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();// инициализируем поле для игры
        printMap(); // печатаем по краям поля координаты
        while (true) {           // цикл продолжается пока по break игра не закончится, а это ничья или победа
            humanTurn(); // запускаем ход со стороны человека; если вводится невалидные или занятые координаты, прога
            printMap();  //  циклично просит ввести валидные/незанятые и печатает таблицу с новым содержанием элемента
            if (checkWin(DOT_X)) {  // проверка победы (вариантов заполнения элементов массива символом "Х")
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];   // новый двумерный массив размера size*size
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; //заполняем все его ячейки точками
            }                          // массив заполнен точками, но пока не выведен в консоль
        }
    }

    public static void printMap() {  // метод для псевдо-печати поля, как мы это делаем? :
        for (int i = 0; i <= SIZE; i++) {  //используем System.out.print без ln так, как в таком случае не происходит
            System.out.print(i + " ");  // "перехода на новую строку" а продолжается печать на той же строке ->
        }                               // печатаем в одну верхнюю строку (номер + пробел) три раза
        System.out.println();         // печатаем пробел с переходом на строку вниз (тут .println )
        for (int i = 0; i < SIZE; i++) { // начинаем печатать вторую строчку:
            System.out.print((i + 1) + " "); // сначала в строке "1" и пробел (out.print , без ln)
            for (int j = 0; j < SIZE; j++) { // далее в туже строку печатаем:
                System.out.print(map[i][j] + " "); // первую строку массива, элементы (.) + пробел
            }
            System.out.println(); // используем println, чтобы перейти на следующую строчку
        }   // повторяем три раза
        System.out.println();// применяем переход на следующую строку, чтобы отделить таблицу от последующего диалога
    }

    public static void humanTurn() { // метод для хода человека
        int x, y; // инициализируем переменные целого типа для координат
        do {
            System.out.println("Введите координаты в формате X Y"); // просим ввести координаты в консоли
            x = sc.nextInt() - 1; // координату вводим сканером и вычитаем "1" так как первый элемент в массиве
            y = sc.nextInt() - 1;  // с номером "0", а не "1"; а привычно вводить не начиная с "0" , а начиная с "1"
        } while (!isCellValid(x, y)); // если координата от "0" до "3" и в ней записано (.) т.е. она пустая
        map[y][x] = DOT_X;    // в "незанятую" ячейку записываем "Х"
    }

    public static boolean isCellValid(int x, int y) { //
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true; // возвращает true, если в пределах 1-3 и равна точке (.)
        return false;
    }

//    public static boolean checkWin(char symb) {  // "победное" заполнение (по горизонтали/вертикали/наискосок
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }

    public static boolean checkSequence(int line_N, int row_N, int increase_x, int increase_y, char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (map[line_N + (i * increase_x)][row_N + (i * increase_y)] != symb)
                return false;
        }
        return true;
    }

    public static boolean checkWin(char symb) {   // делаем проверку победы на циклах:
        for (int i = 0; i < SIZE; i++) {
            if (checkSequence(i, 0, 0, 1, symb)) return true;  // проверяем строки
            // здесь за цикл проходим по строке, итерация (increase_y) только для второй части адреса элемента [i][y+]
            if (checkSequence(0, i, 1, 0, symb)) return true;  // проверяем столбцы
            // здесь за цикл проходим по столбцу, итерация (increase_x) только для первой части адреса элемента [x+][i]
        }
        // проверяем диагонали
        if (checkSequence(0, 0, 1, 1, symb)) return true; // от [0][0] до [2][2]
        if (checkSequence(0, SIZE - 1, 1, -1, symb)) return true; // [0][2] до [2][0]
        return false;
    }

    public static boolean isMapFull() {  // проверка всех элементов массива на равенство точке (.)
        for (int i = 0; i < SIZE; i++) {   // тоесть на пустоту хотя бы одной ячейки, что означает
            for (int j = 0; j < SIZE; j++) {   // наличие пустых ячеек (хотя бы одной)
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {  // метод для хода машины
        int x, y;    // инициализируем переменные целого типа для координат

        do {
            x = rand.nextInt(SIZE); // не уменьшаем на "1" т.к. запись и так генерит случайные числа в
            y = rand.nextInt(SIZE);  // диапазоне "SIZE - 1"
        } while (!isCellValid(x, y));  // пока
        // мы сгенерили случайные числа , но!! теперь мы проверяем, не существует ли хода противника (человека)
        // который может привести к победе:
        for (int i = 0; i < SIZE; i++)  {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)  { // находим (прогоняем по всему массиву) пустые элементы с точкой (.)
                    map[i][j] = DOT_X;     // вставляем туда знак противника (тоесть "X")
                    if (checkWin(DOT_X)) { // проверяем не привело ли это к победе противника
                        y = i;             // если привело -> заменяем случайные числа на такие координаты
                        x = j;
                    }
                    map[i][j] = DOT_EMPTY;   // обнуляем (заполняем точкой) тестированную ячейку (элемент массива)
                }
            }
        }
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1)); // информация о ходе машины
        map[y][x] = DOT_O;  // в "незанятую" ячейку записываем "0"
    }
}



