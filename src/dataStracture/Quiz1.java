package dataStracture;
import java.util.ArrayList;
import java.util.Scanner;
public class



Quiz1 {

//create a program which will
   // take a specific number of student name from the console
    // for each student, it should ask for 4 subjects name and marks for them all
   // your code should get the avg marks & total for the each of the students
   //  store all the students 1.name, 2.marks, 3.subjects in individual ArrayList/Hashset and
     //print all subjects, students name from that
    //Tips : You may want to use Scanner, ArrayList, HashSet/ArrayList
    //Your code needs to by dynamic enough to handle as many numbers of student user may want to.
    //Think Smartly !

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many student calculate?");
        int count = scanner.nextInt();
        String array[]=new String[count];
        for (int i=0;i<count;i++){
            array[i]=scanner.nextLine();
            ArrayList studentList=new ArrayList();
            System.out.println("Enter Student Name");
            //System.out.println("************@@@@@@@@@@@@@@@@@@@@");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Subject List");
            int count1=scanner.nextInt();
            String array1[]=new String[count1];
            for(int l=0;l<count1;l++){
                array1[l]=scanner.nextLine();
                ArrayList subjectList=new ArrayList();
                System.out.println("Enter Subject Name");
                //System.out.println("############################");
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Student Mark");
                int count2=scanner.nextInt();
                String array2[]=new String[count2];
                for(int a=0;a<count1;a++){
                    array1[a]=scanner.nextLine();
                    ArrayList studentScore=new ArrayList();
                    System.out.println("Enter Student Mark");
                }


            }

        }
    }
}

