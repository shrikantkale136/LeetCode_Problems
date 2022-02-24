package easy_problems;

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
