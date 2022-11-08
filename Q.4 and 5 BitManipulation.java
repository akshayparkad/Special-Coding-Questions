/*
Given two binary strings (strings containing only 1s and 0s) return their sum (also as a
binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0
Ex: Given the following binary strings...
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return "1"
*/

import java.util.*;

public class BitManipulation {

    public static String addTwoBinary(String a, String b) {

        int alen = a.length();
        int blen = b.length();
        String result = "";

        int len = Math.max(alen, blen);
        int carry = 0;
        for (int i = 0; i < len; i++) {
            int aDigit = i < alen ? a.charAt(alen - 1 - i) - '0' : 0;
            int bDigit = i < blen ? b.charAt(blen - 1 - i) - '0' : 0;

            int total = aDigit + bDigit + carry;
            result = total % 2 + result;
            carry = total / 2;

        }
        if (carry == 1)
            result = carry + result;
        return result;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(addTwoBinary(a, b));
        sc.close();
    }

}
