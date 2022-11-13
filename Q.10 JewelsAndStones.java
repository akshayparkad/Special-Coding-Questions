class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
    int answer = 0;
    char a;
    for (int i = 0; i < jewels.length(); i++) {
    a = jewels.charAt(i);
    answer = answer + ans(a,stones);
    }
    return answer;
    }
    
    public static int ans(char a, String stones) {
        
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (a == stones.charAt(i)) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String jewels = "Af";
        String stones = "AaaddfFf";

        System.out.println(numJewelsInStones(jewels, stones));

    }

}
