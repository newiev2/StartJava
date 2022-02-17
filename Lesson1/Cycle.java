class Cycle {
    public static void main(String[] args) {
        //Вывод на консоль всех чисел от 0 до 20 с помощью цикла for
        System.out.println("Вывод на консоль всех чисел от 0 до 20 с помощью цикла for");

        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        //Вывод на консоль всех чисел от 6 до -6 с помощью цикла while (с шагом итерации 2)
        System.out.println("Вывод на консоль всех чисел от 6 до -6 с помощью цикла while (с шагом итерации 2)");

        int num = 6;
        while(num >= -6) {
            System.out.println(num);
            num -= 2;
        }

        //Вывод количества нечетных чисел от 10 до 20 с помощью цикла do while
        System.out.println("Вывод суммы нечетных чисел от 10 до 20 с помощью цикла do while");

        int j = 10;
        int sumOddNums = 0;

        do {
            if(j % 2 != 0) {
                sumOddNums = sumOddNums + j;
            }
            j++;
        } while(j <= 20);

        System.out.println("Сумма нечетных чисел в дипазаоне от 10 до 20 равна " + sumOddNums);
    }
}