package com.demo.variable;

import java.util.Scanner;

public class GameCharacterHealthDemo {
    public static void main(String[] args) {
        /*初始最大血量为200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
        假设游戏人物不会死亡，最少血量为1，最终人物血量为？*/
        // Question: 需要加入伤害量和恢复量的判断，即输入的伤害和恢复量是否为正数
        int maxHealth = 200;
        Scanner scanner = new Scanner(System.in);
        int damage, skillHeal;

        while (true) {
            System.out.println("请输入受到的伤害：");
            damage = scanner.nextInt();
            if (damage < 0) {
                System.out.println("输入的伤害量不能为负数，请重新输入。");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("请输入技能恢复的血量：");
            skillHeal = scanner.nextInt();
            if (skillHeal < 0) {
                System.out.println("输入的恢复量不能为负数，请重新输入。");
                continue;
            }
            break;
        }

        int finalHealth = maxHealth - damage + skillHeal;
        if (finalHealth < 1) {
            finalHealth = 1;
        }
        else if (finalHealth > maxHealth) {
            finalHealth = maxHealth;
        }
        System.out.println("最终人物血量为：" + finalHealth);
    }
}
