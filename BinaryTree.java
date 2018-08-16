package binarytree;

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
	
	Node root;
	
	boolean contains(int key) {
		return contains(root,key);
	}
	
	boolean contains(Node current, int key) {
	 	if(current==null)
	 		return false;
	 	if(current.data==key)
	 		return true;
	 	return (contains(current.left,key) || contains(current.right, key));
	}
	
	
	public static void main(String str[]) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);       
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(5);
        tree.root.left.right.right = new Node(11);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);
        
        boolean exist= tree.contains(11);
        System.out.println(exist);
	}

}
