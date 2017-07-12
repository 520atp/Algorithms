package Array;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class threeSum {

	public static void main(String[] args) {
		 int[] in=new int[]{-1,0,1,2,3};
		 threeSum t=new threeSum();
		 int[] m=t.threesum(in);
		 for(int i=0;i<3;i++){
			 System.out.println(m[i]);
		 }
	}
	
	 public int[] threesum(int[] nums) {
		 int[] k=new int[3];
		 List list=new List();
		 Map< Integer, Integer> map=new HashMap<>(); 
		 for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(map.containsKey(0-nums[i]-nums[j])){
					 k[0]=nums[i];
					 k[1]=nums[j];
					 k[2]=-nums[i]-nums[j];
					 
					 break;
				}else{
					map.put(nums[j], j);
				}
			} 
		 }
		return k;
	        
	    }

}
