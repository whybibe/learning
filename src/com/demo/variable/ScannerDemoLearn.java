package com.demo.variable;

import java.util.Scanner;

public class ScannerDemoLearn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("你输入的整数数字是：" + number);
        double number2 = scanner.nextDouble();
        System.out.println("你输入的小数数字是：" + number2);
        String string = scanner.next();
        System.out.println("你输入的字符串是：" + string);
        scanner.close();
    }
}
