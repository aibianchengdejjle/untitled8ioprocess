package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File f0=new File("a.txt");
        f0.createNewFile();
        System.out.println(f0.delete());// delete不管是文件还是文件夹都是要删除的
        //创建一个文件夹
        /*File f=new File("B");
        System.out.println(f.mkdir());
        */
       /* 不要被fire里面的名字所混淆，创建什么样类型的文件要看对象的具体操作
        File f2=new File("C.TXT");
        System.out.println(f2.mkdir());
        */



    }
}
