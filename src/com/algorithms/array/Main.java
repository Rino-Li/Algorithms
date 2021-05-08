package com.algorithms.array;

/**
 * @author itjunjun  2021/4/15 10:05
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
    }
}
