package javaPractice;

public class ExceptionHandling {

    //create an int array with 3 index try to print last index +1's value
    //handel in the try catch block
    //print exception occurred
    public static void main(String[] args) {
        int[] name = {5, 6, 7};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        try {

            System.out.println(name[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("caught the exception");

        }


    }
}
