package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

			/*Arrays.sort(nums);
			int[] returnArray=new int[2];
			int index;
			for (int i=0;i<nums.length;i++) {
				if((index = Arrays.binarySearch(nums,target-nums[i]))>i){
					if(index<i){
						returnArray[0]=index;
						returnArray[1]=i;
					}
					else{
						returnArray[0]=i;
						returnArray[1]=index;
					}
					break;
				}
			}
			return returnArray;*/

			//use hashmap
		int[] returnArray=new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(i,nums[i]);
		}

		for (Entry entry: map.entrySet()) {
			int val = target - (int)entry.getValue();
			if(map.containsValue(val)){
				int index1=(int)entry.getKey();
				int index2;
				List l= map.entrySet().stream().filter(a -> Objects.equals(a.getValue(),val)).map(Map.Entry::getKey).collect(Collectors.toList());
				if((int)l.get(0)==index1)
					 index2= (int)l.get(1);
				else
					index2=(int)l.get(0);

				if(index1<index2){
					returnArray[0]=index1;
					returnArray[1]=index2;
				}
				else{
					returnArray[0]=index2;
					returnArray[1]=index1;
				}


			}

		}
		return returnArray;
	}

	public static int[] twoSum_anotherApproach(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();

		//store num with its corresponding index
		for(int i=0;i<nums.length ;i++){
			map.put(nums[i],i);
		}
		int[] res = null;
		for (int i = 0; i < nums.length ; i++) {
			if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i)
				res = new int[] {map.get(target-nums[i]),i};
		}
		return res;
	}

	public static void main(String[] args){
		int[] arr={3,2,4};
	//	int[] arr2={9,4,9,8,4};
		//System.out.println(Arrays.toString(twoSum(arr,6)));
		System.out.println(Arrays.toString(twoSum_anotherApproach(arr,6)));
	}
}
