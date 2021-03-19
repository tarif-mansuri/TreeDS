//$Id$
package tree.traversal;

import java.util.Stack;
//implemented https://www.youtube.com/watch?v=xLQKdq0Ffjg&t=522s
//do not see his code at last of the lecture, just see working(dry run) and come up with you own solution
public class PostOrderTraversalUsingOneStack {
	public static void traverse(Node root){
		if(root==null)
			return;
		Stack<Node> s = new Stack<Node>();
		while(root!=null||!s.isEmpty()){
			if(root!=null){
				s.push(root);
				root=root.left;
			}
			else if(s.peek().right==null){
				Node n = s.pop();
				System.out.println(n.data+" ");
				while(!s.isEmpty()&&n==s.peek().right){
					n=s.pop();
					System.out.println(n.data+" ");
				}
					
			}else{
				root = s.peek().right;
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
		traverse(root);
	}
}
