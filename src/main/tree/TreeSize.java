package tree;

/** Counting the nodes of a binary tree. */
public final class TreeSize {

  private TreeSize() {
    // This class should not be instantiated!
  }

  public static <T> int size(Node<T> node) {
    if (node == null) {
      return 0;  // base case: an empty tree has no nodes
    }
    return 1 + size(node.left) + size(node.right);  // this node, plus each subtree
  }
}
