public class isPalindrome {

    static public boolean isPalindrome(String s){
        return isPalindrome(s,0,s.length()-1);
    }

    static public boolean isPalindrome(String s, int low, int high){
        if (high<=low)
            return true;
        else if (s.charAt(low)!=s.charAt(high))
            return false;
        else
            return isPalindrome(s,low+1,high-1);
    }

    static public boolean nIsPalindrome(String s){
        return nIsPalindrome(s,0,s.length()-1);
    }

    static public boolean nIsPalindrome(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else {
            boolean result=false;
            while (s.charAt(low) == s.charAt(high) && s.charAt(low)!=(s.length()/2)){
                low++;
                high--;
                if (high-low==1&&s.charAt(low)==s.charAt(high)) {
                    result = true;
                    break;
                } else if (high==low){
                    result=true;
                    break;
                }
            }return result;
        }
    }
}
