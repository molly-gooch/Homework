public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;
//change
    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());


        for (int row = 1; row < 700; row = row + 1) {
            for (int col = 1; col < 787; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 130 && red > 80 && green < 200 && green > 155 && blue < 235 && blue > 180) {
                    plane.setPixelColor(250, 0, 200);
                } else if (red < 270 && red > 230 && green < 110 && green > 40 && blue < 100 && blue > 30) {
                    plane.setPixelColor(240, 215, 15);
                } else if (red > 225 && red < 270 && green > 100 && green < 155 && blue < 50) {
                    plane.setPixelColor(198, 55, 250);
                } else if (red > 200 && red < 255 && green > 70 && green < 140 && blue > 90 && blue < 165) {
                    plane.setPixelColor(5, 255, 218);
                } else if (red > 50 && red < 120 && green > 155 && green < 200 && blue > 60 && blue < 95) {
                    plane.setPixelColor(59, 255, 5);
                } else if (red > 185 && red < 270 && green > 160 && green < 215 && blue < 50) {
                    plane.setPixelColor(255, 176, 33);
                }else if(red>200 && green>200 && blue>180 && row<678){
                    plane.setPixelColor(255, 255, 255);
                }else if(row>682 && row<694 && col>505 && col<637){
                    plane.setPixelColor(17, 40, 247);
                }else{
                    plane.setPixelColor(17, 40, 247);
                }

            }
        }
        plane.pausetime=0;
        plane.teleport(450,500);
        plane.isTrail=true;
        plane.setColor(250,30,10);
        plane.fillCircle(30);
        plane.teleport(524,459);
        plane.startingAngle(180);
        plane.trailWidth=5;
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(-90);
        plane.move(40);
        plane.turn(-90);
        plane.move(40);
        plane.teleport(505,450);
        plane.startingAngle(90);
        plane.move(100);

        plane.teleport(552,29);
        plane.setColor(0,0,0);
        plane.startingAngle(90);
        plane.move(100);
        plane.turn(90);
        plane.move(70);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(70);
        plane.teleport(587,62);
        plane.startingAngle(110);
        plane.move(35);
        plane.teleport(587,62);
        plane.startingAngle(70);
        plane.move(35);
        plane.teleport(582,87);
        plane.startingAngle(0);
        plane.move(13);

        plane.teleport(564,40);
        plane.trailWidth=2;
        plane.startingAngle(70);
        plane.move(8);
        plane.startingAngle(110);
        plane.move(8);
        plane.startingAngle(250);
        plane.move(8);
        plane.startingAngle(290);
        plane.move(8);
        plane.teleport(614,110);
        plane.startingAngle(70);
        plane.move(8);
        plane.startingAngle(110);
        plane.move(8);
        plane.startingAngle(250);
        plane.move(8);
        plane.startingAngle(290);
        plane.move(8);
        plane.teleport(1000,600);




    }
}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/