package hashMap;

import java.util.HashMap;
import java.util.Map;

import org.omg.PortableInterceptor.IORInterceptor;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		  int[] in=new int[]{1,1};
		  int ki=1;
	SubarraySumEqualsK s=new SubarraySumEqualsK();
	int m=s.subSum(in,ki);
	System.out.println(m);
		  
		 

	}
	
	//第一种暴力方法求解
	public int subarraySum(int[] num,int k){
		int total;
		int i;
		int j;
		int n=0;
		for( i=0;i<num.length;i++){
			total=0;
		 for( j=i;j<num.length;j++){
			 total=num[j]+total;
			if(total==k){
				n=n+1; 
			}	 
		 }
		}
		return n;	
	}
	
	//第二种方法hashmap求解发
	public  int subSum(int[] num,int k){
		int total=0;
		int result=0;
		 Map<Integer, Integer>map=new HashMap<>();
		   map.put(0,1);
		   
		   for(int i=0;i<num.length;i++){
			  total+=num[i];
			  result+=map.getOrDefault(total-k,0);
			  map.put(total,map.getOrDefault(total,1));
			  
		  }
		  
		  
		 
		return result; 	
	}
	
}
