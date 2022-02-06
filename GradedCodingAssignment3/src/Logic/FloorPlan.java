package Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FloorPlan {

	int numberOfFloors;
	int[] order;
	
	public FloorPlan(int numberOfFloors, int[] order) {
		this.numberOfFloors = numberOfFloors;
		this.order = order;
	}
	
	static public List<List<Integer>> output(int numberOfFloors, int[] order) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();
		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>(numberOfFloors); 
		int max = numberOfFloors;
		
		for(int i = 0; i < order.length; i++) {
			map.put(order[i], false);
		}
		
		for(int i = 0; i < order.length; i++) {
			int element = order[i];
			
			map.put(element, true);
			ArrayList<Integer> subList = new ArrayList<Integer>();

			while(element > 0 && map.get(element) == true && element == max ) {
				// append element;
				subList.add(element);
				max = max - 1;
				element = element - 1;
			}
	
			listOfLists.add(subList);
		}
		
		return listOfLists;
		
	}

}
