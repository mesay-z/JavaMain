package stringPractice;
//for static method and static class
class Outer1 {
    int a;

    public static void show1() {
        System.out.println("football");
    }

    static class Inner {  ///inner class belongs to outer class
        public void show1() {
            System.out.println("football");
        }
    }

}
public class NestedClass1 {
    public static void main(String[] args) {
        Outer1.Inner refVar=new Outer1.Inner();
        refVar.show1();

    }
}
