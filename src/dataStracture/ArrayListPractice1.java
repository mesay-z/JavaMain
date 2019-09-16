package dataStracture;
import java.util.ArrayList;
public class ArrayListPractice1 {
    /*   the d/ce of ArrayList and Array
            in ArrayList we can add wt ever we whont but in array we have to specify the exact size
       ArrayList<String>stringArrayList=new ArrayList<String>();
       stringArrayList.add();
       stringArrayList.add();
       for(int i=0;i<stringArrayList.size();i++){
       System.out.println(stringArrayList.get(i));
       */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Strawberry");
        arrayList.add("papia");
        arrayList.remove("Mango");
        System.out.println(arrayList);
        System.out.println (arrayList.size());
        System.out.println(arrayList.get(2));
        //how to i get all of the value
        for (int i = 0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("$$$$$$$$$$$$");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("blen");
        stringArrayList.add("fiker");
        System.out.println(stringArrayList.get(0));
        for (int l = 0; l < stringArrayList.size(); l++) {
            System.out.println(stringArrayList.get(l));
        }

    }
}
