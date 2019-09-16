package stringPractice;

public class StringConcatination {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        String x="Fizz";
        String y="Buzz";

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(a+b+(x+y));
        System.out.println(x+a+y+b);
        String z=x.concat(y);

    }
}
