public class Concatenation {
    

    public static void main(String[] args) {
        
        String s1= "pw";
        String s2 = new String("PW");

        System.out.println(s1);   // is still referring to the original object

        System.out.println(s1.concat("skills"));  // we are directly printing the unreferred object 
        System.out.println(s2.concat("SKILLS"));  // we are directly printing the unreferred object 

        s1=s1.concat(" Hello");  //pw hello
        System.out.println(s1);   // now we have changed the refrence object to the new object i.e. s1 is now pointing towards the "pw hello" object instead of "pw" (String )

        s2 = s1.concat(" Harsh");
        System.out.println(s2);
    }
}
