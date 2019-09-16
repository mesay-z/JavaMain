package mentoring1;

public class StringSplit {
    public static void main(String[] args) {
       String a="the most richest countries in the world";
   String[] words=a.split("c");
       for(String n:words)
           System.out.println(n);


        String st="Java is a programming language. Java is also an island of Indonesia";
        String [] words1 =st.split(" ");
        System.out.println(words1.length);


    }
}