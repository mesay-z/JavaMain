package trayCatch;

import java.util.Scanner;

public class TrayCatch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is fav number?");
        try{
            int n=scan.nextInt();
            System.out.println(n);
        } catch(Exception e){
            System.out.println("sorry pls enter number");
        }

    }
}
