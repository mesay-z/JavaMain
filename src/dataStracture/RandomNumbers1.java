package dataStracture;

import java.util.Random;

public class RandomNumbers1 {
    // Q1- create an array and store 4 random numbrers
    public static void main(String[] args){
        int[] refVar=new int[4];
        Random rn =new Random();
        for(int i=0;i<4;i++){
            int newValue=rn.nextInt(20) ;
            refVar[i]=newValue;
        }
        for(int i=0;i<refVar.length;i++){
            System.out.println(refVar[i]);
        }
        System.out.println(refVar.length);
    }
}
