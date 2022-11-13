import java.util.*;

class SameSunstringCount {

    public static int numberOfSubstrings(String s) {

        HashMap<Character, Integer> map=new HashMap<>();

        int st=0, matched=0, c=0;

        for(int i=0; i<s.length(); i++){

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

            if(map.get(s.charAt(i))==1) matched++;

            while(matched==3){

                if(map.containsKey(s.charAt(st))){

                    if(map.get(s.charAt(st))==1) matched--;

                    map.put(s.charAt(st), map.get(s.charAt(st))-1);
                }
                st++;
            }
            c+=st;
        }
        return c;
    }

    public static void main(String args[]){
        String s = "aabca";
        

        System.out.println(numberOfSubstrings(s));

    }
}
