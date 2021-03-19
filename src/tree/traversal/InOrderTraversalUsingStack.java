//$Id$
package tree.traversal;

import java.util.Stack;
//root ko dalo, banya root banalo
public class InOrderTraversalUsingStack {
	public static void inorderTraversal(Node root){
		if(root == null)
			return;
		Stack<Node> stack = new Stack<>();
		while(root!=null){
			stack.push(root);
			root = root.left;
			while(root==null && !stack.isEmpty()){
				Node node = stack.pop();
				System.out.print(node.data+" ");
				root = node.right;
			}
		}
	}
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(7);
		inorderTraversal(root);
	}
}
