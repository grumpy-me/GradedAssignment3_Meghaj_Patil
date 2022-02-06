package Driver;

import java.util.List;
import java.util.Scanner;

import Driver.Node;

import Logic.FloorPlan;
import Logic.SkewBST;



public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		int numberOfFloors = scanner.nextInt();
		int[] daywise = new int[numberOfFloors] ;
		for(int i = 0; i < numberOfFloors; i++) {
			System.out.println("enter the floor size given on day" + (i+1)) ;
			daywise[i] = scanner.nextInt();
		}
		
		List<List<Integer>> plan = FloorPlan.output(numberOfFloors, daywise);
		
		for(int i = 0; i < plan.size(); i++) {
			System.out.println("Day:" + (i+1));
			System.out.println(plan.get(i).toString());
		}

		Node rootNode = new Node(50);
		rootNode.left = new Node(30);
		rootNode.right = new Node(60);
		rootNode.left.left = new Node(10);
		rootNode.right.left= new Node(55);
		
		SkewBST.skewBST(rootNode);
		SkewBST.traverseRightSkewed(rootNode);
	}

}
