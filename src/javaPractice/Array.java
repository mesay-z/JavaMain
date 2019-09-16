package javaPractice;

public class Array {
    //array []      array index is start from zero and we can use d/t data type in at a time {string,int,float,,,}
    //store
    public static void main(String[] args) {
        String[] name = {"A1", "A2", "A3", "A4"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name.length);
        ///if i whont print all
        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]);
        }
        // System.out.println("***********8");
        for (int a = 0; a < 2; a++) {
            System.out.println("name[a]");
        }
        System.out.println("&&&&&&&&&");
        int[] numbers = {10, 12, 13, 14};

        //objArray--in side array d/t DataType
        Object[] objectArray = {"mesay ",1," ",5," xyz"};

        System.out.println(objectArray.length);
        for (int a = 0; a < objectArray.length; a++) {
            System.out.print(objectArray[a]);
        }

    }
}