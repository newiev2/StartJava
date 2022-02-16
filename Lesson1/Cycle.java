class Cycle {
    public static void main(String[] args) {
        //Вывод на консоль всех чисел от 0 до 20 с помощью цикла for
        System.out.println("Вывод на консоль всех чисел от 0 до 20 с помощью цикла for");

        for( int i = 0; i <= 20; i++) {
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
        System.out.println("Вывод количества нечетных чисел от 10 до 20 с помощью цикла do while");

        int counter = 0;
        int j = 10;

        do {
            if(j % 2 != 0) {
                counter++;
            }
            j++;
        } while(j <= 20);

        System.out.println("Количество нечетных чисел в дипазаоне от 10 до 20 равно " + counter);
    }
}