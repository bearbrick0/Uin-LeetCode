package com.uin.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //System.out.println(test1());
//        System.out.println(test2());
        test3();
    }

    public static String test1() {
        // 从键盘接收数据
        Scanner in = new Scanner(System.in);
        String str1 = null;
        // 判断是否还有输入
        if (in.hasNext()) {
            str1 = in.next();
            System.out.println("输入的数据为：" + str1);
        }
        in.close();
        return str1;
    }

    public static String test2() {
        Scanner in = new Scanner(System.in);
        String str = null;
        if (in.hasNextLine()) {
            str = in.nextLine();
        }
        return str;
    }

    public static void test3() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}
