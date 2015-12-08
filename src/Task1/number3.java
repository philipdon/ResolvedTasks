package Task1;

import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        System.out.print("Choose quantity of random numbers= ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print("Random numbers= ");
        for (int j=0;j<i;j++){
            System.out.print((int) (Math.random()*10)+" ");
        }

        System.out.printf("%nRandom numbers= %n" );
        for (int j=0;j<i;j++){
            System.out.println((int) (Math.random()*10)+" ");
        }


    }
}
