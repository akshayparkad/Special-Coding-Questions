/*

This question is asked by Google. Given a string, return whether or not it uses
capitalization correctly. A string correctly uses capitalization if all letters are capitalized,
no letters are capitalized, or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true

*/


import java.util.*;

public class Capitalization {

    public static boolean CapitalizationCheck(String str){
        
        int n = str.length();

        if(n <= 1)
            return false;

        //first check if first two letters are capital and then others
        
        if(isUpperCase(str.charAt(0)) && isUpperCase(str.charAt(1))){

            for(int i=2; i<n; i++){

                if(!isUpperCase(str.charAt(i))) //if not then return false.. like AKshay
                    return false;
            }
        } else {
        
            //now we already know first two are not uppercase... now just check if remaining are upper case or not

            for(int i=1; i<n; i++){
                
                if(isUpperCase(str.charAt(i)))  // if remaining are upper case then it will become like akSHAy which is false.
                    return false;
            }
        }

        return true; //other than this ..each and every condition is true.
    }

    public static boolean isUpperCase(char ch){ //method wll check if given character is uppercase or not..

        if(ch >= 'A' && ch <= 'B'){ 
            return true;
        }
        return false;
    }

    public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(CapitalizationCheck(str));
        sc.close();
	}

}
