package com.demo.variable;

import java.util.Scanner;

public class CollatzFunctionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number % 2 == 0){
                System.out.println("卡拉兹函数的值为：" + (number / 2));
            }
            else {
                System.out.println("卡拉兹函数的值为：" + (number * 3 + 1));
            }
        } else {
            System.out.println("输入的不是正整数");
        }
    }
}
