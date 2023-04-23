package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int arr1[] = {1, 2, 10, -2, -1, 1, 3, 5, -3, -1, 0};
        int arr2[] = {1, 2, 10, 2, 1, 1, 3, 5, 3, 1, 0};
        int arr3[] = {-1, -2, -10, -2, -1, -1, -3, -5, -3, -1, 0};
        System.out.println("Дана последовательность целых чисел, оканчивающаяся нулем.");
        printArr(arr3);
        System.out.println("Найти сумму положительных чисел, после которых следует отрицательное число.");
        sumPosNum(arr3);

        String str = "  Лёша  на  полке    клопа    нашёл    ";
        String str1 = "Java — строго типизированный объектно-ориентированный язык программирования общего назначения";
        reverseStr(str);
    }

    private static void reverseStr(String str) {
        String[] words = new StringBuilder(str).reverse().toString().split(" ");
        String newStr = new String();
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "") {
                newStr = newStr + words[i] + " ";
            }
        }
        System.out.println(newStr);
    }

    private static void printArr(int[] arr) {
        String intArrToStr = Arrays.toString(arr);
        System.out.println(intArrToStr);
    }

    private static void sumPosNum(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 1; i < len; i++) {
            if (arr[i] < 0 && arr[i - 1] > 0) {
                count += arr[i - 1];
            }
        }
        if (count == 0) {
            System.out.println("Положительных чисел, после которых следует отрицательное число, нет.");
        } else System.out.println(count);
    }
}