package com.company.leetcodeQuestions.gSet;

public class CanJump {
	public boolean canJump(int[] nums) {
		int last_pos = nums.length-1;
		//start from second last and see if that is reachable till last
		for (int jumpCounter = nums.length-2; jumpCounter >=0 ; jumpCounter--) {
			if(jumpCounter+nums[jumpCounter]>= last_pos)
				last_pos=jumpCounter;

		}
		return last_pos==0;
	}
}
