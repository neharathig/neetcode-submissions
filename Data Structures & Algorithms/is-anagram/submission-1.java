class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] S = new int[26];
        int[] T = new int[26];

        int n = s.length();

        for(int i =0; i < n; i++){
            char ch = s.charAt(i);
            S[ch-97]++;
            ch = t.charAt(i);
            T[ch-97]++;
        }

        for(int i=0; i <26; i++){
            if(S[i] != T[i]){
                return false;
            }
        }

        return true;

    }
}
