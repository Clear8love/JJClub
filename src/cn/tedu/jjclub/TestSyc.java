package cn.tedu.jjclub;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @Date:2021/10/28 14:11
 * @Author:NANDI_GUO
 */
public class TestSyc {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("北京时间："+d);
        long m=18838883300L;
        System.out.println("小明随时Call："+m);
        System.out.println("兄弟们，输入0-7随便一个整数");
        int a = new Scanner(System.in).nextInt();
        TrueMan man = new TrueMan();
        System.out.println(man.op(a));

    }
}
