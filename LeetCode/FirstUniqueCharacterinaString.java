import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(i, s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            Character n = s.charAt(i);
            if(map.containsKey(n)){
                
            }
        }
        return 0; // temp
    }
}
