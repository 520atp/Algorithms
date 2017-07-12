package Array;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] arg){
        int[] num=new int[]{12,9,23,16,19,27,31};
        twoSum s=new twoSum();
        int[] in=s.twosum(num,46);
        for(int i=0;i<2;i++){
            System.out.println(in[i]);
        }
    }
    
    
    public int[] twosum(int[] nums, int target) {
        int[] k=new int[2];
     Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                k[1]=i;
                k[0]=map.get(target-nums[i]);
                break;
            }else{
                map.put(nums[i],i);
            }
            
        }
        
        return k;
    }
}