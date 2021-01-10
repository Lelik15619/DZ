package Lesson2_2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j) {
        super("Неверные данные в массиве строка " + (i + 1) + " в столбец " + (j + 1) );
    }
}
