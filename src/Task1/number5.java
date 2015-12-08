package Task1;

/**
 * Created by Admin on 07.12.2015.
 */
public class number5 {
    public static void main(String[] args) {

        int sum = 0, mult = 1;

        for (String x : args) {
            sum += Integer.parseInt(x);
            mult *= Integer.parseInt(x);
        }
        System.out.printf("Total sum is: " + sum + "%nTotal multly is: " + mult);

    }
}
