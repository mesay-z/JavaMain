package stringPractice;

public class NestedOuterClass {
    String x="view";
    public void glass(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        NestedOuterClass refVar=new NestedOuterClass();
        refVar.glass();
        //InnerClass refVar1=new InnerClass(); //if the inner class is static----public static class InnerClass
        //refVar1.glass1();
        NestedOuterClass.InnerClass refVar1=refVar.new InnerClass(); //if the inner class is non_static----public class InnerClass
        refVar1.glass1();
    }

    private class InnerClass{
        String y="target";
        public void glass1(){
            System.out.println(y);
        }
    }
}
