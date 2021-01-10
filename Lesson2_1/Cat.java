package Lesson2_1;

public class Cat implements Runable, Jumped, Party{
    int run;
    int jump;

    public Cat(int run, int jump) {
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
        return "Кот пробежал дистанцию";
    }

    public String runFalse() {
        return "Кот не смог пробежать дистанцию";
    }

    public String jumpTrue() {
        return "Кот перепрыгнул";
    }

    public String jumpFalse() {
        return "Кот не смог перепрыгнуть";
    }
}
