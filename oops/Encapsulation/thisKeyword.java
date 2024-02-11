class Student {
    private int age;
    private String Name;
    private String lastName;

    public void setData1(int age) {
        age = age;  // local varibale >> instance variable  (SHADOWING PROBLEM)
    }

    public void setData4(int a){
        age=a;
    }

    public void setData2() {
        Name = "Harsh";
    }

    public void setData3(String lastName) {
        this.lastName = lastName;
    }

    public void show() {
        System.out.println(Name + " " + lastName + " " + age);
    }

}

public class thisKeyword {
    public static void main(String[] args) {

        Student obj = new Student();
        Student obj1 = new Student();

        // obj.setData1(18);   //still the value will be null because local variable > instance variable
        // obj1.setData1(25);

        // obj.setData4(18);     // this will work as we are not giving the same variable name as the instance variable
        // obj1.setData4(25);

        obj.setData3("Harsh");
        obj1.setData3("Anuj");


        obj1.show();
        obj.show();
    }
}
