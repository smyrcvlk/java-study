package HOMEWORKS;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        //write a program that find the size.
        // user input integer and output the size of the clothes.

//output
//            "size is small"
//            "size is medium"
//            "size is large"
//            "size is X-large"
//

     Scanner scan = new Scanner(System.in);

        System.out.println( "Provide your size;");

        int size = scan.nextInt();

        switch (size) {

            case 12:
                System.out.println( "your size is xl");
                break;

            case 10:
                System.out.println("your size is l");
                break;


            case 8:
                System.out.println("your size is m");
                break;

            case 6:
                System.out.println( "your size is s");


        }

    }

class ifICreateanotherClass{}

}
enum sizes{}
