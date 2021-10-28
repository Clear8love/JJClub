package cn.tedu.jjclub;

import java.text.SimpleDateFormat;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String s = sdf.format(d);
        System.out.println("北京时间："+s);
        System.out.println("兄弟们，输入0-7随便一个整数");
        int a = new Scanner(System.in).nextInt();
        TrueMan man = new TrueMan();
        System.out.println(man.op(a));
        //18838883300 冲啊
        for (int i = 0; i < 10 ; i++) {
            System.out.println(man.op(a)+"天下第一");
        }
    }
}
