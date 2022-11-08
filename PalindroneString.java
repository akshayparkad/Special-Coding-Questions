/*Note: a palindrome is a sequence of characters that reads the same forwards and
backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true */


import java.util.Scanner;

class PalindroneString{

	public static boolean PalindroneCheck(String str) {
        str = str.replaceAll("\\str", "");
		
        str = str.toLowerCase();
		
        String temp = "";
		
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                temp = temp + str.charAt(i);
            }
        }
		
        for (int i = 0; i < temp.length(); i++) {
			
            if (temp.charAt(i) != temp.charAt(temp.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(PalindroneCheck(str));
	}

}

