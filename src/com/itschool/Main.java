package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Example_1();
//        Example_2();
//        Example_10();
//        Example_7();
//        Example_1x();
//        Example_Art();
//        Example_6();
//        Example_95();
//        Example_1h();
//        Example_3();
//        Example_4();
//        Example_5();
//        Example_6h();
//        Example_7h();
//        Example_8();  // ????? 'else' without 'if'
//        Example_9();
//        Example_10();
    }

    private static void Example_10() {
//        Написать программу решения уравнения ax3 + bх = 0 для произвольных а, b.

        /*Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        int x;
        int c = x*x*x;
        a*c+b*x=0 // ....не знаю, как его решить*/


        }
    }

    private static void Example_9() {
        /*Даны вещественные числа х и у, не равные друг другу. Меньшее из этих
        двух чисел заменить половиной их суммы, а большее — их удвоенным
        произведением.*/

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner1.nextInt();
        int c = x + y;
        if (x>y){
            int i = (c-x)*x*2;
            y = (x+y)/2;
            System.out.println("x = " + i);
            System.out.println("y = " + y);
        } else if (x<y){
            int j = (x+y)/2;
            y = (c-x)*x*2;
            System.out.println("x = " + j);
            System.out.println("y = " + y);
        } else {
            System.out.println("Введены некорректные значения");
        }
    }

    /*    private static void Example_8() {
        *//*Дано трехзначное число. Определить, равен ли квадрат этого числа сумме
        кубов его цифр.*//*

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 99 && number < 1000) {
            int squareNumber = number * number;
            int three = number % 10;
            int two = number % 100 / 10;
            int one = number % 1000 / 100;
            int cubes = ((one * one * one) + (two * two * two) + (three * three * three));
            System.out.println("squareNumber = " + squareNumber);
            System.out.println("cubes = " + cubes);
            else { if (squareNumber == cubes){
                System.out.println("Квадрат этого числа равен сумме кубов его цифр");}
            }System.out.println("Некорректно введенные данные");
        }
    }*/

    private static void Example_7h() {
       /* Дано трехзначное число.
       Определить, какая из его цифр больше:
        а) первая или последняя;
        б) первая или вторая;
        в) вторая или последняя.*/

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >99 && number<1000){
           int three = number%10;
           int two = number% 100/10;
           int one = number % 1000 / 100;
            if (one>three){
                System.out.println("Первая цифра больше последней");
            } else {
                System.out.println("Последняя цифра больше первой");
            } if (one>two){
                System.out.println("Первая цифра больше второй");
            } else {
                System.out.println("Вторая цифра больше первой");
            } if (two>three) {
                System.out.println("Вторая цифра больше последней");
            }else {
                System.out.println("Последняя цифра больше второй");}
        } else {
            System.out.println("Введены некорректные данные");
        }
    } // Проверка на буквы и знаки?

    private static void Example_6h() {
        /*Написать программу для вычисления стоимости разговора по телефону с  учетом 20% скидки,
        предоставляемой по субботам и воскресеньям. Ниже приведён возможный вид экрана программы во время её работы.

        Вычисление стоимости разговора по телефону.

        Введите исходные данные:
        Длительность разговора (целое количество минут) -> 3
        День недели (1 — понедельник, ... 7 — воскресенье) -> б

        Предоставляется скидка 20%.
        Стоимость разговора: 5.52 грн.*/


        System.out.println("Введите исходные данные: " + "\n" + "День недели (1 — понедельник, ... 7 — воскресенье)");
        System.out.println("Длительность разговора (целое количество минут)");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String dayOfTheWeek = scanner.nextLine();
        int callMinOfTheHour = scanner1.nextInt();
        int priceOfTheCall = 2;
        int costOfTheCall = priceOfTheCall * callMinOfTheHour;
        double action = costOfTheCall - (costOfTheCall * 20 / 100);
        switch (dayOfTheWeek) {
            case "1":
                System.out.println("Стоимость разговора: " + costOfTheCall + " грн");
                break;
            case "2":
                System.out.println("Стоимость разговора: " + costOfTheCall + " грн");
                break;
            case "3":
                System.out.println("Стоимость разговора: " + costOfTheCall + " грн");
                break;
            case "4":
                System.out.println("Стоимость разговора: " + costOfTheCall + " грн");
                break;
            case "5":
                System.out.println("Стоимость разговора: " + costOfTheCall + " грн");
                break;
            case "6":
                System.out.println("Предоставляется скидка 20%." + "\n" + "Стоимость разговора: " + action + " грн");
                break;
            case "7":
                System.out.println("Предоставляется скидка 20%." + "\n" + "Стоимость разговора: " + action + " грн");
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
    }
    /*        int callMinOfTheHour = scanner.nextInt();
            int dayOfTheWeek = scanner.nextInt();
            int priceOfTheCall = 2;
            int costOfTheCall = priceOfTheCall * callMinOfTheHour;
            int action = costOfTheCall - (costOfTheCall * 20 / 100);
                    if (dayOfTheWeek != 6 & 7) {
                System.out.println("Стоимость разговора: " + costOfTheCall);
            } else {
                System.out.println("Предоставляется скидка 20%." + "\n" + "Стоимость разговора: " + action + " грн");
            }  Почему не работает?*/
    private static void Example_5() {
      /*  Написать программу, которая проверяет, делится ли на три введённое с клавиатуры целое число.
        Ниже приведён возможный вид экрана программы во время её работы.

        -> 451
        Число 451 нацело на три не делится.*/

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number % 3 > 0) {
            System.out.println("Число " + number + " нацело на 3.0 не делиться");
        } else {
            System.out.println("Результат деления " + number + " на 3.0 = " + number / 3);
        }
    } // как проверить на введённые с клавиатуры буквы?

    private static void Example_4() {
       /* Написать программу, которая проверяет, является ли введённое пользователем целое число четным.
        Ниже приведён возможный вид экрана программы во время выполнения такой программы.

        Введите целое число и нажмите <Enter>
        -> 23
        Число 23 — нечетное.*/

        System.out.println("Введите целое число и нажмите <Enter>");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число " + number + " - чётное");
        } else {
            System.out.println("Число " + number + " - не чётное");
        }
    }

    private static void Example_3() {
       /* Написать программу для вычисления стоимости покупки с учетом скидки.
            Скидка в 3% предоставляется, если сумма покупки больше 500 руб, в 5% — если сумма больше 1000 руб.
        Ниже приведён возможный вид экрана во время выполнения такой программы.

        Вычисление стоимости покупки с учетом скидки.
            -> 640
            Вам предоставляется скидка 3%
            Сумма с учетом скидки: 620.80 руб.*/

        Scanner scanner = new Scanner(System.in);
        int shoppingSumm = scanner.nextInt();
        if (shoppingSumm > 500 && shoppingSumm < 1000) {
            double i = shoppingSumm - (shoppingSumm * 3 / 100);
            System.out.println("Вам предоставляется скидка 3%");
            System.out.println("Ваша сумма с учетом скидки:" + (String.format("%10.2f", i)) + " $");
        } else if (shoppingSumm > 1000) {
            double j = shoppingSumm - (shoppingSumm * 5 / 100);
            System.out.println("Вам предоставляется скидка 5%");
            System.out.println("Ваша сумма с учетом скидки:" + (String.format("%10.2f", j)) + " $");
        }
    } // программа неправильно считает дробную часть

    private static void Example_1h() {
     /*   Написать программу которая вычисляет частное двух чисел.
          Программа должна проверять правильность введенных пользователем данных и,
          если они неверные (делитель равен нулю), выдавать сообщение об ошибке.


          Как добавить проверку - если число, введенное с клавиатуры - не число, а буква, либо знак?
          if (scanner.nextInt()contains("[a-zA-Z]+"))
            else {
        System.out.println("Некорректно введенные данные");
    }*/

        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        if (denominator == 0) {
            System.out.println("На 0 делить нельзя, в школе не учили?");
        } else {
            System.out.println("numerator/denominator = " + (numerator / denominator));
        }

    }

    private static void Example_95() {
       /* Определить, является ли заданное шестизначное число счастливым. (Счастливым называют такое
        шестизначное число, у которого сумма его первых трех цифр равна сумме его последних трех цифр.)*/

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 99999 && n < 1000000) {
            int one = n % 10;
            int tens = n % 100 / 10;
            int hundreds = n % 1000 / 100;
            int thousands = n % 10000 / 1000;
            int tenThousands = n % 100000 / 10000;
            int hundredsThousands = n / 100000;
            if ((one + tens + hundreds) == (thousands + tenThousands + hundredsThousands)) {
                System.out.println("Щасливый билет!");
            } else {
                System.out.println("Упс, не в этот раз");
            }
        } else {
            System.out.println("Число не 6-значное");
        }
    }

    private static void Example_6() {
//        Известны две скорости: одна в километрах в час, другая — в метрах в секунду. Какая из скоростей больше?

        float speedKilometers = 6.5f, speedMeters = 1.8f + 0.0055556297f;
        float km2ms = speedKilometers * 1000 / 3600;
        if (km2ms > speedMeters) {
            System.out.println("kMs > Ms by " + (km2ms - speedMeters));
        } else if (km2ms < speedMeters) {
            System.out.println("kMs < Ms by " + (speedMeters - km2ms));
        } else
            System.out.println("kMs = Ms");
    }

    private static void Example_Art() {
        System.out.println("  @..@");
        System.out.println(" (----)");
        System.out.println("( >__< )");
        System.out.println("^^ ~~ ^^");

        System.out.println("/\\__/\\");
        System.out.println("(=^*^=)");
        System.out.println(" (\")(\")_/");
    }

    private static void Example_1x() {
        int m = 13;
        int n = 5;
        float c = m / n;
        float d = (float) m / n;

        System.out.println(String.format("%10.5f", d));
        if (d > 0) //неправильное условие. как написать - если после запятой допустим 5 знаком больше 0, то...
        {
            System.out.println("c =" + c); // как вывести число с несколькими знаками после запятой?
            System.out.println(d - c); // выводим дробную часть на экран (чисто для себя)
        } else {
            System.out.println("m на n нацело делится");
        }
    }

    private static void Example_7() {
//        Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

        byte radiusCircle = 5;
        byte sideSquare = 10;
        double areaCircle = Math.PI * (radiusCircle * radiusCircle);
        double areaSquare = sideSquare * sideSquare;
        System.out.println("areaCircle = " + areaCircle);
        System.out.println("areaSquare = " + areaSquare);
        if (areaCircle > areaSquare) {
            System.out.println(System.lineSeparator() + "Площадь круга больше пллощади квадрата");
        } else if (areaCircle < areaSquare) {
            System.out.println(System.lineSeparator() + "Площадь квадрата больше пллощади круга");
        } else {
            System.out.println(System.lineSeparator() + "Площадь квадрата = пллощади круга");
        }


    }

    private static void Example_1() {
        /*Если целое число m делится нацело на целое число n, то вывести на экран частное от деления, в противном
        случае вывести сообщение «m на n нацело не делится».*/

        byte m = 12;
        byte n = 6;
        float x = m / n;
        if (m % n == 0) {
            System.out.println(x);
        } else {
            System.out.println("m на n нацело не делиться");
        }


        // как записать - если в числе, которое получиться в результате деления m / n
        // после запятой есть только 0, то вывести результат на экран?

    }

    private static void Example_2() {
       /* Написать программу для проверки знания даты основания Одессы. В случае неправильного ответа
       пользователя, программа должна выводить правильный ответ. Ниже приведён возможный вид
       экрана во время выполнения такой программы.
        В каком году была основана Одесса?
        -> 1795
        Вы ошиблись, Одесса была основана в 1794 году.*/

        System.out.println("В каком году была основана Одесса?");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1794: {
                System.out.println("Поздравляю, правильный ответ!");
                break;
            }
            default: {
                System.out.println("Вы ошиблись, Одесса была основана в 1794 году.");
                break;
            }
        }
    }
}