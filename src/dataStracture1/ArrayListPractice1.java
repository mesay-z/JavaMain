package dataStracture1;

import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList();
        arrayList.add("Mr X");
        arrayList.add("Mr Y");
        arrayList.add("Mr Z");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());

        System.out.println("*****AFTER*****");
        arrayList.remove(2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        arrayList.clear();
        System.out.println(arrayList.size());

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Ron");
        stringArrayList.add("JOhn");
        for(int i=0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }

    }
}
