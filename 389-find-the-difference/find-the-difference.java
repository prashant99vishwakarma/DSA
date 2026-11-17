class Solution {
    public char findTheDifference(String s, String t) {
        int first=0;
        int second=0;
        for(int i=0;i<s.length();i++){
            first+=(int)(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            second+=(int)(t.charAt(i));
        }

        return (char)(second-first);
    }
}