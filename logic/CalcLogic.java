package by.epam.hm.logic;


import java.util.Arrays;

public class CalcLogic {

    public boolean checkIfSumFirstTwoDigitsEqualSumLastTwoDigits(int number) {

        char[] charArray = (number + "").toCharArray();
        int[] numbers = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            numbers[i] = Character.getNumericValue(charArray[i]);
        }
        return (numbers[0] + numbers[1] == numbers[2] + numbers[3]);
    }

    public double[] doExponentiation(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = Math.pow(arr[i], 2);
            } else {
                arr[i] = Math.pow(arr[i], 4);
            }
        }
        return arr;
    }

    private int sum = 0;

    public int printSumOfNumbersEqualToDivisor(int[] numbers, int divisor) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divisor == 0) {
                sum = sum + numbers[i];
            }
        }
        return sum;
    }

    public int[] mergeArrays(int divider, int[] arr, int[] arr1) {

        int[] newArr = new int[arr.length + arr1.length];

        for (int i = 0; i < divider; i++) {
            newArr[i] = arr[i];
        }
        for (int i = divider, j = 0; i < arr1.length + arr1.length + 1; i++, j++) {
            newArr[i] = arr1[j];
        }
        for (int i = divider + arr1.length, j = divider; i < newArr.length; i++, j++) {
            newArr[i] = arr[j];
        }
        return newArr;
    }

}
