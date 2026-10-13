class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        int n = str.length()-1;
        if (str.length()==0) return 0;

        int sign = 1;
        int index=0;
        if(str.charAt(0)=='+'||str.charAt(0)=='-'){
            sign = (str.charAt(0)=='-')? -1:1;
            index =1;
        }

        long result =0;
        while(index<str.length()){
            char c = str.charAt(index);
            if(!Character.isDigit(c)) break;
            if(Character.isDigit(c)){
                int digit = c-'0';
                result = result *10 +digit;
            }
            if(sign*result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign*result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            index++;
            
        }
         return (int)(sign*result);

    }
}