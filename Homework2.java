package HOMEWORKS;

public class Homework2 {
    public static void main(String[] args) {
        //Find the Largest Number Among Three Numbers using user Input
//Finding largest of three numbers using if-else..if
//    int a = 34;
//    int b = 45;
//    int c = 78;
//
//Output:
//
//78 is the largest Number
        int a=34;
        int b=45;
        int c=78;

        if(a > b && a > c){
            System.out.println(a + " is the largest number");
        }else if(b > a && b > c){
            System.out.println(b + " is the largest number");
        }else{
            System.out.println( c +" is the largest number");
        }


    }






}
