public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int num = x;
        if(x < 0){
            return false;
        }else{
            while(x != 0) {
    
                 // get last digit from num
                int digit = x % 10;
                 reversed = reversed * 10 + digit;

                 // remove the last digit from num
                 x /= 10;
           }
           if(reversed == num){
               return true;
           }
           return false;
        }
   
    }
    
}
