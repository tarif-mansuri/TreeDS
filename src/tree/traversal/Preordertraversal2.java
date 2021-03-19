//$Id$
package tree.traversal;

import java.util.Stack;
//root ko dalo, nikalo, print, pr, pl
public class Preordertraversal2 {
	public static void preOrderTravesal(Node root){
		if(root==null)
			return;
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!s.isEmpty()){
			Node node = s.pop();
			System.out.println(node.data+" ");
			if(node.right!=null)
				s.push(node.right);
			if(node.left!=null)
				s.push(node.left);
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
		preOrderTravesal(root);
	}
}
