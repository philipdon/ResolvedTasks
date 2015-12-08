package Task1;

import java.util.Arrays;
import java.util.Scanner;

// intput 2415 2 3 6 9 666 -559 100 700 123 456 1212 3526
public class number6 {


    public static void main(String[] args) {
        System.out.println("Input integer numbers with spaces");
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        System.out.println(arr.length);

        int[] arrint = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrint[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(Arrays.toString(arrint));

        number6 obj = new number6();
        obj.EvenNum(arrint);
        obj.OddNum(arrint);
        obj.MaxMinInt(arrint);
        obj.DivThreeNine(arrint);
        obj.DivSevenFive(arrint);
        obj.ThreeChatacterNumNonRepeatChar(arrint);
        obj.LuckyNum(arrint);
        obj.HalfSum(arrint);
    }


    void EvenNum(int[] arr) {
        System.out.print("6.1 Even Numbers: ");
        for (int x : arr) {
            if ((x % 2 == 0) && (x > 0))
                System.out.print(x + " ");
        }
        System.out.println();
    }

    void OddNum(int[] arr) {
        System.out.print("6.1 Odd Numbers: ");
        for (int x : arr) {
            if ((x % 2 != 0) && (x > 0))
                System.out.print(x + " ");
        }
        System.out.println();
    }

    void MaxMinInt(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("6.2 Max value: " + max + "   Min value: " + min);
    }

    void DivThreeNine(int[] arr) {
        System.out.print("6.3 Numbers, which divide 3 and 9: ");
        for (int x : arr) {
            if ((x % 9 == 0) && (x % 3 == 0))
                System.out.print(x + " ");
        }
        System.out.println();
    }

    void DivSevenFive(int[] arr) {
        System.out.print("6.4 Numbers, which divide on 5 and 7: ");
        for (int x : arr) {
            if ((x % 5 == 0) && (x % 7 == 0))
                System.out.print(x + " ");
        }
        System.out.println();
    }

    void ThreeChatacterNumNonRepeatChar(int[] arr) {
        System.out.print("6.5 Numbers, which have 3 characters with no repeat in numbers: ");
        for (int x : arr) {
            String s = Integer.toString(x);
            if (s.length() == 3) {
                if (((s.charAt(0)) != (s.charAt(1))) && ((s.charAt(0)) != (s.charAt(2))) && (((s.charAt(1)) != (s.charAt(2))))) {
                    System.out.print(x + " ");
                }
            }
        }
        System.out.println();
    }

    void LuckyNum(int[] arr) {
        System.out.print("6.6 Lucky numbers: ");
        for (int x : arr) {
            String s = Integer.toString(x);
            if (s.length() % 2 == 0) {
                char[] ch = s.toCharArray();
                int sum1 = 0, sum2 = 0;
                if (ch[0] == '-') {
                    continue;
                }
                for (int i = 0; i < ch.length; i++) {
                    if ((i + 1) <= (ch.length / 2))
                        sum1 += Character.getNumericValue(ch[i]);
                    else
                        sum2 += Character.getNumericValue(ch[i]);
                }
                if (sum1 == sum2)
                    System.out.print(x + " ");

            }
        }
        System.out.println();
    }

    void HalfSum(int[] arr) {
        System.out.print("6.7 Elements, which are equal to half sum of neighbour elements are: ");
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == ((arr[i - 1] + arr[i + 1]) / 2))
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
