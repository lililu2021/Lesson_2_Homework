package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Example_1();
//        Example_2();
        //Example_10();
        //Example_7();
//        Example_1x();
//        Example_Art();

        Example_6();
        Example_95();
    }

    private static void Example_95() {
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
        }
        else
        {
            System.out.println("Число не 6-значное");
        }
    }

    private static void Example_6() {
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