package codeLab;

import java.util.Scanner;

public class CodeLab {
    public static void main(String[] args) {
                // scanner 20606
        //Given an int variable datum that has already been declared, write a few statements
       // that read an integer value from standard input into this variable.

        //Scanner input = new Scanner(System.in);
       // datum = input.nextInt();

        int datum;
        Scanner input = new Scanner(System.in);
        datum = input.nextInt();
        System.out.println(datum);
       /* Assume that name has been declared suitably for storing names (like "Misha", "Emily" and "Sofia").
        Assume also that stdin is a variable that references a Scanner object associated with standard input Write
        some code that reads a value into name then prints the message "Greetings, NAME" on a line by itself, where NAME
        is replaced the value that was read into name. For example, if your code
        read in "Rachel" it would print out "Greetings, Rachel" on a line by itself
        */

        String name="Rachel";
        Scanner stdin = new Scanner(System.in);
       //name=stdin.next();
        System.out.println(name);

    }
}
