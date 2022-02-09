package by.epam.hm.view;


import by.epam.hm.controller.CalcController;

import java.util.Arrays;
import java.util.Scanner;

public class CalcView {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер действия которое хотите выполнить:\n" +

                "\n1:Проверить, является ли сумма двух первых цифр заданного четырехзначного числа\n" +
                "равной сумме двух его последних цифр.\n" +

                "2:Ввести три числа. Возвести в квадрат те из них, " +
                "значения которых неотрицательны, и в четвертую степень — отрицательные.\n" +

                "3:Найти сумму элементов массива кратных определенному числу\n" +

                "4:Задать два одномерных массива с различным количеством элементов и натуральное число k. " +
                "Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.");

        int number = scanner.nextInt();
        if (number == 1) {
            CalcController.checkIfSumFirstTwoDigitsEqualSumLastTwoDigits();
        } else if (number == 2) {
            CalcController.doExponentiation();
        } else if (number == 3) {
            CalcController.printSumOfNumbersEqualToDivisor();
        } else if (number == 4) {
            CalcController.mergeArrays();
        }
    }


    public void showBooleanResult(boolean bool) {
        System.out.println("Вывожу результат сравнения чисел");
        System.out.println(bool);
    }

    public void showDoubleArrResult(double[] d) {
        System.out.println("Вывожу все числа возведенные в степень");
        System.out.println(Arrays.toString(d));
    }

    public void showNumbersArrResult(int[] d) {
        System.out.println("Вывожу новый массив");
        System.out.println(Arrays.toString(d));
    }

    public void showSimpleNumber(int number) {
        System.out.println(number);
    }

}
