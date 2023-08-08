class Solution {
    public int arrangeCoins(int n) {
         int num = n;
        int count = 0;
        int row =1;
        while(num >0){
            for (int i = row; i <= row ; i++) {
                num = num-i;


            }if(num>=0) {
                count++;
                row++;
            }
        }

        return count;
        
    }
}
