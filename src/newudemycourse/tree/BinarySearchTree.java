package newudemycourse.tree;

public class BinarySearchTree {

	public BSTNode insertRecurssive(BSTNode root, int data) {

		if (root == null) {
			return new BSTNode(data);
		}

		if (data < root.getData()) {
			root.setLeft(insertRecurssive(root.getLeft(), data));

		} else if (data > root.getData()) {
			root.setRight(insertRecurssive(root.getRight(), data));
		}
		return root;
	}

	public void inOrder(BSTNode node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrder(node.getRight());
		}
	}

	public void preOrder(BSTNode node) {
		if (node != null) {
			System.out.print(" " + node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}

	}

	public void postOrder(BSTNode node) {

		if (node != null) {

			postOrder(node.getLeft());

			postOrder(node.getRight());

			System.out.print(" " + node.getData());

		}
	}

	public BSTNode insert(BSTNode root, int data) {
		return insertRecurssive(root, data);
	}

	public int Max(BSTNode root) {
		int max = 0;
		if (root != null) {
			int lmax = Max(root.getLeft());
			int rmax = Max(root.getRight());

			if (lmax > rmax) {
				max = lmax;

			} else {
				max = rmax;
			}

			if (root.getData() > max) {
				max = root.getData();
			}
		}
		return max;
	}
	
	public boolean Search(BSTNode root,int data) {
		if(root==null) {
			return false;
		}
		
		if(root.getData()==data) {
			return true;
		}
		return Search(root.getLeft(),data) || Search(root.getRight(),data);
		
	}
	
	public int depth(BSTNode root) {
		if(root==null) {
			return 0;
		}
		
		int lDepth=depth(root.getLeft());
		int rDepth=depth(root.getRight());
		
		return (lDepth>rDepth)?lDepth+1:rDepth+1;
		
		
	}
	
	public BSTNode findBST(BSTNode root,int data) {
		if(root==null) {
			return null;
		}
		if(data<root.getData()) {
			return findBST(root.getLeft(),data);
		}else if(data>root.getData()) {
			return findBST(root.getRight(),data);
		}
		return root;
	}
	public BSTNode findMinBST(BSTNode root) {
		if(root==null) {
			return null;
		}else if(root.getLeft()==null) {
			return root; 
		}else {
			return findMinBST(root.getLeft());
		}
		
	}
	public BSTNode findMaxBST(BSTNode root) {
		if(root==null) {
			return null;
		}else if(root.getRight()==null) {
			return root; 
		}else {
			return findMaxBST(root.getRight());
		}
		
	}
	public int size(BSTNode root) {
		int lcount=root.getLeft()==null?0:size(root.getLeft());
		int rcount=root.getLeft()==null?0:size(root.getRight());
		return lcount+rcount+1;
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		BSTNode root = bst.insert(null, 5);
		root = bst.insert(root, 3);
		root = bst.insert(root, 4);
		root = bst.insert(root, 2);
		root = bst.insert(root, 6);
		root = bst.insert(root, 7);
		root = bst.insert(root, 8);
//		bst.inOrder(root);
//		bst.preOrder(root);
//		System.out.println("-----------------");
//		bst.postOrder(root);

		System.out.println("Maximum element is   " + bst.Max(root));
		System.out.println(bst.Search(root, 10));
		System.out.println("Depth is   " + bst.depth(root));
		System.out.println("Size is   " + bst.size(root));
		BSTNode node=bst.findBST(root, 7);
		if(node!=null) {
		System.out.println(node.getData());
		}
		BSTNode node1=bst.findMinBST(root);
		if(node1!=null) {
			System.out.println(node1.getData());
			}
		
		BSTNode node2=bst.findMaxBST(root);
		if(node2!=null) {
			System.out.println(node2.getData());
			}
	}

}
