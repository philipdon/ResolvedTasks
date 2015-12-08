package Task1;


import java.util.Arrays;
import java.util.Collections;


public class number2 {
    public static void main(String[] args ) {
        System.out.println(Arrays.toString(args));
        Collections.reverse(Arrays.asList(args));
        System.out.println(Arrays.toString(args));
    }
}
