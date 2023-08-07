class Solution {
    public int minimizedStringLength(String s) {
         int[] arr = new int[26];
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        int count =0;
        for(int i : arr){
            if(i !=0){
                count++;
            }
        }
        return count;
        
    }
}
