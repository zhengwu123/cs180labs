import java.util.Scanner;

/**
 * Created by zheng on 9/21/16.
 */
public class Restaurants {
    // On campus
    public static final String ON_CAMPUS_VEGAN = "Purdue Dining Courts\nFlatbreads";
    public static final String ON_CAMPUS_VEGETARIAN = ON_CAMPUS_VEGAN + "\nOasis Cafe\nAh*Z\nFreshens";
    public static final String ON_CAMPUS_GLUTEN_FREE = "Purdue Dining Courts\nFlatbreads\nOasis Cafe\nPappy's " +
            "Sweet Shop";
    public static final String ON_CAMPUS_BURGERS = "Pappy's Sweet Shop\nCary Knight Spot";
    public static final String ON_CAMPUS_SANDWICHES = "Flatbreads\nOasis Cafe\nErbert & Gerbert's";
    public static final String ON_CAMPUS_OTHERS = "Purdue Dining Courts\nAh*Z\nFreshens\nLemongrass";
    public static final String ON_CAMPUS_ALL = ON_CAMPUS_BURGERS + "\n" + ON_CAMPUS_SANDWICHES + "\n" +
            ON_CAMPUS_OTHERS;

    // Off campus
    public static final String OFF_CAMPUS_VEGAN = "Chipotle\nQdoba\nNine Irish Brothers\nFive Guys\n Puccini's " +
            "Smiling Teeth\nPanera Bread";
    public static final String OFF_CAMPUS_VEGETARIAN = OFF_CAMPUS_VEGAN + "\nWendy's\nBruno's Pizza\nJimmy " +
            "John's\nPotbelly Sandwich Shop\nBasil Thai\nIndia Mahal";
    public static final String OFF_CAMPUS_GLUTEN_FREE = "Chipotle\nQdoba\nNine Irish Brothers\nPuccini's Smiling " +
            "Teeth\nWendy's\nScotty's Brewhouse\nPanera Bread\nBasil Thai";
    public static final String OFF_CAMPUS_BURGERS = "Five Guys\nWendy's\nTriple XXX\nScotty's Brewhouse";
    public static final String OFF_CAMPUS_SANDWICHES ="Panera Bread\nJimmy John's\nPotbelly Sandwich Shop";
    public static final String OFF_CAMPUS_PIZZAS = "Puccini's Smiling Teeth\nMad Mushroom Pizza\nBruno's Pizza\n";
    public static final String OFF_CAMPUS_OTHERS = "Chipotle\nQdoba\nNine Irish Brothers\nFamous Frank's\n Von's " +
            "Dough Shack\nBuffalo Wild Wings\nBasil Thai\nMaru Sushi\nIndia Mahal\nHappy China\nYori";
    public static final String offCampusAll = OFF_CAMPUS_BURGERS + "\n" + OFF_CAMPUS_SANDWICHES + "\n" +
            OFF_CAMPUS_PIZZAS + OFF_CAMPUS_OTHERS;

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to restaurant picker..");
        System.out.println("Type 1 for On campus, type 2 for off campus");
        int anser1 = scanner.nextInt();
        if(anser1==1){
            System.out.println("Dietary restrictions?(Y/N)");
            //String empty = scanner.next();
            String anser2 = scanner.next();
            if(anser2.equals("Y") || anser2.equals("y")){
                System.out.println("1-Vegan 2-Vegetarian 3-Gluten-free");
                int anser3 = scanner.nextInt();
                if(anser3==1)
                    System.out.println(ON_CAMPUS_VEGAN);
                if(anser3==2)
                    System.out.println(ON_CAMPUS_VEGETARIAN);
                if(anser3==3)
                    System.out.println(ON_CAMPUS_GLUTEN_FREE);
            }
            else if(anser2.equals("N") || anser2.equals("n")){
                System.out.println("Food preference?(Y/N)");
                String anser4 = scanner.next();
                if(anser4.equals("Y") || anser2.equals("y")){
                    System.out.println("1-Burgers 2-Sandwiches 3-others");
                    int anser5 = scanner.nextInt();
                    if(anser5==1)
                        System.out.println(ON_CAMPUS_BURGERS);
                    if(anser5==2)
                        System.out.println(ON_CAMPUS_SANDWICHES);
                    if(anser5==3)
                        System.out.println(ON_CAMPUS_OTHERS);
                }
                if(anser4.equals("N") || anser2.equals("n")){

                    System.out.println(ON_CAMPUS_ALL);
                }

            }

        }
        else if(anser1==2){
            System.out.println("Dietary restrictions?(Y/N)");
            String anser2 = scanner.next();
            if(anser2.equals("Y") || anser2.equals("y")){
                System.out.println("1-Vegan 2-Vegetarian 3-Gluten-free");
                int anser3 = scanner.nextInt();
                if(anser3==1)
                    System.out.println(OFF_CAMPUS_VEGAN);
                if(anser3==2)
                    System.out.println(OFF_CAMPUS_VEGETARIAN);
                if(anser3==3)
                    System.out.println(OFF_CAMPUS_GLUTEN_FREE);
            }
            else if(anser2.equals("N") || anser2.equals("n")){
                System.out.println("Food preference?(Y/N)");
                String anser4 = scanner.next();
                if(anser4.equals("Y") || anser4.equals("y")){
                    System.out.println("1-Burgers 2-Sandwiches 3-pizzas 4-others");
                    int anser5 = scanner.nextInt();
                    if(anser5==1)
                        System.out.println(OFF_CAMPUS_BURGERS);
                    if(anser5==2)
                        System.out.println(OFF_CAMPUS_SANDWICHES);
                    if(anser5==3)
                        System.out.println(OFF_CAMPUS_PIZZAS);
                    if(anser5==4)
                        System.out.println(OFF_CAMPUS_OTHERS);
                }
                if(anser4.equals("N") || anser4.equals("n")){

                    System.out.println(offCampusAll);
                }

            }


        }
        else{
            System.out.println("Invalid input, we only accept 1 or 2");
            System.exit(1);
        }
    }
}
