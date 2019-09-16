package stringPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Owner\\IdeaProjects\\JavaMain\\src\\stringPractice\\java.txt");
        Scanner scan = new Scanner(file);
        //read the first line
        System.out.println(scan.nextLine());

        //if we need to read all text line

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }




    }
}
