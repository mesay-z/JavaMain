package javaPractice;

public class TestFileForeSingleton {
    String a;
    private static TestFileForeSingleton testFileForeSingleton=null;
    private TestFileForeSingleton(){
        a="i had good vacation in montreal";
    }
    //TestFileForeSingleton testFileForeSingleton=new TestFileForeSingleton();
    public static TestFileForeSingleton getInstance() {
        if(testFileForeSingleton == null) {
            testFileForeSingleton = new TestFileForeSingleton();
        }
        return testFileForeSingleton;
    }
}
