package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

	public static void main(String[] args) {
		 String[]num=new String[]{"art","rta","atr","my","ym","opi"};
		 GroupAnagrams g=new GroupAnagrams();
		  List<List<String>> list= g.Group(num);
		   System.out.println(list);
			  
	 
		 

	}
	
	public List<List<String>> Group(String[] gres){
		 
		Map<String,List<String>>map=new HashMap<>();
		String num="";
		for(int i=0;i<gres.length;i++){
		 char[]ch=gres[i].toCharArray();
		 Arrays.sort(ch);
		 num=String.valueOf(ch);
		 if(map.containsKey(num)){
			 map.get(num).add(gres[i]); 
		 }else{
			 List<String>list=new ArrayList<>();
			 list.add(gres[i]);
			 map.put(num,list);
		 }  
	 }		 
		//第二种解决方案通过ArrayList的构造方法来将HashMap中value添加到collection中
        List<List<String>>li =new ArrayList<>(map.values());  
	    
		return li ;	
  }

}
