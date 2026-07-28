package Methods;

public class Redo {
    public static void main(String[] args) {
       String myGreet = greet("sunil");
        System.out.println(myGreet);
       int ans = sum(50,30);
        System.out.println(ans);
    }

    static String greet(String name) {
        String message = "hello " + name;
        return message;

    }
    static int sum(int a,int b){
        int add = a + b;
        return add;
    }
}
