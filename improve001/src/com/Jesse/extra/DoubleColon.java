package com.Jesse.extra;

import java.util.Arrays;
import java.util.List;

/**
 * @author （SunJian）Jesse
 * @date 2021/7/26 23:50
 */
public class DoubleColon {
    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a","b","c","d");
        for (String a: al) {
            AcceptMethod.printValur(a);
        }
        //下面的for each循环和上面的循环是等价的
        al.forEach(x->{
            AcceptMethod.printValur(x);
        });
    }

    private static class AcceptMethod {
        private static void printValur(String s){
            //...
        }
    }
}
