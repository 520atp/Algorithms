package Array;

import javax.print.attribute.standard.NumberUpSupported;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class JumpGame {
	 static boolean bool;
	public static void main(String[] args) {
		JumpGame jGame=new JumpGame();
		int[] in=new int[]{8,2,1,0,4};
		boolean b=jGame.jumpCan(in);
		System.out.println(b);
	}
	
	
	//用递归来完成
	 public boolean canJump(int[] nums) {
		 
		 if(nums.length!=0){
			this.bool= jump(nums,bool,0);
		 }
		  return this.bool;    
	    }
	 public boolean jump(int[] num,boolean bool,int position){
		 if(position==num.length-1){
			this.bool=true;
		 }else if(position<num.length-1&&!(num[position]==0)){
			 jump(num,bool,position+num[position]);
		 }
		return this.bool;  
	 }
	 
	 //不用递归来做
     public boolean jump(int[] nums) {
	   int position=0;
	   int m=0;
	   while((position==nums.length-1)||(position<nums.length-1&&!(nums[position]==0))){
	    if((position==nums.length-1)){
	    	this.bool=true;
	    }else if(position<nums.length-1&&!(nums[position]==0)){
	        for(int i=0;i<nums[position]+1;i++){
	        	position= position+nums[i];
	        }
	    } 
	  }
	     return this.bool;	    
   }
 
   //第三种方法
    public boolean jumpCan(int[] nums){
   	 int reach = 1;  
     for (int i  = 0; i < reach && reach < nums.length; i++) {  
         reach = Math.max(reach, 1 + i + nums[i]);  
     }  
     return reach >= nums.length;  
   }
}
