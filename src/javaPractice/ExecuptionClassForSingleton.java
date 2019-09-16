package javaPractice;

public class ExecuptionClassForSingleton {

    public static void main(String[] args) {
        TestClassForSingleton testClassForSingleton= new TestClassForSingleton();
        TestFileForeSingleton testFileForeSingleton=TestFileForeSingleton.getInstance();

        //testClassForSingleton.x=testClassForSingleton.x.toUpperCase();
        //testFileForeSingleton.a=testFileForeSingleton.a.toUpperCase();

        System.out.println(testClassForSingleton.x);
        System.out.println(testClassForSingleton.x.toUpperCase());
        System.out.println("**********");
        System.out.println(testFileForeSingleton.a);
        System.out.println(testFileForeSingleton.a.toUpperCase());
    }
}