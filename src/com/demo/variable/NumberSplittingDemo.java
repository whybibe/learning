package com.demo.variable;

import java.util.Scanner;

public class NumberSplittingDemo {
    public static void main(String[] args) {
        // 输入一个整数，输出该整数的每一位数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = scanner.nextInt();
        int number1 = number;
        int number2 = number;
        System.out.println("该整数的每一位数字的倒序是：");
        while (number1 > 0) {
            int digit = number1 % 10;
            System.out.println(digit);
            number1 = number1 / 10;
        }
        System.out.println("该整数的每一位数字的正序是：");
        int numberCount = 0;
        while (number2 > 0) {
            numberCount++;
            number2 = number2 / 10;
        }
        number2 = number;
        while (number2 > 0) {
            int digit =  number2 / (int) Math.pow(10, numberCount - 1);
            System.out.println(digit);
            number2 = number2 - digit * (int) Math.pow(10, numberCount - 1);
            numberCount--;
        }
    }
}
