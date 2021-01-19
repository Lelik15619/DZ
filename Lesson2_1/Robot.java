package Lesson2_1;

public class Robot implements Runable, Jumped, Party{

    int run;
    int jump;

    public Robot(int run, int jump) {
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


    public String runTrue() {
        return "Робот пробежал дистанцию";
    }

    public String runFalse() {
        return "Робот не смог пробежать дистанцию";
    }

    public String jumpTrue() {
        return "Робот перепрыгнул";
    }

    public String jumpFalse() {
        return "Робот не смог перепрыгнуть";
    }
}
