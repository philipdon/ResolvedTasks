package Task1;


import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pwrd = "qwerty123";
        if (pwrd.hashCode()== s.hashCode())
            System.out.println("Password correct");
        else
            System.out.println("Password incorrect");

    }
}
