package stringPractice;

public class StringBuilder {
    public static void main(String[] args) {
        //compare b/n two string and return the difference
        String v="peoplentech";
        String v1="people";
        String v2="PEOPLE";
        System.out.println(v.compareTo(v1));
        System.out.println(v.compareToIgnoreCase(v2));

        //start with
        System.out.println(v.startsWith("p"));
        //end with
        System.out.println(v.endsWith("h"));
        //replace
        System.out.println(v.replace('n','f' ));
        System.out.println(v.replace('e','E'));

        System.out.println("##########");

        //upper and lower case
        System.out.println(v.toUpperCase());
        System.out.println(v.toLowerCase());
    }


}
