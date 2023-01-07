package java.interview.innerclass.and.subclass;

public class OuterClass {
    int outer = 1;

    public void print() {
        System.out.println("Outer Class: ");
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public class InnerClass {
        private void print() {
            System.out.println("Inner Class: " + outer);
        }
    }
}
