package ru.nsu.dunaev;

import java.util.Random;

public class Main {

    public static void main() {
        Random rnd = new Random();
        HeapSort hp = new HeapSort();
        for (int i = 1; i < 9; i++){
            int n = (int)Math.pow(10, i);
            System.out.println("Test " + i + " (n = 10^" + i + "):");
            check(n, rnd, hp);
        }
    }

    static void check(int n, Random rnd, HeapSort hp){
        int[] test = new int[n];
        for (int i = 0; i < n; i++){
            test[i] = rnd.nextInt(-n, n);
        }
        double start1 = System.nanoTime();
        int[] result = hp.heapsort(test);
        double end1 = System.nanoTime();
        System.out.println("Elapsed Time in seconds: "+ (end1-start1)/Math.pow(10, 9));
        System.out.println("Predicted Time in seconds: " + n * Math.log(n)/Math.pow(10, 8));
        System.out.println('\n');
    }

    static void printrr(int[] arr){
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}