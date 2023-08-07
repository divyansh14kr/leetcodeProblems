lass Solution {
    public String largestNumber(int[] nums) {
        return max(nums);
    }
         static String max(int[] number){
        for (int i = 0; i <number.length ; i++) {
            for (int j = i+1; j < number.length ; j++) {
            String temp1  = String.valueOf(number[i])+String.valueOf(number[j]);
            String temp2  = String.valueOf(number[j])+String.valueOf(number[i]);
            if(temp1.compareTo(temp2) <0){
                swap(number, i ,j);
            }
            }
        }
        StringBuilder ansB = new StringBuilder();
        if(number[0] ==0){
            return"0";
        }
        for(int i : number){
            ansB.append(i);
        }
        String ans = ansB.toString();
        return ans;
    }


    private static void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
}
