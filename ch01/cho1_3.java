package ch01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class cho1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的性别：");
        String sex = scanner.next();
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入您的身高：");
        int tool = scanner.nextInt();

        if((sex.equals("男"))&&(20<=age&age<=26)&&(170<=tool)) {
            System.out.println("可以入伍");

        }
        else if((sex.equals("女"))&&(20<=age&age<=22)&&(162<=tool)) {
            System.out.println("可以入伍");
        }
        else {
            System.out.println("不予录取");
        }
    }
}
