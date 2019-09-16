package ifPractice;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //using the java cone to get input from user called the scanner to do that
   Scanner scan= new Scanner(System.in);
        System.out.println("enter a greade:");

        int n=scan.nextInt();
        System.out.println(n);

        if(n>=90 && n<=100){
            System.out.println("A");
        }else if(n>=75 && n<=85){
            System.out.println("B");
        }else if(n>=65 && n<=74) {
            System.out.println("C");
        }else if(n>=55 && n<=64) {
            System.out.println("D");
        }else if(n>=30 && n<=54) {
            System.out.println("F");
        }else{
            System.out.println("dismise from the class!!!");
        }


    }
}
