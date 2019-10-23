package HOMEWORKS;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //    Write a code that displays the name of the day
//    it declares an int named day whose value represents a day(1-7).
//    The code displays the name of the day, based on the value of the day, using the switch statement.
//

//Input 5
//    Output:
//    Friday
        Scanner scan  = new Scanner (System.in);

        System.out.println("Please enter the number of the day");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday is Weekday");
                break;

            case 2:
                System.out.println("Tuesday is Weekday");
                break;

            case 3:
                System.out.println("Wednesday is Weekday");
                break;

            case 4:
                System.out.println("Thursday is Weekday");
                break;

            case 5:
                System.out.println("Friday is Weekday");
                break;

            case 6:
                System.out.println("Saturday is Weekend");
                break;

            case 7:
                System.out.println("Sunday is Weekend");
                break;

            default:
                System.out.println("Invalid input");
        }
    }

        }

