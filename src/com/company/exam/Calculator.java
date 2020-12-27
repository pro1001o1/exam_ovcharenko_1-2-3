package com.company.exam;
import java.util.Scanner;

public class Calculator {
    double num1, num2, result, n;//обьявление переменных,которые пригодатся в дальнейшем
    Scanner in = new Scanner(System.in);//обьявляем сканер
    public void simplecalc() {//метод предназначен для сканирования чисел сканером,а сканер действий прописан в каждом типе калькулятора
        System.out.print("Введите пример: ");
        String[] input = in.nextLine().split(" ");
        if (input.length !=3) {
            System.out.print("Введена неправильная форма. Ожидается например \"a + b\"");
        }
        num1 = Double.parseDouble(input[0]);
        String operationType = input[1];  //вводим действие,которое хотим сделать
        num2 = Double.parseDouble(input[2]);//вводим второе число
        switch (operationType){
            case "+" -> {result = num1 + num2;//сначала записываем результат в переменную благодаря оператору switch-case
                        System.out.println("Ваш результат: " + result + "\n");}//а после выводим его (действие сложения)
            case "-" -> {result = num1 - num2;//действие вычитания
                        System.out.println("Ваш результат: " + result + "\n");}//действие вычитания
            case "*" -> {result = num1 * num2;//действие умножения
                        System.out.println("Ваш результат: " + result + "\n");}//действие умножения
            case "/" -> {result = num1 / num2;//действие деления
                        System.out.println("Ваш результат: " + result + "\n");}//действие деления
        }
    }
    public void roundcalc(){//в RoundedCalculator мы вводим действие,затем кол-во цифр после запятой и, сначала, считаем результат,
        System.out.print("Введите пример (сначала вводите пример через пробел,а после - кол-во чисел после запятой, также десятичные дроби пишите с точкой): ");
        String[] input = in.nextLine().split(" ");
        if (input.length !=4) {
            System.out.print("Введена неправильная форма. Ожидается например \"a + b\" \n");
        }
        num1 = Double.parseDouble(input[0]);

        String operationType = input[1];  //вводим действие,которое хотим сделать
        num2 = Double.parseDouble(input[2]);//вводим второе число
        n = Double.parseDouble(input[3]);
        double scale = Math.pow(10, n);//вводим переменную,в которой мы записываем цифру 10 в степени n
        switch (operationType){//используем оператор switch-case,чтобы записать результат примера в зависимости от действий
            case "+" -> result = num1 + num2;//действие сложения
            case "-" -> result = num1 - num2;//вычитания
            case "*" -> result = num1 * num2;//умножения
            case "/" -> result = num1 / num2;//деления
        }
        double r_result = Math.ceil(result * scale) / scale;//формула,благодаря которой мы записываем результат с определеным количеством цифр после запятой
        System.out.println("Ваш результат: " + r_result + "\n");//выводим результат
    }
    public void log_sin_cos(){
        System.out.print("Введите то,что хотите найти (sin,cos или lg): ");
        String[] input = in.nextLine().split(" ");
        if (input.length !=2) {
            System.out.print("Введена неправильная форма. Ожидается например \"a + b\"");
        }
        String operationType = input[0];  //вводим действие,которое хотим сделать
        num2 = Double.parseDouble(input[1]);//вводим второе число
        switch (operationType){
            case "sin" -> {result = Math.sin(num2);//сначала записываем результат в переменную благодаря оператору switch-case
                System.out.println("Ваш результат: " + result + "\n");}//а после выводим его (действие сложения)
            case "cos" -> {result = Math.cos(num2);//действие вычитания
                System.out.println("Ваш результат: " + result + "\n");}//действие вычитания
            case "lg" -> {result = Math.log10(num2);//действие умножения
                System.out.println("Ваш результат: " + result + "\n");}//действие умножения
        }
    }
}