package com.company;

import java.io.File;

public class delete {
    public static void main(String[] args) {
        File f=new File("E:\\pratice");
        method(f);
    }
    public  static  void method(File f){
        if(f.isDirectory())  // 看他是不是文件夹
        {
            File []a=f.listFiles();
            for (File q:a
                 ) {
                if (q.isFile()) { //是不是文件，如果下面没有东西直接删除，有的话直接跳转到else语句
                    if (q.getName().endsWith(".txt")) {
                        System.out.println(q.getName());
                        q.delete();
                    }
                }
                else {
                    method(q);
                }
            }
        }
    }
}
