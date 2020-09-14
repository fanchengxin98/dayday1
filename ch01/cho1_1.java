package ch01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class cho1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();

        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
        System.out.println("请输入运算符：");
        String str = scanner.next();

        int c = 0;

        if(str.equals("+")){
            c = a+b;

        }
        else if(str.equals("*")){
            c = a*b;

        }
        else if(str.equals("/")){
            c = a/b;

        }
        else if(str.equals("-")){
            c = a-b;

        }
        System.out.println("运算结果："+c);

    }




}



