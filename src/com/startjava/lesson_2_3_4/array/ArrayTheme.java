package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;

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
        System.out.println();

        System.out.println("2. Вывод произведения элементов массива");

        intArr = new int[10];
        len = intArr.length;

        //Filling an array with values
        for(int i = 0; i < len; i++) {
            intArr[i] = i;
        }

        //Array output
        printInts(intArr);

        //Array values multiplying
        int mult = 1;
        for(int i = 2; i < len - 1; i++) {
            mult *= intArr[i];
        }

        //Printing results
        System.out.println("Result of multiplying array values = " + mult);
        System.out.println(intArr[0] + " has index " + 0 + "\n" + intArr[9] + " has index " + 9 + "\n");

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
        System.out.println("Rewritten values: " + counter + "\n");

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");

        char[] letters = new char[26];
        len = letters.length;

        //Filling array with A...Z
        char sign = 65;
        for(int i = 0; i < len; i++) {
            letters[i] = sign++;
        }

        //Array output
        System.out.print("Array letters values: ");
        for(char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();

        //Output of reversed array in ladder format
        System.out.println("Output of reversed array letters in ladder format");
        String line = "";
        for(int i = len - 1; i >= 0; i--) {
            System.out.println(line += letters[i]);
        }
        System.out.println();

        System.out.println("5. Генерация уникальных чисел");

        intArr = new int[30];
        len = intArr.length;
        int candidateNumber;

        //Filling array with unique random numbers
        for(int i = 0; i < len; i++) {
            candidateNumber = (int) (Math.random() * (40 + 1)) + 60;
            for(int number : intArr) {
                if(number == candidateNumber) {
                    candidateNumber = -1;
                    i--;
                    break;
                }
            }
            if(candidateNumber != -1) {
                intArr[i] = candidateNumber;
            }
        }

        //Array output
        printInts(intArr);

        //Sorting array
        for(int i = len - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(intArr[j] < intArr[j + 1]) {
                    int tempNumber = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tempNumber;
                }
            }
        }

        //Sorted array output 10 values per line
        for(int i = 0; i < len; i++) {
            if(i % 10 == 0) {
                System.out.println();
            }
            System.out.print(intArr[i] + " ");
        }
        System.out.println("\n");

        System.out.println("6. Сдвиг элементов массива");

        String[] stringArr = new String[]{"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = stringArr.length;

        //Array output
        printStrings(stringArr);

        //Calculating length for new array
        int newLen = 0;
        for(String string : stringArr) {
            if(!string.isBlank()) {
                newLen++;
            }
        }

        String[] newStringArr = new String[newLen];
        counter = 1;
        int destIndex = 0;
        int srcIndex = 0;

        //Copying only not blank strings from source array to new array
        for(int i = 0; i < len; i++) {
            if(!stringArr[i].isBlank()) {
                srcIndex = i;
                if(i < stringArr.length - 1) {
                    for(int j = i + 1; j < stringArr.length; j++) {
                        if(stringArr[j].isBlank()) {
                            break;
                        }
                        counter++;
                    }
                }
                System.arraycopy(stringArr, srcIndex, newStringArr, destIndex, counter);
                destIndex += counter;
                i += counter;
                counter = 1;
            }
        }

        //New array output
        printStrings(newStringArr);
    }

    private static void printInts(int[] intArr) {
        System.out.print("Array values: ");
        for(int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printFloats(float[] floatArr) {
        System.out.print("Array values: ");
        for(float num : floatArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printStrings(String[] stringArr) {
        System.out.print("Array values: ");
        for(String string : stringArr) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
