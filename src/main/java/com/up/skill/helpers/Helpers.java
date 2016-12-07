package com.up.skill.helpers;

/**
 * Created by nxtlvl on 11/29/2016.
 */
 public class Helpers {
    public static String return123(String content){
        return content + "123";
    }

    public static int[] returnInt() {

        int first= 1;
        int second= 1;
        int next;
        int num;
        int[] fibonacciSeq = new int[20];

        for (num= 2 ; num <fibonacciSeq.length; num++)
        {
            next = first + second;
            fibonacciSeq[0] = 1;
            fibonacciSeq[1] = 1;
            fibonacciSeq[num] = next;
            first = second;
            second = next;
        }

        return fibonacciSeq;
    }
}
