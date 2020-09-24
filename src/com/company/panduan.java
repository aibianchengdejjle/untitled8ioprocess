package com.company;

import java.io.File;
import java.io.IOException;

public class panduan {
    public static void main(String[] args) throws IOException {
        //method();
        //method1();
        //method2();


    }

    private static void method2() {
        File f=new File("N.txt"); //判断是否是文件夹如果是则true，否 false；
        System.out.println(f.isDirectory());
    }

    private static void method1() {
        File f=new File("D:\\a\b.txt");
        System.out.println(f.isAbsolute());
    }

    private static void method() throws IOException {
        File f=new File("a.txt");
        f.createNewFile();
        //判断我们的文件或者文件夹是否存在
        System.out.println(f.exists());
    }
}
