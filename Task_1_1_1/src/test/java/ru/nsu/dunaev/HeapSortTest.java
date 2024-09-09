package ru.nsu.dunaev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;


class HeapSortTest {

    @Test
    void heapsortTest1() {
        HeapSort hp = new HeapSort();
        assert Arrays.equals(hp.heapsort(new int[] {5, 4, 3, 2, 1}), new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void heapsortTest2() {
        HeapSort hp = new HeapSort();
        assert Arrays.equals(hp.heapsort(new int[] {-3, 0, 4, -3, -10}), new int[]{-10, -3, -3, 0, 4});
    }

    @Test
    void heapsortTest3() {
        HeapSort hp = new HeapSort();
        assert Arrays.equals(hp.heapsort(new int[] {-1, -20, -30, -4, -3}), new int[]{-30, -20, -4, -3, -1});
    }

    @Test
    void mainTest() {
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