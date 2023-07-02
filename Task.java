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

    public static void print_of_arr_int(int[] sortArr) {
        for (int i = 1; i < sortArr.length; i++) {
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

    // функция нахождения среднего значения
    public static double find_Mid(Object[] sortArr) {
        int count = 0;
        double midCount = 0;
        for (int i = 0; i < sortArr.length; i++) {
            int intValue = (Integer) sortArr[i];
            count += intValue;
        }
        midCount = count / (sortArr.length);

        return midCount;
    }



    // функция копирования массива в другой массив
    public static int[] copy_of_arr(Object[] sortArr, int nums) {
        int[] destination = new int[nums + 1];
        int count = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (sortArr[i] != null) {
                int intValue = (Integer) sortArr[i];
                count += 1;
                destination[count] = intValue;
            }
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
        System.out.println("Количество элементов НЕ null: " + count);
        return count;
    }


    public static void main(String args[]) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Object[] sortArr = new Object[num];

        sortArr = rand_of_arr(num); // заполняю массив случайными числами (Обьектами)
        print_of_arr(sortArr); // вывожу массив обьектов в консоль

        int minNums = find_Min(sortArr); // ищу минимальное число
        int maxNum = find_Max(sortArr); // ищу максимальное число
        double midNum = find_Mid(sortArr); // ищу максимальное число


        delete_of_nums(sortArr);
        int numsNull = find_null(sortArr); // считаю сколько НЕ null в массве
        int[] newSortArr = new int[numsNull];

        System.out.println("1. Массив без четных чисел: ");
        print_of_arr(sortArr);
        newSortArr = copy_of_arr(sortArr, numsNull); //копирую все значения НЕ null во второй массив (int)
        System.out.println("   Массив без четных чисел и null: ");
        print_of_arr_int(newSortArr);

        System.out.println("2. Минимальное число в массиве: " + minNums);
        System.out.println("3. Максимальное число в массиве: " + maxNum);
        System.out.println("4. Cреднее значение в массиве: " + midNum);
    }
}
