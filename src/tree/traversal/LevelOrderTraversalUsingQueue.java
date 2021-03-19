//$Id$
package tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueue {
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		traverse(root);
	}
	public static void traverse(Node root){
		if(root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			Node node = queue.poll();
			System.out.print(node.data+" ");
			if(node.left!=null)
				queue.offer(root.left);
			if(node.right!=null)
				queue.offer(root.right);
		}
	}
}