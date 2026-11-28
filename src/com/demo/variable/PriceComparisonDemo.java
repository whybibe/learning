package com.demo.variable;

import java.util.Scanner;

public class PriceComparisonDemo {
    public static void main(String[] args) {
        // 饿了么全场九折，美团满30减10，输出最实惠的选择
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入原价：");
        double originalPrice = scanner.nextDouble();
        if (originalPrice > 0){
            double elmPrice = originalPrice * 0.9;
            if (originalPrice >= 30){
                double meituanPrice = originalPrice - 10;
                if (elmPrice < meituanPrice) {
                    System.out.println("饿了么更实惠,价格为：" + elmPrice);
                } else {
                    System.out.println("美团更实惠,价格为：" + meituanPrice);
                }
            }
            else {
                System.out.println("饿了么更实惠,价格为：" + elmPrice);
            }
        }
        else {
            System.out.println("输入价格有误");
        }
    }
}
