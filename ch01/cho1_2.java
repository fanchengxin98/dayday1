package ch01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class cho1_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入您的订票日期：");
        float d = scanner.nextFloat();
        System.out.println("请输入您的票价：");
        float p = scanner.nextFloat();


        if((1.01<=d&d<=1.03) &&(5.01<=d&d<=5.03) &&(10.01<=d&d<=10.07) ){

            System.out.println("您的票价为："+p);
        }
        else{
            float s = 0.0f;
            s = 0.8f*p;
            System.out.println("您的票价为:"+s);

        }

    }
}
