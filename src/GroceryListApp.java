import utils.Input;

import java.util.Scanner;

public class GroceryListApp {

    public static void main(String[] args) {

    }

    public static void init(){
        Scanner scanner = new Scanner(System.in);
        String createListChoice = "y";
        Input input = new Input();




        createListChoice = input.getString("Would you like to create a grocery list?(y/n)");

        while(!createListChoice.equalsIgnoreCase("y") || !createListChoice.equalsIgnoreCase("yes") ||
              !createListChoice.equalsIgnoreCase("n") || !createListChoice.equalsIgnoreCase("no")){
            createListChoice = input.getString("You must enter yes or no to create grocery list:");
        }

        if(createListChoice.equalsIgnoreCase("y") || createListChoice.equalsIgnoreCase("yes")){

        }

        if( createListChoice.equalsIgnoreCase("n") || createListChoice.equalsIgnoreCase("no")){

        }




    }

    public static void optionList(){
        String optionSelection = "";
        String categorySelection;
        Input input = new Input();

        System.out.println("Select Food category:");
        System.out.println("1. Produce\n");
        System.out.println("2. Dairy\n");
        System.out.println("3. Frozen\n");
        System.out.println("4. Meat\n");

        categorySelection = input.getString("Enter selection by number: ");

        while(Integer.parseInt(categorySelection) < 1 || Integer.parseInt(categorySelection) >4){
            categorySelection = input.getString("")
        }

    }


}