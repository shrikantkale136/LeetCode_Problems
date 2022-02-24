package easy_problems;

/**
 * @author shrikantkale
 * Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
	       int complement; 
	        //loop to check every element in the array
	        for (int i = 0; i<nums.length; i++) {  
	            complement = target - nums[i];
	            //loop to find complement of current element
	            for (int j = i+1; j<nums.length; j++) { 
	                if (nums[j] == complement) {
	                    return new int[] {i, j};
	                }
	            }            
	        }
	        return null;
	    }
    public static void main(String args[])
    {
        int[] a = new int[]{1 , 4 , 5 , 11 , 12};
        for(int x : twoSum(a , 5))
            System.out.print(x + " ");
    }

}
