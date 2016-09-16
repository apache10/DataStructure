class Node{
	int val;
	Node left;
	Node right;
	Node(int v){
		val=v;
		left=null;
		right=null;
	}
	int getVal(){
		return val;
	}
	Node getLeft(){
		return left;
	}
	Node getRight(){
		return right;
	}
	void setVal(int v){
		val=v;
	}
	void setRight(Node n){
		right=n;
	}
	void setLeft(Node n){
		left=n;
	}
}

class Tree{
	Node root;
	public Tree(){
		root=null;
	}
	public Tree(Node n){
		root=n;
	}
	public Node getRoot(){
		return root;
	}
	public setLeft(Node n,Node left){
		n.setLeft(left);
	}
	public setRight(Node n,Node right){
		n.setRight(right);
	}
	public void printTree(Node curr){
		if(curr==null){
			return;
		}
		System.out.println("" + curr.getVal());
		printTree(curr.getLeft());
		printTree(curr.getRight());
	}
}

class TreeTest {
	public static void main(String args[]){
		Node n=new Node(1);
		Tree t=new Tree(n);
		n=new Node(2);
		t.setLeft(t.getRoot(),n);
		n=new Node(3);
		t.setRight(t.getRoot(),n);
		n=new Node(4);
		t.setLeft(t.getRoot().getLeft(),n);
		n=new Node(5);
		t.setRight(t.getRoot().getRight(),n);
	}
}