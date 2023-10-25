

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 1;
//pentagon
        plane.startingAngle(72);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(248, 152, 29);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
//hexagon
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(300);
        plane.isTrail = true;
        plane.setColor(0, 75, 141);
        plane.startingAngle(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
//octagon
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(400);
        plane.turn(-90);
        plane.move(150);
        plane.isTrail = true;
        plane.startingAngle(45);
        plane.move(100);
        plane.setColor(248, 152, 29);
        plane.turn(45);
        plane.move(100);
        plane.setColor(0, 75, 141);
        plane.turn(45);
        plane.move(100);
        plane.setColor(248, 152, 29);
        plane.turn(45);
        plane.move(100);
        plane.setColor(0, 75, 141);
        plane.turn(45);
        plane.move(100);
        plane.setColor(248, 152, 29);
        plane.turn(45);
        plane.move(100);
        plane.setColor(0, 75, 141);
        plane.turn(45);
        plane.move(100);
        plane.setColor(248, 152, 29);
        plane.turn(45);
        plane.move(100);



    }


}
