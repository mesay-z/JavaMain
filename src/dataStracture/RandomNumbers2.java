package dataStracture;

import java.util.Scanner;

public class RandomNumbers2 {

    //Q2.create an array and store 4 numbers from console
    //print all the value from the array
    public static void main(String[] args) {
        int[] refVar = new int[4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < refVar.length; i++) {
            System.out.println("insert value: ");
            int newValue=scan.nextInt();
            refVar[i]=newValue;
        }
        System.out.println(refVar.length);
    }

}