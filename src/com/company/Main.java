package com.company;


import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    // Задание 1, 2 , 3 (sum, max, min)
        int sum = 0;
        int maxSumOfDay = arr[0];
        int minSumOfDay = arr[0];
        final int[]SumOfDay1 = arr;
        final int[]minSumOfDay1 = arr;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (arr[i] > maxSumOfDay) {
                maxSumOfDay = SumOfDay1[i];
            }
            if (arr[i] < minSumOfDay) {
                minSumOfDay = arr[i];
            }

        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxSumOfDay + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minSumOfDay + " рублей.");

        double average;
        average = (double)sum /30;
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String averageResult = decimalFormat.format(average);
        System.out.println("Средняя сумма трат за месяц составила " +  averageResult + " рублей». ");

        // Задание 4.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String[] array = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;

        }

    //    System.out.printf(Arrays.toString(reverseFullName));
        System.out.printf("ФИО " + String.valueOf(reverseFullName));
    }


      public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}
















