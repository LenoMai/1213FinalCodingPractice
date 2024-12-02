import Prob2.*;
import Prob1.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    //Problem 3 
    public static boolean isDivisible(int num1, int num2){
        double remainder = num1 % num2;
        if(remainder == 0){
            return true;
        }
        return false;
    }

    //Problem 5
    public static int userInput(){
        Scanner scnr = new Scanner(System.in);
        boolean isValid = false;
        int num = 0;
        
        while (!isValid) {
            try {
                System.out.print("Please enter a number between 1 and 10: ");
                num = scnr.nextInt();
                
                if (num >= 1 && num <= 10) {
                    isValid = true;
                } else {
                    System.out.println("Number must be between 1 and 10. Try again.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("That's not a number! Try again.");
                scnr.next(); // Clear the invalid input
            }
        }
        scnr.close();
        return num;
    }
    
    public static void main(String[] args){
        System.out.println("\n====Problem 1====");
        FileHandler csvHandler = new csvHandler();
        FileHandler txtHandler = new txtHandler();

        try {
            // Test CSV Handler
            File csvFile = new File("test.csv");
            // Writing CSV data
            csvHandler.writeData(csvFile, "John,30,Engineer\nMary,25,Doctor\nBob,35,Teacher");
            System.out.println("Reading CSV file:");
            csvHandler.readFile(csvFile);

            System.out.println("\n------------------------\n");

            // Test TXT Handler
            File txtFile = new File("test.txt");
            // Writing TXT data
            txtHandler.writeData(txtFile, "This is line one.\nThis is line two.\nThis is line three.");
            System.out.println("Reading TXT file:");
            txtHandler.readFile(txtFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
            
    
        //Problem 2
        System.out.println("\n====Problem 2====");
        Zoo z1 = new Zoo();
        for(Mammal m : z1.getMammals()){
            System.out.println(m.toString());
        }

        //Problem 3
        System.out.println("\n====Problem 3====");
        System.out.println("Test 1 | Expected: True | Result: " + isDivisible(4, 2));
        System.out.println("Test 2 | Expected: False | Result: " + isDivisible(5, 3));

        //Problem 4
        System.out.println("\n====Problem 4====");
        Bear b1 = new Bear("Kuma", 4, 403.4, "white");
        Bear b2 = new Bear("Winnie", 10, 102, "yellow");
        System.out.println("Test 1 | Expected Value: -1 | Result: " + b1.compareTo(b2));
        System.out.println("Test 2 | Expected Value: 1 | Result: " + b2.compareTo(b1));
        System.out.println("Test 3 | Expected Value: 0 | Result: " + b2.compareTo(b2));

        //Problem 5 
        System.out.println("\n====Problem 5====");
        System.out.println("You have entered the number: " + userInput());

    }
}
