public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.pausetime = 1;
        plane.setColor(200, 0, 0);


        plane.teleport(500,200);
        tree();
        plane.teleport(500,500);
        snowflake();
        plane.teleport(200,500);
        house();

    }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }

    public void pentagon() {
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
    }

    public void tree() {
        plane.setColor(150,75,0);
        plane.isTrail=true;
        plane.startingAngle(90);
        plane.move(150);
        plane.turn(90);
        plane.move(30);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(15);
//loops 18.5 times
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(70);
        plane.isTrail=true;
        plane.turn(5);
        plane.move(70);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(70);

    }
    public void snowflake() {
        plane.startingAngle(90);
        plane.setColor(255,255,255);
        plane.isTrail=true;
        plane.move(50);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.isTrail=true;
        plane.turn(-45);
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.isTrail=true;
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.turn(-45);
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.isTrail=true;
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.isTrail=true;
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.isTrail=true;
        plane.turn(-45);
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);
        plane.isTrail=true;
        plane.move(25);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(25);



    }
    public void house() {
        plane.setColor(18,82,35);
        plane.startingAngle(270);
        plane.isTrail=true;
        plane.move(200);
        plane.turn(90);
        plane.move(160);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(160);
        plane.move(150);
        plane.turn(90);
        plane.move(110);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(110);
        plane.turn(90);
        plane.move(45);
        plane.turn(90);
        plane.move(60);
        plane.turn(-90);
        plane.move(70);
        plane.turn(-90);
        plane.move(60);
        plane.turn(-90);
        plane.move(115);
        plane.isTrail=false;
        plane.startingAngle(270);
        plane.move(200);
        plane.isTrail=true;
        plane.turn(60);
        plane.move(90);
        plane.turn(60);
        plane.move(93);
        plane.isTrail=false;
        plane.turn(60);
        plane.move(200);
        plane.turn(90);
        plane.move(65);
        plane.isTrail=true;
        plane.turn(90);
        plane.move(50);
        plane.turn(-90);
        plane.move(25);
        plane.turn(-90);
        plane.move(48);
        plane.isTrail=false;
        plane.turn(-90);
        plane.move(65);
        plane.turn(-90);
        plane.move(160);
        plane.turn(-90);
        plane.isTrail=true;
        plane.startingAngle(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.isTrail=false;
        plane.move(90);
        plane.isTrail=true;
        plane.startingAngle(-90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);











}



}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/