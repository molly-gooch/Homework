public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail=true;
        plane.pausetime=1;
        gridOfSmallSquares2();



        }

    public void rowOfSmallSquares() {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        for(int x=80; x<441; x=x+40){
            System.out.println(x);
            plane.teleport(x,500);
            plane.square(10);
        }

    }

    public void columnOfSmallSquares(){
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
            for(int y=80; y<441; y=y+40){
                plane.teleport(550,y);
                plane.square(10);
            }

    }
    public void gridOfSmallSquares(){
        plane.trailWidth=5;
       for(int x=100; x<1000; x=x+100){
           for(int y=80; y<441; y=y+40){
               plane.setColor(100,x/5,203);
               plane.teleport(x, y);
               plane.square(10);

           }
       }
    }
    public void gridOfSmallSquares2(){
        plane.trailWidth=5;
        for(int y=80; y<441; y=y+20){
            for(int x=50; x<500; x=x+50){
                plane.setColor(100,x/3,203);
                plane.teleport(x, y);
                plane.square(10);
            }
        }
    }


    public void fives(){
        for(int x=5; x<36; x=x+5){
            System.out.println(x);
        }
    }

    public void negatives (){
        for(int x=5; x>-13; x=x-1 ){
            System.out.println(x);
        }
    }
    public void squares() {
        for (int x = 400; x > 0; x = x - 100) {
            System.out.println(x);
            plane.teleport(x, 100);
            plane.square(50);
        }
    }
}

