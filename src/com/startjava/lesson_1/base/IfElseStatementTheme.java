package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java (это название задачи)
        System.out.println("Перевод псевдокода на язык Java");

        int age = 18;
        if(age > 20) {
            System.out.println("Этот человек старше 20 лет");
        } else {
            System.out.println("Этот человек младше 20 лет");
        }

        boolean isMale = true;
        if(!isMale) {
            System.out.println("Этот человек женского пола");
        }

        double height = 1.78;
        if(height > 1.80) {
            System.out.println("Этот человек выше 180см");
        } else {
            System.out.println("Этот человек ниже 180см");
        }

        char firstNameLetter = "Ivan".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("Первая буква имени этого человека - M");
        } else if(firstNameLetter == 'I') {
            System.out.println("Первая буква имени этого человека - I");
        } else {
            System.out.println("Первая буква имени этого человека не M и не I");
        }

        //Поиск максимального и минимального числа
        System.out.println("Поиск максимального и минимального числа");

        int num1 = 17;
        int num2 = 18;

        if(num1 > num2) {
            System.out.println("Среди чисел " + num1 + " и " + num2 + " максимальным является " + num1);
        } else if(num1 < num2) {
            System.out.println("Среди чисел " + num1 + " и " + num2 + " максимальным является " + num2);
        }

        //Работа с числом
        System.out.println("Работа с числом");

        int srcNum = -34;

        if(srcNum % 2 == 0) {
            System.out.println("Число " + srcNum + " является четным");
        } else {
            System.out.println("Число " + srcNum + " является нечетным");
        }

        if(srcNum < 0) {
            System.out.println("Число " + srcNum + " является отрицательным");
        } else if(srcNum > 0) {
            System.out.println("Число " + srcNum + " является положительным");
        } else if(srcNum == 0) {
            System.out.println("Число " + srcNum + " является нулем");
        }

        //Поиск общей цифры в числах
        System.out.println("Поиск общей цифры в числах");

        int srcNum1 = 381;
        int firstNum1 = srcNum1 / 100;
        int secondNum1 = srcNum1 % 100 / 10;
        int thirdNum1 = srcNum1 % 10;
        int srcNum2 = 641;
        int firstNum2 = srcNum2 / 100;
        int secondNum2 = srcNum2 % 100 / 10;
        int thirdNum2 = srcNum2 % 10;

        if(firstNum1 == firstNum2) {
            System.out.println("У чисел " + srcNum1 + " и " + srcNum2 + " общим числом является " + firstNum1);
        } else if(secondNum1 == secondNum2) {
            System.out.println("У чисел " + srcNum1 + " и " + srcNum2 + " общим числом является " + secondNum1);
        } else if(thirdNum1 == thirdNum2) {
            System.out.println("У чисел " + srcNum1 + " и " + srcNum2 + " общим числом является " + thirdNum1);
        }

        //Определение буквы или символа по их коду
        System.out.println("Определение буквы или символа по их коду");

        char srcSign = '\u005A';

        if((srcSign >= 'A' && srcSign <= 'Z') || (srcSign >= 'a' && srcSign <= 'z') || (srcSign >= 'А' && srcSign <= 'Я') || (srcSign >= 'а' && srcSign <= 'я')) {
            System.out.println("Символ " + srcSign + " является буквой");
        } else if(srcSign >= '0' && srcSign <= '9') {
            System.out.println("Символ " + srcSign + " является цифрой");
        } else {
            System.out.println("Символ " + srcSign + " не является ни цифрой, ни буквой");
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("Определение суммы вклада и начисленных банком %");

        int depositAmount = 300_000;
        int interest = 0;
        int totalAmount;

        System.out.println("Сумма вклада равна " + depositAmount);

        if(depositAmount < 100_000) {
            System.out.println("Начисленный процент равен " + (interest = 5) + "%");
        } else if(depositAmount >= 100_000 & depositAmount <= 300_000) {
            System.out.println("Начисленный процент равен " + (interest = 7) + "%");
        } else if(depositAmount > 300_000) {
            System.out.println("Начисленный процент равен " + (interest = 10) + "%");
        }

        totalAmount = depositAmount - depositAmount * interest / 100;
        System.out.println("Итоговая сумма вместе с начисленными процентами равна " + totalAmount);

        //Определение оценки по предметам
        System.out.println("Определение оценки по предметам");

        int scorePercentHistory = 59;
        int scorePercentProgramming = 91;
        double scorePercentAverage = (scorePercentHistory + scorePercentProgramming) / 2;
        int scoreNumberHistory;
        int scoreNumberProgramming;
        double scoreNumberAverage;

        if(scorePercentHistory <= 60) {
            scoreNumberHistory = 2;
        } else if(scorePercentHistory > 60 & scorePercentHistory <= 73) {
            scoreNumberHistory = 3;
        } else if(scorePercentHistory > 73 & scorePercentHistory <= 91) {
            scoreNumberHistory = 4;
        } else {
            scoreNumberHistory = 5;
        }

        if(scorePercentProgramming <= 60) {
            scoreNumberProgramming = 2;
        } else if(scorePercentProgramming > 60 & scorePercentProgramming <= 73) {
            scoreNumberProgramming = 3;
        } else if(scorePercentProgramming > 73 & scorePercentProgramming <= 91) {
            scoreNumberProgramming = 4;
        } else {
            scoreNumberProgramming = 5;
        }

        System.out.println("История " + scoreNumberHistory);
        System.out.println("Программирование "+ scoreNumberProgramming);
        scoreNumberAverage = (scoreNumberHistory + scoreNumberProgramming) / 2;
        System.out.println("Средний балл оценок по предметам " + scoreNumberAverage);
        System.out.println("Средний % по предметам " + scorePercentAverage);

        //Расчет прибыли (убытка)
        System.out.println("Расчет прибыли (убытка)");

        int rentAmount = 5000;
        int incomeAmount = 15000;
        int costPrice = 9000;
        int yearlyNetProfit = (incomeAmount - costPrice - rentAmount) * 12;

        if(yearlyNetProfit < 0) {
            System.out.println("Годовой убыток составил -" + yearlyNetProfit);
        } else {
            System.out.println("Годовая прибыль составила +" + yearlyNetProfit);
        }

        //Определение существования треугольника
        System.out.println("Определение существования треугольника");

        double sideX = 5;
        double sideY = 5;
        double sideZ = 7;
        int cornerDegree = 90;

        if((sideX + sideY > sideZ) || (sideX + sideZ > sideY) || (sideY + sideZ > sideX)) {
            System.out.println("Такой треугольник существует");

            /*
            Площадь треугольника по трём сторонам и полупериметру
            double halfPerimeter = (sideX + sideY + sideZ) / 2;
            double squareRoot = halfPerimeter * (halfPerimeter - sideX) * (halfPerimeter - sideY) * (halfPerimeter - sideZ);

            System.out.println("Квадратный корень данного треугольника равен " + squareRoot);

            double square = squareRoot / 2;
            double tempValue;

            do {
                tempValue = square;
                square = (tempValue + (squareRoot / tempValue)) / 2;
            } while ((tempValue - square) != 0);
            System.out.println("Площадь данного треугольника = " + square);
            System.out.println("Проверяем, что вычисления верны. square * square = " + (square * square));
            */

            //Площадь прямоугольного треугольника по двум катетам
            double square = (sideX * sideY) / 2;

            System.out.println("Площадь данного треуольника = " + square);
        } else {
            System.out.println("Такой треугольник не существует");
        }

        //Подсчет количества банкнот
        System.out.println("Подсчет количества банкнот");

        int totalSum = 567;
        int countNom50;
        int countNom10;
        int countNom1;
        int reverseCalculation;

        countNom50 = totalSum / 50;
        countNom10 = totalSum % 50 / 10;
        countNom1 = totalSum % 10;
        reverseCalculation = countNom50 * 50 + countNom10 * 10 + countNom1 * 1;

        System.out.println("Исходная сумма равна " + reverseCalculation);
        System.out.println("Количество банкнот номиналом 50 = " + countNom50);
        System.out.println("Количество банкнот номиналом 10 = " + countNom10);
        System.out.println("Количество банкнот номиналом 1 = " + countNom1);
    }
}