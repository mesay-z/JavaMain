package trayCatch;

public class TrayCatch1 {
    public static void main(String[] args) {
        try {
            int[] a={2,4,6,7};
            System.out.println(a[4]);
        }catch(Exception e){
            System.out.println("Exception has happened");
        }
    }
}
