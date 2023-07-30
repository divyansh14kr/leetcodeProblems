public class validAnagram242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);

    }
    static boolean isAnagram(String s, String t){
         if(s.length() != t.length()){
             return false;
         }
        int[] count1 = new int[26];
         int[] count2 = new int[26];
        for (int i = 0; i <s.length() ; i++) {
             count1[(int)(s.charAt(i) - 'a')]++;
        }
        for (int j = 0; j <t.length() ; j++) {
            count2[(int)(t.charAt(j) - 'a')]++;
        }
        for (int i = 0; i < count1.length ; i++) {
            if(count1[i] != count2[i]){
                return false;
            }

        }
        return true;
    }
}
