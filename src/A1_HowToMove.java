public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.setColor(255, 192, 203 );
        plane.trailWidth=20;
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.move(400);
        plane.turn(135);
        plane.move(280);
        plane.turn(90);
        plane.move(280);
        plane.setColor(235, 172, 183 );
        plane.turn(45);
        plane.move(400);
        plane.setColor(205, 142, 153 );
        plane.turn(90);
        plane.move(400);
        plane.setColor(235, 172, 183 );
        plane.turn(90);
        plane.move(400);



    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/