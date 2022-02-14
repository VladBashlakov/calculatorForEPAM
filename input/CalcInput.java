package by.epam.hm.input;

import java.util.Scanner;


public class CalcInput {

    @SuppressWarnings("resource")
    private final Scanner scanner = new Scanner(System.in);

    public int inputNumber() {
        return inputReviseInt("Введите четырехзначное число >> ");
    }

    public int inputSimpleNumber() {
        return inputReviseInt("Введите число >> ");
    }

    public int inputNumberOfMenu() {
        return inputReviseInt(">>");
    }

    public double[] inputThreeNumbers() {
        return new double[]{
                inputReviseDouble("Введите действительное число >> "),
                inputReviseDouble("Введите действительное число >> "),
                inputReviseDouble("Введите действительное число >> ")
        };
    }

    public int[] inputArrOfNumbers() {
        int size;
        size = inputReviseInt("Введите размер массива >> ") - 1;

        int[] numbers = new int[size];

        System.out.println("Добавьте числа в массив >> ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = inputReviseInt("Введите число >> ");
        }
        return numbers;
    }

    public int inputReviseInt(String msg) {
        System.out.print(msg);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(msg);
        }
        return scanner.nextInt();
    }

    public double inputReviseDouble(String msg) {
        System.out.print(msg);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(msg);
        }
        return scanner.nextDouble();
    }


}
