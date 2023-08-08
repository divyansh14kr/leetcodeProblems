class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        return difference(ransomNote, magazine);
    }
       static boolean difference(String ransomNote, String magazine){
      int[] arr1 = new int[26];
      boolean ans = true;
      int[] arr2 = new int[26];
      for(char c : ransomNote.toCharArray()){
          arr1[c- 'a']++;
      }
      for (char c: magazine.toCharArray()){
          arr2[c - 'a']++;
      }
        for (int i = 0; i <arr1.length ; i++) {
            if( arr1[i] > arr2[i]){
                ans = false;
            }

        }
        return ans;
    }
}
