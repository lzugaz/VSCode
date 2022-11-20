public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length() < 26){
            return false;
        }
        for (int i = 0; i < 26; i++){
            
            char c = (char)('a' + i);
            if(sentence.indexOf(c) == -1){
                return false;
            }
        }
       return true;
    }
}
