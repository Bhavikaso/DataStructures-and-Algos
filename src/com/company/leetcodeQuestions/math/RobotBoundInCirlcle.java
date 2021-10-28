package com.company.leetcodeQuestions.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RobotBoundInCirlcle {

		public boolean isRobotBounded(String instructions) {
			List<Coordinates> list = new ArrayList<>();
			int x =0,  y=0;
			Coordinates coordinate = new Coordinates(x,y);
			list.add(coordinate);
			for(int i=0;i<34;i++){
				for(char c :instructions.toCharArray()){
					switch(c){
						case 'G':{
							y=+1;
							break;
						}
						case 'L':{
							x=-1;
							break;
						}
						case 'R':{
							x=+x;
							break;
						}

					} //end switch
					System.out.println("X "+x+ " Y "+y);
					Coordinates new_c = new Coordinates(x,y);
					if(list.contains(new_c))
						return true;
					list.add(new_c);

				} //end inner for
			}// end outer for

			return false;
		}

		class Coordinates{
			int x;
			int y;
			public Coordinates(int x, int y){
				this.x=x;
				this.y=y;
			}

					@Override
					public boolean equals(Object o) {
						if (this == o) return true;
						if (o == null || getClass() != o.getClass()) return false;
						Coordinates that = (Coordinates) o;
						return x == that.x &&
								y == that.y;
					}

			@Override
			public int hashCode() {
				return Objects.hash(x, y);
			}


			}


}
