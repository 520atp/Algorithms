package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.PUBLIC_MEMBER;


public class letterCombinations {

	public static void main(String[] args) {
		letterCombinations l=new letterCombinations();
	   List<String> li=l.combinations("36");
	   System.out.println(li);
		 
		 
	}
	
	//用hashmap未能实现
	public static List<String> letter(String num){
		Map<Character,String>map=new HashMap<>();
		map.put('2',"abc");
		map.put('3',"def");
		map.put('4',"ghi");
		map.put('5',"jkl");
		map.put('6',"mno");
		map.put('7',"pqs");
		map.put('8',"wxyz");
		char[] ch=num.toCharArray();
		List<List<Character>>list=new ArrayList<>();
		  int n=0;
		 char[][] ar=null;
		 char[] cha=null;
		for(int i=0;i<ch.length;i++){
			if(map.containsKey(ch[i])){
			  cha=map.get(ch[i]).toCharArray();
			  System.out.println(cha);
			  ++n;
			   
			  }  
			
		}
		return null;
	}
	
	//用递归实现
	
	public List<String> combinations(String num){
	List<String>list=new ArrayList<>();
	  if(!num.isEmpty()){
		  sud(num,"",0,list);
	  }
	return list;
		
	}
	
	//递归调用的方法
	public static void sud(String num,String cont,int n,List<String> list){
		if(n==num.length()){
			list.add(cont);
			return;
		}
		String[] str =ca(num.charAt(n));
		for(int i=0;i<str.length;i++){
			sud(num, cont+str[i], n+1, list);
		}
	}
	
	//所有情况
		 static String[] ca(char c){
			switch (c) {
			case '2':
				return new String[]{"a","b","c"};
	        case '3':
	        	return new String[]{"d","e","f"};
	        case '4':
	        	return new String[]{"g","h","i"};	 
	        case '5':
	        	return new String[]{"j","k","l"};	
	        case '6':
	        	return new String[]{"m","n","o"};
	        case '7':
	        	return new String[]{"p","q","r","s"};
	        case '8':
	        	return new String[]{"t","u","v"};
	        case '9':
	        	return new String[]{"w","x","y","z"};
	        
	  
			}
			return new String[]{};
		   
		}
	
}
