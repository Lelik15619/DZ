package Lesson2_1;

public class Treadmill implements Runable, Obstackle{
        int lenght;

        public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int run() {

        return 0;
    }

    @Override
    public int height() {

        return 0;
    }

    @Override
    public int lenght() {
        return this.lenght;
    }
}
