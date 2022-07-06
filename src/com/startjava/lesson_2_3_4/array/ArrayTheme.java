package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public void output(int arrayLenght, int[] array) {
        System.out.print("Array values: ");
        for(int i = 0; i < arrayLenght; i++) {
            System.out.print(array[i] + " ");
            if(array[i] == array[array.length - 1]) {
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        ArrayTheme arrays = new ArrayTheme();

        int arrayLength;

        System.out.println("1. Реверс значений массива");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        arrayLength = numbers.length;

        //Source array output
        arrays.output(arrayLength, numbers);

        //Array reversing
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = numbers[i];
            numbers[i] = temp;
        }

        //Reversed array output
        arrays.output(arrayLength, numbers);

        System.out.println("2. Вывод произведения элементов массива");

        int[] numbers1 = new int[10];
        arrayLength = numbers1.length;

        //Filling an array with values
        for(int i = 0; i < arrayLength; i++) {
            numbers1[i] += i;
        }

        //Array output
        arrays.output(arrayLength, numbers1);

        //Array values multiplying
        int mult = 1;
        for(int i = 0; i < arrayLength; i++) {
            mult *= (i == 0 || i == 9) ? 1 : numbers1[i];
        }

        //Printing results
        System.out.println("Result of multiplying array values = " + mult);
        System.out.println(numbers1[0] + " has index " + 0 + "\n" + numbers1[9] + " has index " + 9 + "\n");

        System.out.println("3. Удаление элементов массива");

        float[] floatNumbers = new float[15];
        arrayLength = floatNumbers.length;

        //Filling array with float values [0,1)
        for(int i = 0; i < arrayLength; i++) {
            floatNumbers[i] = (float) Math.random();
        }

        //Array output
        System.out.print("Array floatNumbers values: ");
        for(float floatNumber : floatNumbers) {
            System.out.print(floatNumber + " ");
            if(floatNumber == floatNumbers[arrayLength - 1]) {
                System.out.print("\n");
            }
        }

        //Rewriting values that above value in the middle of array
        int counter = 0;
        for(int i = 0; i < arrayLength; i++) {
            if(floatNumbers[i] > floatNumbers[arrayLength / 2]) {
                floatNumbers[i] = 0;
                counter++;
            }
        }

        //Rewritten array output + counter value
        System.out.print("Rewritten array floatNumbers values: ");
        for(float floatNumber : floatNumbers) {
            System.out.print(floatNumber + " ");
        }
        System.out.println("\nRewritten values: " + counter + "\n");

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");

        char[] letters = new char[26];
        arrayLength = letters.length;

        //Filling array with A...Z
        char sign = 65;
        for(int i = 0; i < arrayLength; i++) {
            letters[i] = sign;
            sign++;
        }

        //Array output
        System.out.print("Array letters values: ");
        for(char letter : letters) {
            System.out.print(letter + " ");
            if(letter == letters[arrayLength - 1]) {
                System.out.print("\n");
            }
        }

        //Output of reversed array in ladder format
        System.out.println("Output of reversed array letters in ladder format");
        String concat = "";
        for(int i = arrayLength - 1; i >= 0; i--) {
            concat += letters[i];
            System.out.println(concat);
            if(i == 0) {
                System.out.print("\n");
            }
        }

        System.out.println("5. Генерация уникальных чисел");

        int[] randomNumbers = new int[30];
        arrayLength = randomNumbers.length;

        //Filling array with unique random numbers
        for(int i = 0; i < arrayLength; i++) {
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
        arrays.output(30, randomNumbers);

        //Sorting array
        for(int i = arrayLength - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(randomNumbers[j] < randomNumbers[j + 1]) {
                    int tempNumber = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = tempNumber;
                }
            }
        }

        //Sorted array output 10 values per line
        for(int i = 0; i < arrayLength; i++) {
            if(i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
