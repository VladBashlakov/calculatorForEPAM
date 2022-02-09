package by.epam.hm.controller;

import by.epam.hm.input.CalcInput;
import by.epam.hm.logic.CalcLogic;
import by.epam.hm.view.CalcView;


public class CalcController {

    private static final CalcLogic doCalc = new CalcLogic();
    private static final CalcInput input = new CalcInput();
    private static final CalcView print = new CalcView();

    public static void main(String[] args) {
        print.menu();
    }

    public static void printSumOfNumbersEqualToDivisor() {
        print.showSimpleNumber(
                doCalc.printSumOfNumbersEqualToDivisor(
                        input.inputArrOfNumbers(),
                        input.inputSimpleNumber()));
    }

    public static void doExponentiation() {
        print.showDoubleArrResult(
                doCalc.doExponentiation(
                        input.inputThreeNumbers()));
    }

    public static void checkIfSumFirstTwoDigitsEqualSumLastTwoDigits() {
        print.showBooleanResult(
                doCalc.checkIfSumFirstTwoDigitsEqualSumLastTwoDigits(
                        input.inputNumber()));
    }

    public static void mergeArrays() {
        print.showNumbersArrResult(
                doCalc.mergeArrays(
                        input.inputSimpleNumber(),
                        input.inputArrOfNumbers(),
                        input.inputArrOfNumbers()));
    }

}
