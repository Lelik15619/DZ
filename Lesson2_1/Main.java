package Lesson2_1;


public class Main {


    public static void main(String[] args) {
        Human human = new Human(100,2);
        Cat cat = new Cat(150, 4);
        Robot robot = new Robot(50,1);
        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(100);
        Party[] party = {human, cat, robot};
        Obstackle[] obstackle = {treadmill, wall};

        for (Party value : party) {
            if (value.run() >= obstackle[0].lenght()) {
                System.out.println(value.runTrue());
            } else {
                System.out.println(value.runFalse());
            }
            if (value.jump() >= obstackle[1].height()) {
                System.out.println(value.jumpTrue());
            } else {
                System.out.println(value.jumpFalse());
            }
        }
    }


    }

