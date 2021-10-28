package cn.tedu.jjclub;

import java.util.Scanner;

/**
 * @Date:2021/10/28 14:41
 * @Author:NANDI_GUO
 */
public class TrueMan { //真男人就填名字
    String s = null;
    public String op(int a){
        switch (a){
            case 0:s = "男帝";break;
            case 1:s = "一郎";break;//郎
            case 2:s = "小明";break;
            case 3:s = "云山";break;
            case 4:s = "空";break;
            case 5:s = "空";break;
            case 6:s = "空";break;
            case 7:s = "空";break;
        }
        return s;
    }
}
