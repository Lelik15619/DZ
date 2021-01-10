package Lesson2_1;

public class Human implements Runable, Jumped, Party{


    int run;
    int jump;


    public String runTrue() {
        return "Человек пробежал дистанцию";
    }

    public String runFalse() {
        return "Человек не смог пробежать дистанцию";
    }

    public String jumpTrue() {
        return "Человек перепрыгнул";
    }

    public String jumpFalse() {
        return "Человек не смог перепрыгнуть";
    }

    public Human(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int run() {

        return this.run;
    }

    @Override
    public int jump() {

        return this.jump;
    }
}
