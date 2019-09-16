package dataStracture;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListPractice2 {

    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("A1");
        arrayList.add("A2");
        arrayList.add("A3");
        arrayList.add("A4");
        // for loop
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        //using Iterator
        Iterator it=arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

