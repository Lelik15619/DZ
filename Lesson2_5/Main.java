package Lesson2_5;

import static java.lang.System.arraycopy;

public class Main {

    static final int SIZE = 10000000;
    static final int H = SIZE / 2;


    public static void main(String[] args) {
        float[] arr1 = new float[SIZE];
        float[] arr2 = new float[SIZE];
        float [] a1 = new float[H];
        float [] a2 = new float[H];

        oneTread(arr1);
        moreTread(arr2, a1, a2);
        gluing(arr2, a1, a2);

    }
    private static void moreTread(float[] arr2, float[] a1, float[] a2) {

        for (int i = 0; i < SIZE; i++) {
            arr2[i] = 1;
        }


        arraycopy(arr2, 0, a1, 0, H);
        arraycopy(arr2, H, a2, 0, H);
        Thread t1 = new Thread(() -> firstArr(a1)
        );
        Thread t2 = new Thread(() -> secondArr(a2)
        );
        t1.start();
        t2.start();
        long b = System.currentTimeMillis();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Два потока " + (System.currentTimeMillis() - b));
    }
    private static void gluing(float[] arr2, float[] a1, float[] a2) {
        arraycopy(a1, 0, arr2, 0, H);
        arraycopy(a2, 0, arr2, H, H);
    }
    private static void firstArr(float[]a1) {
        for (int i = 0; i < (H - 1); i++) {
            a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    private static void secondArr(float[] a2) {
        for (int j = 0, i = H; j < H - 1; i++, j++)
            a2[j] = (float) (a2[j] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
    private static void oneTread(float[]arr1) {

        for (int i = 0; i < SIZE; i++) {
            arr1[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Один поток " + (System.currentTimeMillis() - a));
    }
}