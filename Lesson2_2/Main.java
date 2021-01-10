package Lesson2_2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {

        int l = 4;
        String[][] array = {{"1", "2", "4", "b"}, {"c", "8", "m", "5"},
                {"d", "1", "0", "l"}, {"2", "a", "a", "2"}};
        int[][] arrayI = new int[l][l];
        testSize(array, l);
        System.out.println(Arrays.deepToString(array).concat("Массив изначальный"));
        full(array, arrayI);
        System.out.println(Arrays.deepToString(arrayI).concat("Массив int"));
        System.out.println(sum(arrayI) + " Сумма");


    }

    private static int sum(int[][] arrayI) {
        int sum = 0;
        for (int[] ints : arrayI) {
            for (int j = 0; j < arrayI.length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

    private static void testSize(String[][] array, int l) {

        if(array.length != l){
            throw new MyArraySizeException();
        }
    }
    private static void full(String[][] array, int[][] arrayI) throws MyArrayDataException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    arrayI[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    arrayI[i][j] = j;
                    //throw new MyArrayDataException(i, j);
                }
            }
        }
    }
}
