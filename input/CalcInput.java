package by.epam.hm.input;

import java.util.Scanner;

public class CalcInput {

    @SuppressWarnings("resource")
    public Scanner scanner = new Scanner(System.in);

    public int inputNumber() {
        System.out.println("Введите четырехзначное число");
        return scanner.nextInt();
    }

    public int inputSimpleNumber() {
        System.out.println("Введите число");
        return scanner.nextInt();
    }

    public double[] inputThreeNumbers() {
        System.out.println("Введите 3 числа");
        return new double[]{scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};
    }

    public int[] inputArrOfNumbers() {
        System.out.println("Введите размер массива");
        int[] numbers = new int[scanner.nextInt()];

        System.out.println("Добавьте числа в массив");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }


}
