//Формат сдачи: ссылка на подписанный git-проект.
//        Задание
//        Пусть дан произвольный список целых чисел.//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.Scanner;
import java.util.Random;

public class Task {
    public static int[] rand_of_arr(int num) {
        int[] sortArr = new int[num];
        Random random = new Random();
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = 1 + random.nextInt(100);
        }
        return sortArr;
    }
    public static void main(String args[]) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] sortArr = new int[num];
        sortArr = rand_of_arr(num);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }

    }



}
