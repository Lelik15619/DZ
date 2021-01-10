package Lesson2_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    public MyArraySizeException() {
        super("Размер массива неверен!");
    }
}
