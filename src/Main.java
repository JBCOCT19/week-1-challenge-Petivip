

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuePlaying="Y";
        while(continuePlaying.equalsIgnoreCase("Y")) {
            Scanner myVar = new Scanner(System.in);
            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            String answer = myVar.next();
            if (answer.equalsIgnoreCase("I")) {

                System.out.print("Enter your number here:");
                int num = myVar.nextInt();
                Boolean test = true;
                for (int x = 2; x < num; x++){
                    if (num % x == 0) {
                        System.out.println(num + " is not a prime number");
                        test = false;
                        break;
                    }
                }
                if (test) {
                    System.out.println(num + " is a prime number");
                }
            } else if (answer.equalsIgnoreCase("R")) {
                Random newR = new Random();
                int randomNum = 1 + newR.nextInt(250);
                boolean test = true;
                for (int x = 2; x < randomNum; x++) {
                    if (randomNum % x == 0) {
                        System.out.println(randomNum + " is not a prime number");
                        test = false;
                        break;
                    }
                }
                if (test) {
                    System.out.println(randomNum + " is a prime number");
                }

            }

            System.out.println("Would you like to continue playing?(Y/N)");
            continuePlaying = myVar.next();
        }

        System.out.println("See You Next Time!!!!");
    }
}