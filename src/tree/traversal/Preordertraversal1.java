//$Id$
package tree.traversal;

import java.util.Stack;

public class Preordertraversal1 {
	public static void preOrderTravesal(Node root){
		Stack<Node> s = new Stack<>();
		while(root!=null){
			System.out.println(root.data+" ");
			if(root.right!=null)
				s.push(root.right);
			root= root.left;
			while(root==null&&!s.empty()){
				Node n = s.pop();
				System.out.println(n.data+" ");
				if(n.right!=null)
					s.push(n.right);
				root = n.left;
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
		preOrderTravesal(root);
	}
}
