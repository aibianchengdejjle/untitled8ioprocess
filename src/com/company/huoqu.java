package com.company;
/*
*      获取功能
*
* */
import java.io.File;
import java.io.IOException;

public class huoqu {
    public static void main(String[] args) throws IOException {


    }

    private static void method4() {
        //只有指向文件夹的才可以转换为数组
        File f=new File("D:\\df429c6ad79bd13ea7d7b07d0648217b");
        String []fl=f.list();
        for (int i = 0; i <fl.length ; i++) {
            System.out.println(fl[i]);
        }
    }

    private static void method1() {
        File parent=new File("b");
        File f=new File(parent,"c.txt");
        System.out.println(f.getParent());
        System.out.println(f.getParentFile());
    }

    private static void method() {
        File f=new File("D:\\a\\b.txt");
        //两个都是返回的绝对路径
        System.out.println(f.getAbsoluteFile());//这是返回的文件类型

        System.out.println(f.getAbsolutePath());//这是返回的字符串对象
    }
}
