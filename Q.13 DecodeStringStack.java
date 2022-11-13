import java.util.*;

class DecodeStringStack {
    

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c != ']') 
                stack.push(c); 
            
            else 
            {
                String sub="";
                while(!stack.isEmpty() && Character.isLetter(stack.peek()))
                    sub=stack.pop()+sub;
                stack.pop(); 
                String sb="";
                while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                    sb=stack.pop()+sb;
                   
                    
                int count = Integer.valueOf(sb); 
                while(count > 0)
                {
                    for(char ch : sub.toCharArray())  
                        stack.push(ch);
                    count--;
                }
            }
        }
       String str="";
        while(!stack.isEmpty())
           str=stack.pop()+str;

        return str;
    }

    public static void main(String args[]){
        String s = "3[a]2[b]1[c]";
        

        System.out.println(decodeString(s));

    }

}
