package com.demo.variable;

import java.util.Scanner;

public class ClockSplittingDemo {
    // 输入总秒数，拆分成时、分、秒
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入总秒数：");
        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds % 3600 / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + "小时" + minutes + "分" + seconds + "秒");
    }
}
