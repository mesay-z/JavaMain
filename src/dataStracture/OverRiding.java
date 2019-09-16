package dataStracture;

public class OverRiding {
    //the same methods name and the same parameter but d/t class
    public static void main(String[] args) {
       Car obj=new Car();
       obj.capacity();
    }
}

class Engine{
    public void capacity(){
        System.out.println("BMW");
    }
}
class Car extends Engine{
public void capacity(){
    System.out.println("BMW car");
}
}






