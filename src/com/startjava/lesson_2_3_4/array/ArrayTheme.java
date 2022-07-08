package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void printInts(int[] intArr) {
        System.out.print("Array values: ");
        for(int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printFloats(float[] floatArr) {
        System.out.print("Array values: ");
        for(float floatNum : floatArr) {
            System.out.print(floatNum + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int len;

        System.out.println("1. Реверс значений массива");

        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        len = intArr.length;

        //Source array output
        printInts(intArr);

        //Array reversing
        for (int i = 0; i < len / 2; i++) {
            int temp = intArr[len - i - 1];
            intArr[len - i - 1] = intArr[i];
            intArr[i] = temp;
        }

        //Reversed array output
        printInts(intArr);

        System.out.println("2. Вывод произведения элементов массива");

        int[] intArr1 = new int[10];
        len = intArr1.length;

        //Filling an array with values
        for(int i = 0; i < len; i++) {
            intArr1[i] = i;
        }

        //Array output
        printInts(intArr1);

        //Array values multiplying
        int mult = 1;
        for(int i = 1; i < len - 1; i++) {
            mult *= intArr1[i];
        }

        //Printing results
        System.out.println("Result of multiplying array values = " + mult);
        System.out.println(intArr1[0] + " has index " + 0 + "\n" + intArr1[9] + " has index " + 9 + "\n");

        System.out.println("3. Удаление элементов массива");

        float[] floatArr = new float[15];
        len = floatArr.length;

        //Filling array with float values [0,1)
        for(int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }

        //Array output
        printFloats(floatArr);

        //Rewriting values that above value in the middle of array
        int counter = 0;
        for(int i = 0; i < len; i++) {
            if(floatArr[i] > floatArr[len / 2]) {
                floatArr[i] = 0;
                counter++;
            }
        }

        //Rewritten array output + counter value
        printFloats(floatArr);
        System.out.println("\nRewritten values: " + counter + "\n");

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");

        char[] letters = new char[26];
        len = letters.length;

        //Filling array with A...Z
        char sign = 65;
        for(int i = 0; i < len; i++) {
            letters[i] = sign;
            sign++;
        }

        //Array output
        System.out.print("Array letters values: ");
        for(char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();

        //Output of reversed array in ladder format
        System.out.println("Output of reversed array letters in ladder format");
        String concat = "";
        for(int i = len - 1; i >= 0; i--) {
            concat += letters[i];
            System.out.println(concat);
        }
        System.out.println();

        System.out.println("5. Генерация уникальных чисел");

        int[] randomNumbers = new int[30];
        len = randomNumbers.length;

        //Filling array with unique random numbers
        for(int i = 0; i < len; i++) {
            int candidateNumber = (int) (Math.random() * (40 + 1)) + 60;
            int j = 0;
            do {
                if(candidateNumber != randomNumbers[j]) {
                    randomNumbers[i] = candidateNumber;
                } else {
                    i--;
                    break;
                }
                j++;
            } while(j < i);
        }

        //Array output
        printInts(randomNumbers);

        //Sorting array
        for(int i = len - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(randomNumbers[j] < randomNumbers[j + 1]) {
                    int tempNumber = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = tempNumber;
                }
            }
        }

        //Sorted array output 10 values per line
        for(int i = 0; i < len; i++) {
            if(i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
