class A{
    void show(){
        System.out.println("in show");
    }
    /*static*/ class B{     // when we run this program there is A$B.class
        public void display(){
            System.out.println("displaying");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();

        A.B obj1 = obj.new B();     // to create the objext of the inner class B 
        //A.B tells us where is the class- B, A ke andar hai
        // obj.new B(); creating object with help of A ka object

        // if we make the class B as static then
        // A.B obj2 = new A.B();

        obj.show();
        obj1.display();
    }
}
/*
 * inner class is of 3 types
 * 1. member class above example
 * 2. static inner class- we have seen in linked list when we create the node inner class (only inner class can be static)
 * 3. anonymous inner class- 
 */
