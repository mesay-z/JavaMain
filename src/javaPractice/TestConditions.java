package javaPractice;

public class TestConditions {
    public static void main(String[] args) {
        /////// //if(condition){ action

        int x = 10;
        if (x > 5) {
            System.out.println("hello");
        } else if (x < 5) {
            System.out.println("hi");
        } else if (x == 10) {
            System.out.println("sup");
        }
        if (x == 10) {
            System.out.println("new");
        }
        System.out.println("888888888");
        ///////// if else
        int y=10;
        if(y>5){
            System.out.println("love");
        }else{
            System.out.println("bad");
        }
        System.out.println("***********");

        ////////////else if

        int z=10;
        if(z>10){
            System.out.println("home");
        }else if(z==10){
            System.out.println("tv");
        }else if(z<10){
            System.out.println("laptop");
        }
        //&& ----and
        //|----or
        //!-----not
        System.out.println("##########");

        int b=5;
        int c=10;

        if(b>12 && c>8){
            System.out.println("school");
        }else if(b>3 && c<12){
            System.out.println("university");
        }else if(b!=5){
            System.out.println("union");
        }
    }
}

