/*

This question is asked by Amazon. Given a string representing the sequence of moves a
robot vacuum makes, return whether or not it will return to its original position. The
string will only contain L, R, U, and D characters, representing left, right, up, and down
respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true

*/

import java.util.*;

public class RobotMove {
    
    public static boolean robotPosition(String moves){

        int n = moves.length();
        // int right = 0;
        // int up = 0;

        if(n % 2 != 0 ){  //if string length is odd then return false
            return false; //improved version
        }

        int counter = 0;

        for(int i=0; i<n; i++){

            char ch = moves.charAt(i);

            if(ch == 'R' || ch == 'r' || ch == 'U' || ch =='u'){
                
                counter++;

            }else if(ch == 'L' || ch == 'l' || ch == 'D' || ch =='d'){

                counter--;
            }

        }

            if(counter == 0)
                return true;
           
            return false;


    }

    //         switch(ch){

    //             case 'R' : right++;  //increament in right if goes right
    //                        break;
    //             case 'L' : right--; //decreament in right if goes left 
    //                        break;
    //             case 'U' : up++;   //increament in up if goes up
    //                        break;
    //             case 'D' : up--; //decereament in up if goes down
    //                        break;
    //             default :  System.out.println("Invalid Input");;

    //         }

    //     }

    //     if( right == 0 && up == 0){
    //         return true;
    //     }

    //     return false;
    // }

    public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(robotPosition(str));
        sc.close();
	}
    
}
