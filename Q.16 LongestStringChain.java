import java.util.*;

class LongestStringChain {
    
    public static int longestStrChain(String[] words) {
        
        Arrays.sort(words , new Comparator<>(){
            
            public int compare(String s1 , String s2){
                return s1.length() - s2.length();
            }
        });
        
      
        
        int n =words.length;
        int maxLen =1;
        
        int[] dp = new int[n];
        Arrays.fill(dp , 1);
        
        for(int i =0 ;i< n ;i++){
            for(int j =0; j < i ;j++){
                
                
                if(IsChainPossible(words[i] , words[j])  && dp[j]+1 > dp[i]){
                    dp[i] = dp[j] +1;
                    maxLen =Math.max(maxLen , dp[i]);
                }
                
            }
        }
        
        return maxLen;
        
    }
    
   static boolean IsChainPossible(String nextChainStr , String prevChainStr){
        int firstPtr = 0;
        int secondPtr =0;
        
        int n = nextChainStr.length();
        int m = prevChainStr.length();
        
        while(firstPtr < n && m+1 == n){
            if(secondPtr <m && 
               prevChainStr.charAt(secondPtr) == nextChainStr.charAt(firstPtr)){
                firstPtr++;
                secondPtr++;
            }else{
                firstPtr++;
            }
        }
        
        if(firstPtr == n && secondPtr == m){
            return true;
        }
        
        return false;
        
        
    }

    public static void main(String args[]) {
        
        String words[] = {"a", "ab", "abc"};
       
        System.out.println(longestStrChain(words));
    }

}
