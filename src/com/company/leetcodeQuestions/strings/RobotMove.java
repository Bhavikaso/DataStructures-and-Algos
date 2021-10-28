package com.company.leetcodeQuestions.strings;

public class RobotMove {

	public boolean judgeCircle(String moves) {
		int[] arr = new int[2];
		for (char c :moves.toCharArray()) {
			switch (c){
				case 'U':
					arr[0]+=1;
					break;
				case 'D':
					arr[0]-=1;
					break;
				case 'L':
					arr[1]-=1;
					break;
				case 'R':
					arr[1]+=1;
					break;
			}
		}

		if(arr[0]==0 && arr[1]==0)
			return true;
		else
			return false;

	}
}
