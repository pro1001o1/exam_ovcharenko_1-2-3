package com.company.exam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//вводим сканер
        int x = 0;//в этой переменной указан 0,поскольку программа будет записывать сюда значение переменной s
        String s = "";//вводим пустую строчную переменную для ввода в консоль в дальнейшем
        while (!"4".equals(s)){//этот цикл вычисляет так: пока не будет введена цифра 6,то цикл будет активен (в нашем случае это цикл меню)
            System.out.println("Выберите калькулятор,который хотите использовать:");
            System.out.println("1. SimpleCalculator");
            System.out.println("2. RoundedCalculator");
            System.out.println("3. Десятичный логарифм, синус угла (в градусах) и косинус угла (в градусах)");
            System.out.println("4. Выход из приложения");
            s = scan.next();//вводим в строчную переменную цифру пункта меню благодаря сканеру
            try {//после этого значение строчной переменной переводится в значение числовой переменной
                x = Integer.parseInt(s);//благодаря парсингу
            }
            catch (NumberFormatException e){//а сам цикл try-catch проверяет,введены ли буквы вместо цифры
                System.out.println("Неверный ввод");//если выводит это сообщение-значит были введены буквы или другие символы вместо цифр
            }
            switch (x){//далее определяем пункт меню благодаря оператору switch-case и выводим то,что нам нужно
                case 1 -> {System.out.println("\nSimpleCalculator");//при первом пункте меню выводится обычный калькулятор из класса Calculator
                           Calculator s_calculator = new Calculator();//обьявляем обьект калькулятора
                           s_calculator.simplecalc();}//берем из класса Calculator метод scan

                case 2 -> {System.out.println("\nRoundedCalculator");//при втором пункте меню выводится калькулятор,который задает кол-во цифр после запятой и округляет результат
                           Calculator r_calculator = new Calculator();//обьявляем обьект второго калькулятора
                           r_calculator.roundcalc();}//также и метод round,который задает кол-во цифр после запятой,а затем округляет результат

                case 3 -> {System.out.println("\nДесятичный логарифм, синус угла (в градусах) и косинус угла (в градусах)");//при третьем пункте меню выводится либо десятичный логарифм,либо синус угла в градусах,а также косинус угла в градусах
                           Calculator n_calculator = new Calculator();//обьявляем обьект калькулятора
                           n_calculator.log_sin_cos();}//берем из класса Calculator метод logarithm,который определяет десятичный логарифм
            }
        }
        System.out.println("До свидания!");//сообщение выводится,когда пользователь выбрал последний (шестой) пункт меню
    }
}
