package SlidingWindow;

/*minimum no of characters to append to a string resultWord so that it will become
subsequence of another string searchWord
 */

public class AmazonOA3 {
    public static void main(String[] args) {
        String searchWord = "abcz";
        String resultWord = "azdb";
        int i = 0, j = 0;
        while(i<resultWord.length() && j<searchWord.length()){
            if(resultWord.charAt(i)==searchWord.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(resultWord.length()-i);
    }
}
