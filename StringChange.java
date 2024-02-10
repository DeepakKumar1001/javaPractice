public class StringChange {
    public static int findFirstOccurrence(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }

        int hL = haystack.length();
        int nL = needle.length();
        int j = 0 ;
        for (int i = 0; i < hL ; i++) {
           if(haystack.charAt(i) == needle.charAt(j)){
            j++;
           }
           else{
            i = i-j;
            j=0;
           }

           if(j == nL){
            return i - nL + 1;
           }
           
        }
        return -1; // Needle not found in haystack
    }

    public static void main(String[] args) {
        String haystack = "rakeshkeshu";
        String needle = " ";

        int index = findFirstOccurrence(haystack, needle);
        System.out.println(index);
        
    }
}
