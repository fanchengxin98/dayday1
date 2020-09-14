package ch01;

import java.util.Scanner;

public class cho3_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需打印的行数：");
        int n = scanner.nextInt();



        for(int i=1;i<=n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }

            for(int m=0;m<2*i-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}


