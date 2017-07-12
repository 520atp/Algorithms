package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		 String string="pwwkew";
		 LongestSubstringWithoutRepeatingCharacters l=new LongestSubstringWithoutRepeatingCharacters();
		int t= l.length(string);
		  System.out.println(t);
	}
	
   public int length(String s) {
	   if (s.length()==0) return 0;
       HashMap<Character, Integer> map = new HashMap<Character, Integer>();
       
       int max=0;
       for (int i=0, j=0; i<s.length(); ++i){
           if (map.containsKey(s.charAt(i))){
                
           }
          
       }
       return max;
        
    }
}
