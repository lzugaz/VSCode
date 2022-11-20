public class CountOddNumbersAnIntervalRange {
    public int countOdds(int low, int high) {
        //total numbers in the range low to high
        int total= high-low+1;
        
        
        if (low % 2 != 0 && high % 2 != 0) {
           
            return total/2 + 1;
        }
        else
            return total/2;    
    }
}
