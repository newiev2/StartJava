public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("Создание переменных и вывод их значений на консоль");
        byte cpuThreadsNumber = 4;
        short ram = 16;
        int screenWidth = 1920;
        long screenHeight = 1080;
        float cpuFrequency = 2.40F;
        double ssdVolume = 240.8;
        char systemDriveSign = 'C';
        boolean isForGaming = false;

        System.out.println("Количество ядер CPU: " + cpuThreadsNumber);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Ширина экрана: " + screenWidth);
        System.out.println("Высота экрана: " + screenHeight);
        System.out.println("Частота процессора: " + cpuFrequency);
        System.out.println("Объем SSD: " + ssdVolume);
        System.out.println("Обозначение системного диска: " + systemDriveSign);
        System.out.println("Комьютер для гейминга: " + isForGaming);

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");

        int priceX = 100;
        int priceY = 200;
        double discountAmount = (priceX + priceY) * 0.11;
        double discountedTotalPrice = priceX + priceY - discountAmount;

        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая сумма X и Y с учетом скидки: " + discountedTotalPrice);

        //Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");

        //Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");

        byte maxByteValue = 127;
        short maxShortValue = 32767;
        int maxIntValue = 2_147_483_647;
        long maxLongValue = 9_223_372_036_854_775_807L;

        System.out.println("Максимальное значение byte: " + ++maxByteValue);
        System.out.println("Максимальное значение short: " + ++maxShortValue);
        System.out.println("Максимальное значение int: " + ++maxIntValue);
        System.out.println("МаксИмальное значение long: " + ++maxLongValue);

        System.out.println("Инкремент byte: " + maxByteValue);
        System.out.println("Инкремент short: " + maxShortValue);
        System.out.println("Инкремент int: " + maxIntValue);
        System.out.println("Инкремент long: " + maxLongValue);

        System.out.println("Декремент byte: " + --maxByteValue);
        System.out.println("Декремент short: " + --maxShortValue);
        System.out.println("Декремент int: " + --maxIntValue);
        System.out.println("Декремент long: " + --maxLongValue);
        
        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");

        double num1 = 3.25;
        double num2 = 6.75;
        double tempNum;

        System.out.println("Значение переменной num1: " + num1);
        System.out.println("Значение переменной num2: " + num2);

        tempNum = num1;
        num1 = num2;
        num2 = tempNum;

        System.out.println("Значение переменной num1 теперь: " + num1);
        System.out.println("Значение переменной num2 теперь: " + num2);

        //Вывод ASCII-символов и их кодов
        System.out.println("Вывод ASCII-символов и их кодов");

        int int1 = 35;
        int int2 = 38;
        int int3 = 64;
        int int4 = 94;
        int int5 = 95;

        System.out.println(int1 + " " + (char) int1);
        System.out.println(int2 + " " + (char) int2);
        System.out.println(int3 + " " + (char) int3);
        System.out.println(int4 + " " + (char) int4);
        System.out.println(int5 + " " + (char) int5);

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");

        int srcNum = 345;
        int firstNum = srcNum / 100;
        int secondNum = srcNum % 100 / 10;
        int thirdNum = srcNum % 10;
        int sumOfNum = firstNum + secondNum + thirdNum;
        int multiplicationOfNum = firstNum * secondNum * thirdNum;

        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);
        System.out.println("Сумма цифр числа 345: " + sumOfNum);
        System.out.println("Произведение цифр числа 345: " + multiplicationOfNum);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");

        char signSlash = '/';
        char signBackSlash = 92;
        char signUnderscore = '_';
        char signRoundBracket = '(';
        char signBackRoundBracket = ')';
        char signSpace = ' ';

        System.out.println("" + signSpace + signSpace + signSpace + signSpace + signSlash + signBackSlash + signSpace + signSpace + signSpace + signSpace + "");
        System.out.println("" + signSpace + signSpace + signSpace + signSlash + signSpace + signSpace + signBackSlash+ "");
        System.out.println("" + signSpace + signSpace + signSlash + signUnderscore + signRoundBracket + signSpace + signBackRoundBracket + signBackSlash + signSpace + signSpace + signSpace + "");
        System.out.println("" + signSpace + signSlash + signSpace + signSpace + signSpace + signSpace + signSpace + signSpace + signBackSlash + "");
        System.out.println("" + signSlash + signUnderscore + signUnderscore + signUnderscore + signUnderscore + signSlash + signBackSlash + signUnderscore + signUnderscore + signBackSlash + "");

        //Отображение сотен, десятков, единиц числа
        System.out.println("Отображение сотен, десятков, единиц числа");

        int someNum1 = 123;
        int hundreds = someNum1 / 100;
        int tens = someNum1 % 100 / 10;
        int units = someNum1 % 10;

        System.out.println("Количество сотен в числе 123: " + hundreds);
        System.out.println("Количество десятков в числе 123: " + tens);
        System.out.println("Количество единиц в числе 123: " + units);

        //Преобразование секунд
        System.out.println("Преобразование секунд");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;

        System.out.println("Всего секунд: " + totalSeconds);
        System.out.println("Время в формате ЧЧ:ММ:СС: " + hours + ":" + minutes + ":" + seconds);

        int a = 345;

    }
}