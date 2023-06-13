package MyTask;


abstract class NestedClass {
    public abstract void abstractMethod(); 
}

class OuterClass {
    static int i = 05; 
    int instanceVariable = 97; 

    public void method() {
        System.out.println("i == " + ++i); 
    }

    static class InnerClass extends NestedClass {
      

        public void display() {
            System.out.println("i == " + i);
            // System.out.println("instanceVariable == " + instanceVariable); 
        }

        @Override
        public void abstractMethod() {
            System.out.println("Abstract function used"); 
        }
    }

    public static void main(String[] a) {
        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        ic.display(); 
        ic.abstractMethod(); 

        OuterClass oc = new OuterClass();
        oc.method(); 
    }
}