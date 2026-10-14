package tree;

/** Measuring the depth of a node in a binary tree. */
public final class TreeDepth {

  private TreeDepth() {
    // This class should not be instantiated!
  }

  // Returns the number of edges from node down to target, or -1 if target is
  // not in the tree rooted at node. Matches target by reference, not by value.
  public static <T> int depth(Node<T> node, Node<T> target) {
    if (node == null) {
      return -1;  // the empty tree does not contain the target
    }
    if (node == target) {
      return 0;  // the target is this node
    }
    int left = depth(node.left, target);
    if (left != -1) {
      return 1 + left;  // found in the left subtree, one edge below this node
    }
    int right = depth(node.right, target);
    if (right != -1) {
      return 1 + right;  // found in the right subtree, one edge below this node
    }
    return -1;  // the target is in neither subtree
  }
}
