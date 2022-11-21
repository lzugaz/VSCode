public class DivideTwoIntegers {
    public static void main(String[] args){
        long result = divide(-2147483648,-1);
        System.out.print(result);
    }
    public static int divide(int dividend, int divisor) {
        
        if(dividend > (Math.pow(2, 31) - 1)){
            return (int) (Math.pow(2, 31) - 1);
        }else if(dividend < (Math.pow(-2, 31))){
            return (int)(Math.pow(-2, 31));
        }else{
            if(dividend==Integer.MIN_VALUE && divisor==-1){
             return Integer.MAX_VALUE;
            }
            double result;
            result = dividend/divisor;
            result = Math.floor(result);
            return (int)result;
        
        
    }
}
}

//     public static void main(String[] args){
//         int result = DivideTwoIntegers.divide(-2147483648,3);
//     }
// }
