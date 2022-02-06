package Logic;

import java.util.ArrayList;

import Driver.Node;

public class SkewBST {
	
    static Node prevNode = null;
    static Node headNode = null;

	public static void skewBST(Node root) {

		 if(root == null)
	        {
	            return;
	        }

		 skewBST(root.left);
		 
		 
		 Node rightNode = root.right;
	        Node leftNode = root.left;
	        
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	        
	        skewBST(rightNode);

	}
	
	public static void traverseRightSkewed(Node root) {
	     if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.val + " ");
	        traverseRightSkewed(root.right);       
	 }
}
