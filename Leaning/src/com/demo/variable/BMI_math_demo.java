package com.demo.variable;

import java.util.Scanner;


public class BMI_math_demo {
    public static void main(String[] args) {
        /* BMI = weight / (height * height)
         BMI < 18.5: 身体状态：消瘦；健康风险：部分增加；
         18.5 <= BMI < 23.9: 身体状态：正常；健康风险：正常；
         24.0 <= BMI < 26.9: 身体状态：偏胖；健康风险：增加；
         27.0 <= BMI < 29.9: 身体状态：肥胖；健康风险：中度增加；
         BMI >= 30: 身体状态：严重肥胖；健康风险：严重增加；*/
        System.out.println("请输入体重：(kg)");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("请输入身高：(cm)");
        double height = new Scanner(System.in).nextDouble() / 100;
        double BMI = weight / Math.pow(height, 2);
        if (BMI < 18.5) {
            System.out.println("身体状态：消瘦；健康风险：部分增加；");
        } else if (BMI < 23.9) {
            System.out.println("身体状态：正常；健康风险：正常；");
        } else if (BMI < 26.9) {
            System.out.println("身体状态：偏胖；健康风险：增加；");
        } else if (BMI < 29.9) {
            System.out.println("身体状态：肥胖；健康风险：中度增加；");
        } else {
            System.out.println("身体状态：严重肥胖；健康风险：严重增加；");
        }
        System.out.println("请输入身高：(cm)");
        height = new Scanner(System.in).nextDouble() / 100;
        double Max_weight = 23.9 * Math.pow(height, 2);
        System.out.println("最佳的最大体重为：" + Max_weight + "kg");
    }
}
