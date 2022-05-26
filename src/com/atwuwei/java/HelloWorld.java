package com.atwuwei.java;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class HelloWorld {
    public static  void  main(String[] args){


        System.out.println("hello world.");

        System.out.println("hello,nongfushanquan.");


        System.err.println("oops.err!!");

        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args);

        int a=0;
        System.out.println("a = " + a);
        System.out.println(args);


        var arr =new ArrayList<String>();
        arr.add("lilei");
        arr.add("zhangsan");
        arr.add("liuyifei");

        for (String s : arr) {
            System.out.println(s);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("i = " + i);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
            System.out.println("args = " + Arrays.deepToString(args));
        }

        if (arr == null) {


        }

        if (arr != null) {

        }

        if (arr != null) {

        }

        if (arr == null) {

        }

        if (arr != null) {

        }
    }

     
}


