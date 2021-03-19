//$Id$
package tree.traversal;

public class LevelOrderTraversal {
	public static void traverseLevelOrder(Node root) {
		if(root == null)
			return;
		int h = calculateHeight(root);
		for(int i=1;i<=h;i++){
			printLevel(root, i);
			//System.out.println();
		}
	}

	public static void printLevel(Node root, int level) {
		if(root==null)
			return;
		if(level == 1)
		System.out.print(root.data+ "  ");
		if(level>1){
			printLevel(root.left, level-1);
			printLevel(root.right, level-1);
		}
	}

	public static int calculateHeight(Node root) {
		if (root == null)
			return 0;
		int l = calculateHeight(root.left);
		int r = calculateHeight(root.right);
		return l > r ? 1+l:1+r;
	}
	public static void main(String[] arg){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		traverseLevelOrder(root);
	}
}

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
	}
}
