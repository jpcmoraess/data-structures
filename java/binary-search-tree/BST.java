import java.util.LinkedList;

public class BST {
    public No root;
    public LinkedList<Integer> preorderList = new LinkedList<>();
    public LinkedList<Integer> inorderList = new LinkedList<>();
    public LinkedList<Integer> postorderList = new LinkedList<>();
    public LinkedList<Integer> breadthVisitation = new LinkedList<>();

    public BST() {}

    public void insert(Integer key) {
        this.root = insert(this.root, key);
    }   

    private No insert(No node, Integer key) {
        if (node == null) {
            return new No(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        return node;
    }


    public void delete(Integer key) {
        this.root = delete (this.root, key);
    }

    private No delete(No node, Integer key) {
        if (node == null) {
            return null;
        }
                    
        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            
            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }
                
            No temp = minRight(node);
            node.key = temp.key; 
            node.right = delete(node.right, temp.key);
        }

        return node;
    }

    private No minRight (No node) {
        if (node == null) {
            return null;
        }

        node = node.right;

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }
    
    public void preorder() {
        preorderList.clear();
        preorder(this.root);
    }

    private void preorder(No node) {
        if (node == null) {
            return;
        }

        preorderList.add(node.key);
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder() {
        inorderList.clear();
        inorder(this.root);
    }

    private void inorder(No node) {
        if (node == null) {
            return;
        }
        

        inorder(node.left);
        inorderList.add(node.key);
        inorder(node.right);
    }

    public void postorder() {
        postorderList.clear();
        postorder(this.root);
    }

    private void postorder(No node) {
        if (node == null) {
            return;
        }
        
        postorder(node.left);
        postorder(node.right);
        postorderList.add(node.key);
    }

    public void breadthSearch() {
        breadthVisitation.clear();

        if (root == null) {
            return;
        }
            
        LinkedList<No> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            No current = queue.poll();

            breadthVisitation.add(current.key);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }            
    }
}