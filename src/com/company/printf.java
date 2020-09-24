package com.company;

import java.io.File;

public class printf {
    public static void main(String[] args) {
        File F=new File("E:\\untitled5异常处理");
        method1(F);
    }
    public  static  void method(File file) {
        if (file.isDirectory()) {
            File[] f = file.listFiles();
            for (File q : f
            ) {
                if(q.isFile()) {
                    if (q.getName().endsWith(".java")) {
                        System.out.println(q.getName());
                    }
                }
            }
        }
    }
    //输出指定目录下的java文件名
    public  static  void method1(File file){
        if (file.isDirectory()) {//判断他是不是一个文件夹
            File[] f = file.listFiles();
            for (File q : f
            ) {
                if(!q.isDirectory()) {// 说明下面没有文件了只有他自己
                    if (q.getName().endsWith(".java")) {
                        System.out.println(q.getName());
                    }
                }
                else //说明是目录说明下面还有文件
                {
                    method1(q);
                }
            }
        }
    }
}
