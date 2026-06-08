package com.google.natalliamuratava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int firstNumber = 4;
        int secondNumber = 5;

        int sum = firstNumber + secondNumber;
        System.out.println(sum);

        int difference = secondNumber - firstNumber;
        System.out.println(difference);

        int multiplication = firstNumber * secondNumber;
        System.out.println(multiplication);

        double division = (double) secondNumber / firstNumber;
        System.out.println(division);

        // 1) применить несколько арифметических операций над int и double в одном выражении

        double result = firstNumber + division * secondNumber;
        System.out.println(result);

        //2) применить несколько логических операций ( < , >, >=, <= )


        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second number");
        } else
        if (firstNumber < secondNumber) {
            System.out.println("The second number number is bigger than the first number");
        } else
        if (firstNumber == secondNumber) {
                System.out.println("The first number is equal to the second number");
        }

        //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        //4) получить переполнение при арифметической операции

        byte limit = 127;
        limit += 1;
        System.out.println(limit);
    }
}