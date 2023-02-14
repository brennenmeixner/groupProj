public class MathTest {

public static void main(String[] args) {
        squareRoot();
        sineCosine();
        floorCeilingRound();
        largerSmaller();
        randNum();
    }
    
    public static void squareRoot(){
            double root = Math.sqrt(37);
        System.out.println("The square root of 37 = " + root);
    }
    public static void sineCosine(){
            double sine = Math.sin(300);
            double cosine = Math.cos(300);
        System.out.println("The sine of 300 = " + sine + '\n' + "And the cosine of 300 = " + cosine);
    }
    public static void floorCeilingRound(){
            double floor = Math.floor(22.8);
            double ceiling = Math.ceil(22.8);
            double round = Math.round(22.8);
        System.out.println("The floor value of 22.8 = " + floor);
        System.out.println("The ceiling value of 22.8 = " + ceiling);
        System.out.println("The round value of 22.8 = " + round);
    }
    public static void largerSmaller(){
            double larger = Math.max('D', 71);
            double smaller = Math.min('D', 71);
        System.out.println("Larger Value of D and 71 is: " + larger);
        System.out.println("Smaller Value of D and 71 is: " + smaller);
    }
    public static void randNum(){
            double nmbr = Math.random() + 20 +1;
        System.out.println("A random number between 0 and 20 is: " + nmbr);
    }

}
