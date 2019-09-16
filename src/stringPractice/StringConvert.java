package stringPractice;

public class StringConvert {

    public static void main(String[] args) {
        String a = "100";
        //using Integer.valueOf();
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        //usingInteger.parseInt();
        int c = Integer.parseInt(a);
        System.out.println(c);

        //number format exception
        String d = "100A";
        try {
            Integer z = Integer.valueOf(d);
            System.out.println(z);
        } catch (NumberFormatException e) {
            System.out.println("print out NumberFormatException");
        }

        try {
            int y = Integer.parseInt(d);
            System.out.println(y);
        } catch (NumberFormatException e) {
            System.out.println("print out NumberFormatException occured");
        }
        //using boolean.valueOf
        Boolean q = Boolean.valueOf(a);
        System.out.println(q);

        //using float.valueOf();
        Float r = Float.valueOf(a);
        System.out.println(r);

    }
}