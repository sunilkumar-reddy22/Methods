package Methods;
import java.util.Arrays;
public class VarArguments {
    //if the user is not sure how many arguments is giving then we have to use variable length arguments.
    public static void main(String[] args) {
      //  fun(1,2,3,4,5,65,89,90);
        multiple(4,5,78463989);
    }
    static void multiple(int a, int b ,int ...v){
        System.out.println(Arrays.toString(a,b,v));
    }
}
