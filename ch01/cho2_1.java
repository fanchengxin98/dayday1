package ch01;

import java.util.Scanner;

public class cho2_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学员成绩：");
        int gra = sc.nextInt();




        if(gra == 100){
            int i1 = 65;
            char c1 = (char)i1;
            System.out.println("成绩级别为："+c1);
        }
        if(90<=gra&gra<=99 ){
            int i2 = 66;
            char c2 = (char)i2;
            System.out.println("成绩级别为："+c2);
        }
        if(80<=gra&gra<=89 ){
            int i3 = 67;
            char c3 = (char)i3;
            System.out.println("成绩级别为："+c3);
        }
        if(70<=gra&gra<=79 ){
            int i4 = 68;
            char c4 = (char)i4;
            System.out.println("成绩级别为："+c4);
        }
        if(60<=gra&gra<=69 ){
            int i5 = 69;
            char c5 = (char)i5;
            System.out.println("成绩级别为："+c5);
        }
        if(gra<=60){


            System.out.println("成绩级别为：不合格");
        }
    }
}
