package Lesson2_1;

public class Wall implements Jumped, Obstackle{

    int height;

    public Wall(int height) {
        this.height = height;
    }



    @Override
    public int jump() {

        return 0;
    }

    public int height() {
        return height;
    }

    @Override
    public int lenght() {
        return 0;
    }
}
