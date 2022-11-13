class MergeStringsAlternate {


    public static String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder();

        for(; left < word1.length() && right < word2.length(); left++, right++){
            sb.append(word1.charAt(left));
            sb.append(word2.charAt(right));
        }
        if(left < word1.length()){
            sb.append(word1.substring(left));
        }else{
            sb.append(word2.substring(right));
        }
        return sb.toString();
    }

 public static void main(String args[]){
        String s = "abc";
        String t = "def";

        System.out.println(mergeAlternately(s, t));

    }

}
