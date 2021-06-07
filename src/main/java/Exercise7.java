/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brooke Fuller
 */
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise7 {
    public static void main(String[] args) {
        out.println("What is the length of the room in feet? ");
        Scanner input = new Scanner(in);
        String lengthR = input.nextLine();
        out.println("What is the width of the room in feet? ");
        Scanner input2 = new Scanner(in);
        String widthR = input2.nextLine();

        try {
            int x = Integer.parseInt(lengthR);
            int y = Integer.parseInt(widthR);
            double areafeet = ((double) x) * ((double) y);
            double areameters = areafeet * 0.09290304;

            if(x >= 0 && y >= 0) {
                System.out.println("You entered dimensions of " + x + " feet by " + y + " feet.");
                System.out.println("The area is " + areafeet + " square feet.");
                System.out.println(areameters + " square meters");
            }
            if(x < 0 || y < 0)
            {
                System.out.println("You cannot have negative area. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Please enter a number.");
        }

    }
}
