//Формат сдачи: ссылка на подписанный git-проект.
//        Задание
//        Пусть дан произвольный список целых чисел.//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.Random;
import java.util.Scanner;

public class Task {
    // функция заполнения массива случайными числами
    public static Object[] rand_of_arr(int num) {
        Object[] sortArr = new Object[num];
        Random random = new Random();
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = 1 + random.nextInt(100);
        }
        return sortArr;
    }

    // функция вывода на экран массива заполненого обьектами
    public static void print_of_arr(Object[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
        System.out.print("\n");
    }

    // функция удаления четныъ значений и заполнение массива null
    public static Object[] delete_of_nums(Object[] sortArr) {

        for (int i = 0; i < sortArr.length; i++) {
            int intValue = (Integer) sortArr[i]; // приаброзую Object в Integer
            if (intValue % 2 == 0) {
                sortArr[i] = null;
            }
        }
        return sortArr;
    }


    // функция поиска минимального числа
    public static int find_Min(Object[] sortArr) {
        int minNum = (Integer) sortArr[0]; // приаброзую Object в Integer
        for (int i = 0; i < sortArr.length; i++) {
            int intValue = (Integer) sortArr[i];
            if (intValue < minNum) {
                minNum = intValue;
            }
        }
        return minNum;
    }

    // функция поиска максимального числа
    public static int find_Max(Object[] sortArr) {
        int maxNum = (Integer) sortArr[0]; // приаброзую Object в Integer
        for (int i = 0; i < sortArr.length; i++) {
            int intValue = (Integer) sortArr[i];
            if (intValue > maxNum) {
                maxNum = intValue;
            }
        }
        return maxNum;
    }


    // функция копирования массива в другой массив
    public static int[] copy_of_arr(Object[] sortArr, int nums) {
        int[] destination = new int[nums];
        int count = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (sortArr[i] != null) {
                int intValue = (Integer) sortArr[i];
                count += 1;
                destination[count] = intValue;
            }
            System.out.print(destination[count] + " ");
        }
        return destination;
    }
    // функция подсчета null в массиве
    public static int find_null(Object[] sortArr) {
        int count = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (sortArr[i] != null) {
                count += 1;
            }
        }
        System.out.println(count);
        return count;
    }


    public static void main(String args[]) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Object[] sortArr = new Object[num];

        int[] newSortArr = new int[num];
        sortArr = rand_of_arr(num);
        print_of_arr(sortArr);

        int minNums = find_Min(sortArr);
        System.out.println("Минимальное число в массиве: " + minNums);
        int maxNum = find_Max(sortArr);
        System.out.println("Максимальное число в массиве: " + maxNum);

        delete_of_nums(sortArr);
        int numsNull = find_null(sortArr);
        print_of_arr(sortArr);
        newSortArr = copy_of_arr(sortArr, numsNull);
//        print_of_arr(newSortArr);

    }


}
