package dataStracture;

public class ArrayPractice {
    //array symbol []      array index is start from zero
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        String[] name = {"A1", "A2", "A3", "A4"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name.length);

        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]);
        }
        // System.out.println("***********8");
        for (int a = 0; a < 3; a++) {
            System.out.println("name[a]");
        }
        System.out.println("&&&&&&&&&");
        int[] numbers = {10, 12, 13, 14};
        Object[] objectArray = {"mesay", 1};

        for (int a = 0; a < objectArray.length; a++) {
            System.out.println(objectArray[a]);
        }
        System.out.println("%%%%%ArrayPracticeeeeeeeeeeeeeeeeeeeeeeeeee%%%%%%");
        int[] refVar = new int[3];
        // System.out.println(refVar[0]);
        refVar[0] = 10;   //store or add element
        refVar[1] = 20;
        refVar[2] = 40;
        System.out.println(refVar.length);
        System.out.println(refVar[2]);
        System.out.println("&&&&&&&&&&&&&&&&&");
        int[] newArray = refVar.clone();
        System.out.println(newArray.length);
        System.out.println(newArray[1]);
        System.out.println("&&&&&&&&&&&&&&&&&yyyyuuuuuuxxxxxxxxxx");

        String[] obj = new String[4];
        obj[0] = "mesay";//the way to store
        obj[1] = "kidan";
        obj[2] = "blen";
        obj[3] = "kidest";
        System.out.println(obj.length);
        System.out.println(obj[1]);
        System.out.println(obj[3]);
        System.out.println("#############");
        //if we need to make new Array
        String[] newArray1 = obj.clone();
        System.out.println(newArray1.length);
        System.out.println(newArray1[1]);


    }
}


