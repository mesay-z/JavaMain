package traine;

public class Fibonacci {
    public static void main(String[] args) {
            //1,1,1,2,3,5,8,13
        int k, a = 1, b = 1;
        k = 0;
        System.out.println("1 1");
        while(k<=50);{
            k=a+b;
            System.out.println(k+" ");
            a=b;
            b=k;
        }
    }
}
