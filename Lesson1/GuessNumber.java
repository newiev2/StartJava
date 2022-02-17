public class GuessNumber {
    public static void main(String[] args) {
        //Игра "Угадай число!". Введите любое число в диапазоне от 0 до 100 с клавиатуры. Если ввёденное число будет равнятся запрограммированному компьютером числу, вы выиграли
        System.out.println("Игра 'Угадай число!'. Если угаданное число будет равнятся запрограммированному компьютером числу, вы выиграли");

        byte computedNum = 17;
        byte tryNum = 5;

        System.out.println("Загаданное число: " + tryNum);

        do {
            if((tryNum > 100) || (computedNum > 100)) {
                System.out.println("К сожалению, одно из чисел вышло за пределы диапазона. Попытайтесь угадать снова");
                computedNum = 17;
                tryNum = 5;
            } else if(tryNum > computedNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            tryNum += 3;
            System.out.println("Вы загадали новое число: " + tryNum);
        } while(tryNum != computedNum);

        //Число угадано. Выход из цикла с сообщением о победе в игре
        System.out.println("Поздравляю, число угадано!");
    }
}