public class MirrorBST extends BST {
    
    public MirrorBST() {
        super();
    }

    public void mirror() {
        this.root = mirror(this.root);
    }

    private No mirror(No node) {
        
        if (node == null) {
            return null;
        }

        No temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);

        return node;
    }
}