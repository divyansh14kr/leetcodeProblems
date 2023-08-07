class Solution {
    public String removeTrailingZeros(String num) {
           char[] arr = num.toCharArray();
        int count = 0;
        int end_index = arr.length;
        int i = arr.length-1;
        for (int j = i; j >0; j--) {
            if(arr[j] == '0'){
                count++;
            }else{
                break;
            }
        }
        return num.substring(0,end_index-count);
        
    }
}
