package mentoring1;

public class StringComparison {
    public static void main(String[] args) {
        String a="javascript ";
        String b="JAVA";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
        //replace value
        System.out.println(a.replace('s','O'));
        //to lwer case
        System.out.println(b.toLowerCase());

    }
}
