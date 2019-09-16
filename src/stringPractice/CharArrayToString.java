package stringPractice;

public class CharArrayToString {

    public static void main(String[] args) {
        char[] v = {'A', 'M', 'A', 'Z', 'O', 'N'};
        //option 1
        String sr1 = new String(v);
        System.out.println(sr1);

        //option 2
        String sr2 = String.valueOf(v);
        System.out.println(sr2);


    }
}