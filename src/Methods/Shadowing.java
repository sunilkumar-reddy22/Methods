package Methods;

public class Shadowing {
   static int x  = 90;
//In order to use shadowing we have to use static variable, and static variables are dependent.
    public static void main(String[] args) {
        System.out.println(x);
        //crating new variable with same name of shadowing.
        int x = 20;
        System.out.println(x);
        fun(); //we cannot pass the arguments with shadowing value cause in this block of code we have another variable initialized.


    }
    static void fun(){
        System.out.println(x); //it prints the shadowing value.
    }
}
