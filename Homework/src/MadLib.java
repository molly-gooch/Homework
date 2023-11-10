public class MadLib {


    public static void main(String[]  args){
        MadLib myStory= new MadLib();

    }

    public MadLib(){
        String classmate;
        classmate="amelie";
        String city;
        city="Boston";
        String noun;
        noun="car";
        String adjective;
        adjective="colorful";
        String pluralNoun;
        pluralNoun="christmasTrees";
        String pluralAnimal;
        pluralAnimal="moles";
        boolean trueOrFalse;
        trueOrFalse=true;
        double decimalBiggerThan1;
        decimalBiggerThan1=21.71;
        int number1;
        number1=15000;
        int number2;
        number2=12;
        int wholeNumberBetween1And4;
        wholeNumberBetween1And4=3;
        String miltonTeacher;
        miltonTeacher="mrGagnon";
        String miltonDean;
        miltonDean="mrsSugrue";
        String letterGrade;
        letterGrade="A";
        String season;
        season="winter";

        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);






    }
}
