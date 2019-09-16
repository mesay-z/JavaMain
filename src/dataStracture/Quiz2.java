package dataStracture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number Of Family Members " );
        int famMem = scanner.nextInt();

        for( int i=0;i<famMem;i++){
            System.out.println("Enter Family Members Name ");
            String name=scanner.next();
            //objArray.add(i,name);
        }
        ArrayList<String> objArray=new ArrayList<>();
        System.out.println(objArray);
        Random rn=new Random();
        String refVar=objArray.get(rn.nextInt(famMem));
        HashMap<String,String> secretSantaMap=new HashMap<>();
        String secreteSanta=objArray.get(rn.nextInt(famMem));
        while(!(objArray.equals(secreteSanta))){
            secretSantaMap.put(refVar,secreteSanta);
        }
        System.out.println(secretSantaMap);
    }
}
