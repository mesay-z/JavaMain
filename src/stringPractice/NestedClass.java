package stringPractice;

//can create class inside another class
//most of the time we use private coz don't access by d/t class
class Outer {
    int a;

    public void show() {

    }

    class Inner {
        public void show1() {
            System.out.println("football");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer refVar = new Outer();
        refVar.show();
        //outer class.inner class refVarfor inner=refVarfor outer.new Inner class();
        Outer.Inner refVar1 = refVar.new Inner();
        refVar1.show1();
        refVar1.show1();
    }

}
