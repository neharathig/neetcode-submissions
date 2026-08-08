class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
  
        int[]count  = new int[26];

        int n = s.length();

        for(int i =0; i < n; i++){
            char ch = s.charAt(i);
            count[ch-97]++;
            ch = t.charAt(i);
            count[ch-97]--;
        }

       for(int c : count){
        if(c!=0){
            return false;
        }
       }

        return true;

    }
}
