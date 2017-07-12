package Stack;

import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

//两个栈实现一个队列

public class TwoIntoDuiLie {

	public static void main(String[] args) {
		 int[] num=new int[]{3,5,8,12,23};
		 demo(num);

	}
	
   public static void demo(int[] n){
	  Stack<Integer>stack1=new Stack<>();
	  Stack<Integer>stack2=new Stack<>();
	  
	  for(int i=0;i<n.length;i++){
		  stack1.push(n[i]);
	  }
	  
	  while(stack1.size()>1){
		  stack2.push(stack1.pop());
	  }
	  
	  while(stack2.size()>0){
		  if(stack1.isEmpty()){
			  System.out.println(stack2.pop()); 
		  }else{
			  System.out.println(stack1.pop()); 
		  }
		   
			 
		  		  
		 
	  }   
   } 
}
