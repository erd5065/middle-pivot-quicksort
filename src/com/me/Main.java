package com.me;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = {30,35,50,45,10,25,40};
        MiddleQuickSort.sort(a);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
