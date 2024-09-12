package com.app.test;

public class RemoveDuplicate {

	 public static int removeDuplicates(int[] nums) {
		 if(nums.length<=2)
		 {
			 return nums.length;
		 }
		        int j=2;
		        for(int i=2;i<nums.length;i++)
		        {
		            if(nums[i]!=nums[j-2])
		            {
		                nums[j]=nums[i];
		                j++;
		            }
		        }
		        return j;

		    }
	
	
//	public static int removeDuplicates(int[] nums) {
//        if (nums.length <= 2) {
//            return nums.length;
//        }
//
//        int index = 2; // Start from the third element
//        for (int i = 2; i < nums.length; i++) {
//            if (nums[i] != nums[index - 2]) {
//                nums[index++] = nums[i];
//            }
//        }
//        return index;
//    }

	
	public static void main(String[] args) {
		int arr[]= {2,3,4,2,2,3,2,3,3,3,6,7};
		System.out.println(removeDuplicates(arr));
	}

}
